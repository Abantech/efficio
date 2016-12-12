#pragma once

#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif

namespace Efficio
{
	namespace Models
	{
		namespace Body
		{
			/// Enumeration containing the sides of the body
			extern enum class DLLEXPORT BodySide 
			{
				Left,
				Right
			};
		}
	}
}