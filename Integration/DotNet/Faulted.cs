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

public class Faulted : SensorEvent {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal Faulted(global::System.IntPtr cPtr, bool cMemoryOwn) : base(EfficioRuntimePINVOKE.Faulted_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Faulted obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Faulted() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          EfficioRuntimePINVOKE.delete_Faulted(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public Faulted(SensorInformation details) : this(EfficioRuntimePINVOKE.new_Faulted(SensorInformation.getCPtr(details)), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public override EventType GetEventType() {
    EventType ret = (EventType)EfficioRuntimePINVOKE.Faulted_GetEventType(swigCPtr);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
