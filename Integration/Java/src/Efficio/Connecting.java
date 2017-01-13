/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public class Connecting extends SensorEvent {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected Connecting(long cPtr, boolean cMemoryOwn) {
    super(EfficioRuntimeJNI.Connecting_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Connecting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        EfficioRuntimeJNI.delete_Connecting(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Connecting(SensorInformation details) {
    this(EfficioRuntimeJNI.new_Connecting(SensorInformation.getCPtr(details), details), true);
  }

  public EventType GetEventType() {
    return EventType.swigToEnum(EfficioRuntimeJNI.Connecting_GetEventType(swigCPtr, this));
  }

}
