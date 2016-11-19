#pragma once

#include "Sensor.h"
#include "Location.h"
#include "LocationSensor.h"

#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif

namespace Efficio
{
	namespace Sensors {
		/// A sample GPS sensor.
		extern class DLLEXPORT SampleGPS : public Efficio::Sensors::LocationSensor {
		public:
			SampleGPS() {};
			~SampleGPS() {};

			/// Gets the asset's current altitude.
			Efficio::Data::Positional::Location GetLocation() { return Efficio::Data::Positional::Location(3, 3); }

			void IDoNothing() {};

			// Inherited via LocationSensor
			virtual Efficio::DeviceStatus Status() override;
			virtual Efficio::TrackingType TrackingTypes() override;
			virtual void Connect() override;
			virtual void Disconnect() override;
			virtual bool HasFrame() override;
			virtual Efficio::Frame GetFrame() override;
		};
	}
}
