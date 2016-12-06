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

public class Frame : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnBase;

  internal Frame(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwnBase = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Frame obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Frame() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnBase) {
          swigCMemOwnBase = false;
          EfficioRuntimePINVOKE.delete_Frame(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Frame(Frame previousFrame, int ID) : this(EfficioRuntimePINVOKE.new_Frame__SWIG_0(Frame.getCPtr(previousFrame), ID), true) {
  }

  public Frame(Frame previousFrame) : this(EfficioRuntimePINVOKE.new_Frame__SWIG_1(Frame.getCPtr(previousFrame)), true) {
  }

  public Frame() : this(EfficioRuntimePINVOKE.new_Frame__SWIG_2(), true) {
  }

  public DataCollection GetData() {
    DataCollection ret = new DataCollection(EfficioRuntimePINVOKE.Frame_GetData(swigCPtr), true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void AddData(DataCollection data) {
    EfficioRuntimePINVOKE.Frame_AddData(swigCPtr, DataCollection.getCPtr(data));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void AddFrame(Frame frame) {
    EfficioRuntimePINVOKE.Frame_AddFrame(swigCPtr, Frame.getCPtr(frame));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public EventCollection GetEvents() {
    EventCollection ret = new EventCollection(EfficioRuntimePINVOKE.Frame_GetEvents(swigCPtr), true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void AddEvent(Event eventPtr) {
    EfficioRuntimePINVOKE.Frame_AddEvent(swigCPtr, Event.getCPtr(eventPtr));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public SWIGTYPE_p_clock_t Time {
    set {
      EfficioRuntimePINVOKE.Frame_Time_set(swigCPtr, SWIGTYPE_p_clock_t.getCPtr(value));
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      SWIGTYPE_p_clock_t ret = new SWIGTYPE_p_clock_t(EfficioRuntimePINVOKE.Frame_Time_get(swigCPtr), true);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public SWIGTYPE_p_clock_t DeltaTime {
    set {
      EfficioRuntimePINVOKE.Frame_DeltaTime_set(swigCPtr, SWIGTYPE_p_clock_t.getCPtr(value));
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      SWIGTYPE_p_clock_t ret = new SWIGTYPE_p_clock_t(EfficioRuntimePINVOKE.Frame_DeltaTime_get(swigCPtr), true);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public int ID {
    set {
      EfficioRuntimePINVOKE.Frame_ID_set(swigCPtr, value);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      int ret = EfficioRuntimePINVOKE.Frame_ID_get(swigCPtr);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

}

}
