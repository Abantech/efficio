#include "Connecting.h"

namespace Efficio
{
	Connecting::Connecting(Efficio::SensorInformation details) : SensorEvent(details)
	{
	}
	Connecting::~Connecting()
	{
	}
	std::string Connecting::GetEventType()
	{
		return "SensorConnecting";
	}
}