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

public class Engine : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal Engine(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Engine obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Engine() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioRuntimePINVOKE.delete_Engine(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Engine() : this(EfficioRuntimePINVOKE.new_Engine(), true) {
  }

  public Frame Start() {
    Frame ret = new Frame(EfficioRuntimePINVOKE.Engine_Start(swigCPtr), true);
    return ret;
  }

  public Frame GetFrame() {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.Engine_GetFrame__SWIG_0(swigCPtr);
    Frame ret = (cPtr == global::System.IntPtr.Zero) ? null : new Frame(cPtr, true);
    return ret;
  }

  public Frame GetFrame(int count) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.Engine_GetFrame__SWIG_1(swigCPtr, count);
    Frame ret = (cPtr == global::System.IntPtr.Zero) ? null : new Frame(cPtr, true);
    return ret;
  }

  public float GetFrameRate() {
    float ret = EfficioRuntimePINVOKE.Engine_GetFrameRate(swigCPtr);
    return ret;
  }

}

}
