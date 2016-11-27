#pragma once

#include "Vector3.h"
#include "Enumerations.h"
#include "EfficioFinger.h"

#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif

//R: every time the Efficio frame gets created, make the hand joint positions updated
//S: view constructor in Frame.cpp
//R: call
//R: use Position(position)
//R: use shared_ptr

//S: Top-down organization:
//lh, rh
//lh1, lh2, lh3, lh4, lh5; rh1, rh2, rh3, rh4, rh5
//joints of the hand: fingers 2 through 5 (nonthumbs)
//Distal interphalangeal: DIP
//Proximal interphilangeal: PIP
//Metacarpophalangeal: MCP
//joints of the hand: finger 1 (thumb)
//Interphalangeal: IP
//Metacarpophalangeal: MCP
//Carpometaparpal: CMC

namespace Efficio
{
	extern class DLLEXPORT FingerJoint
	{
	public:
		FingerJoint(Efficio::Body::FingerJointType jointName);
		Vector3 Position;
		Efficio::Body::FingerJointType JointName;
		//P is position
		~FingerJoint();
	};
/*	extern class DLLEXPORT DIP : public FingerJoint
	{
	public:
		DIP(Vector3 position);
		Vector3 Position;
		~DIP();
	};
	extern class DLLEXPORT PIP : public FingerJoint
	{
	public:
		PIP(Vector3 position);
		Vector3 Position;
		~PIP();
	};
	extern class DLLEXPORT MCP : public FingerJoint
	{
	public:
		MCP(Vector3 position);
		Vector3 Position;
		~MCP();
	};
	extern class DLLEXPORT IP : public FingerJoint
	{
	public:
		IP(Vector3 position);
		Vector3 Position;
		~IP();
	};
	extern class DLLEXPORT CMC : public FingerJoint
	{
	public:
		CMC(Vector3 position);
		Vector3 Position;
		~CMC();
	};

	extern class DLLEXPORT IPCMC : public FingerJoint
	{
	public:
		IPCMC(Vector3 position);
		Vector3 Position;
		~IPCMC();
	};*/
}