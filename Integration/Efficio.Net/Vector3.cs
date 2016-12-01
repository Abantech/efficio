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

public class Vector3 : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal Vector3(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Vector3 obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Vector3() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioPINVOKE.delete_Vector3(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Vector3() : this(EfficioPINVOKE.new_Vector3__SWIG_0(), true) {
  }

  public Vector3(float x, float y, float z) : this(EfficioPINVOKE.new_Vector3__SWIG_1(x, y, z), true) {
  }

  public float DistanceTo(Vector3 vector2) {
    float ret = EfficioPINVOKE.Vector3_DistanceTo(swigCPtr, Vector3.getCPtr(vector2));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public float X() {
    float ret = EfficioPINVOKE.Vector3_X(swigCPtr);
    return ret;
  }

  public float Y() {
    float ret = EfficioPINVOKE.Vector3_Y(swigCPtr);
    return ret;
  }

  public float Z() {
    float ret = EfficioPINVOKE.Vector3_Z(swigCPtr);
    return ret;
  }

  public static Vector3 Midpoint(Vector3 v1, Vector3 v2) {
    Vector3 ret = new Vector3(EfficioPINVOKE.Vector3_Midpoint(Vector3.getCPtr(v1), Vector3.getCPtr(v2)), true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}