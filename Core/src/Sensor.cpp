#include "Sensor.h"
namespace Efficio
{
	namespace Sensors 
	{
		Sensor::Sensor() : status(Sensors::Status::Uninitialized)
		{
		}

		Status Sensor::GetStatus()
		{
			return status;
		}

		Frame Sensor::Connect()
		{
			Frame frame;

			// Indicate the connection state has changed
			connectionStatusChanged = true;

			// Set the status to "Connecting"
			status = Sensors::Status::Connecting;

			// Add message that the sensor is connecting
			frame.AddEvent(std::shared_ptr<Events::Event>(new Sensors::Connecting(SensorInformation)));

			return frame;
		}

		Frame Sensor::Disconnect()
		{
			Frame frame;

			// Indicate the connection state has changed
			connectionStatusChanged = true;

			// Set the status to "Disconnected"
			status = Sensors::Status::Disconnecting;

			// Add message that the sensor is disconnecting
			frame.AddEvent(std::shared_ptr<Events::Event>(new Sensors::Disonnecting(SensorInformation)));

			return frame;
		}

		Efficio::Frame Sensor::GetFrame()
		{
			Efficio::Frame frame;

			if (IsConnected())
			{
				if (status != Sensors::Status::Connected)
				{
					SetStatus(Sensors::Status::Connected);
				}
			}
			else
			{
				if (status != Sensors::Status::Disconnected)
				{
					SetStatus(Sensors::Status::Disconnected);
				}
			}

			if (connectionStatusChanged)
			{
				switch (status)
				{
				case Efficio::Sensors::Status::Faulted:
					frame.AddEvent(std::shared_ptr<Events::Event>(new Sensors::Faulted(SensorInformation)));
					break;
				case Efficio::Sensors::Status::Connected:
					frame.AddEvent(std::shared_ptr<Events::Event>(new Sensors::Connected(SensorInformation)));
					break;
				case Efficio::Sensors::Status::Disconnected:
					frame.AddEvent(std::shared_ptr<Events::Event>(new Sensors::Disonnected(SensorInformation)));
					break;
				case Efficio::Sensors::Status::Disabled:
				case Efficio::Sensors::Status::Uninitialized:
				case Efficio::Sensors::Status::Unknown:
				case Efficio::Sensors::Status::Connecting:
				case Efficio::Sensors::Status::Disconnecting:
				default:
					break;
				}

				connectionStatusChanged = false;
			}

			// Check if new frame is available. If not, merge previously calculated frame with base frame
			if (!HasFrame())
			{
				frame.AddFrame(LastEfficioFrame);
			}
			else
			{
				// Create temporary frame
				Frame tempFrame;

				tempFrame.AddData(GetData());
				tempFrame.AddEvents(GetEvents());

				LastEfficioFrame = tempFrame;

				frame.AddFrame(tempFrame);
			}

			return frame;
		}

		std::string Sensor::GetSource()
		{
			return SensorInformation.Name;
		}
		SensorInformation Sensor::GetSensorInformation()
		{
			return SensorInformation;
		}

		void Sensor::SetStatus(Sensors::Status status)
		{
			connectionStatusChanged = true;
			Sensor::status = status;
		}
	}
}