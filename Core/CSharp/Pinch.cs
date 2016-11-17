//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.10
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace Efficio.Net {

public class Pinch : DiscreteGesture {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal Pinch(global::System.IntPtr cPtr, bool cMemoryOwn) : base(EfficioPINVOKE.Pinch_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Pinch obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Pinch() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          EfficioPINVOKE.delete_Pinch(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public Pinch(BodySide side, SWIGTYPE_p_Efficio__Body__Finger finger1, SWIGTYPE_p_Efficio__Body__Finger finger2, Vector3 position) : this(EfficioPINVOKE.new_Pinch((int)side, SWIGTYPE_p_Efficio__Body__Finger.getCPtr(finger1), SWIGTYPE_p_Efficio__Body__Finger.getCPtr(finger2), Vector3.getCPtr(position)), true) {
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public Vector3 Position {
    set {
      EfficioPINVOKE.Pinch_Position_set(swigCPtr, Vector3.getCPtr(value));
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      global::System.IntPtr cPtr = EfficioPINVOKE.Pinch_Position_get(swigCPtr);
      Vector3 ret = (cPtr == global::System.IntPtr.Zero) ? null : new Vector3(cPtr, false);
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public SWIGTYPE_p_Efficio__Body__Finger Finger1 {
    set {
      EfficioPINVOKE.Pinch_Finger1_set(swigCPtr, SWIGTYPE_p_Efficio__Body__Finger.getCPtr(value));
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      SWIGTYPE_p_Efficio__Body__Finger ret = new SWIGTYPE_p_Efficio__Body__Finger(EfficioPINVOKE.Pinch_Finger1_get(swigCPtr), true);
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public SWIGTYPE_p_Efficio__Body__Finger Finger2 {
    set {
      EfficioPINVOKE.Pinch_Finger2_set(swigCPtr, SWIGTYPE_p_Efficio__Body__Finger.getCPtr(value));
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      SWIGTYPE_p_Efficio__Body__Finger ret = new SWIGTYPE_p_Efficio__Body__Finger(EfficioPINVOKE.Pinch_Finger2_get(swigCPtr), true);
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public override EventType GetEventType() {
    EventType ret = (EventType)EfficioPINVOKE.Pinch_GetEventType(swigCPtr);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public BodySide Side {
    set {
      EfficioPINVOKE.Pinch_Side_set(swigCPtr, (int)value);
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      BodySide ret = (BodySide)EfficioPINVOKE.Pinch_Side_get(swigCPtr);
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

}

}
