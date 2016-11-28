#include "HandRecognitionProcessor.h"
#include "HandData.h"

#include "PinchDetector.h"

namespace Efficio
{
	namespace InputRecognition
	{
		namespace Body
		{
			HandRecognitionProcessor::HandRecognitionProcessor() : singleHandDetectors()
			{
				singleHandDetectors.push_back(std::shared_ptr<Hands::SingleHandGestureDetector>(new Hands::PinchDetector()));
			}
			HandRecognitionProcessor::~HandRecognitionProcessor()
			{
			}
			std::vector<std::shared_ptr<Events::Event>> HandRecognitionProcessor::DetectEvents(Frame frame)
			{
				std::vector<std::shared_ptr<Events::Event>> events;

				// TODO detect events
				auto data = frame.GetDataOfType(Data::DataType::Hand);

				if (data.size() > 0)
				{
					for each (std::shared_ptr<Data::Data> datum in data)
					{
						auto handData = dynamic_cast<Data::Body::HandData*>(datum.get());
						
						for each (auto hand in handData->Hands)
						{
							for each (std::shared_ptr<Hands::SingleHandGestureDetector> shgd in singleHandDetectors)
							{
								auto detected = shgd->Detect(hand);

								for (size_t i = 0; i < detected.size(); i++)
								{
									events.push_back(detected[i]);
								}
							}
						}
					}
				}

				return events;
			}

			Efficio::Data::DataType HandRecognitionProcessor::GetDataType()
			{
				return Efficio::Data::DataType::Hand;
			}
		}
	}
}