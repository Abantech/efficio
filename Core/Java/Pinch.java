/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class Pinch extends DiscreteGesture {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected Pinch(long cPtr, boolean cMemoryOwn) {
    super(EfficioJNI.Pinch_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Pinch obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        EfficioJNI.delete_Pinch(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Pinch(BodySide side, SWIGTYPE_p_Efficio__Body__Finger finger1, SWIGTYPE_p_Efficio__Body__Finger finger2, Vector3 position) {
    this(EfficioJNI.new_Pinch(side.swigValue(), SWIGTYPE_p_Efficio__Body__Finger.getCPtr(finger1), SWIGTYPE_p_Efficio__Body__Finger.getCPtr(finger2), Vector3.getCPtr(position), position), true);
  }

  public void setPosition(Vector3 value) {
    EfficioJNI.Pinch_Position_set(swigCPtr, this, Vector3.getCPtr(value), value);
  }

  public Vector3 getPosition() {
    long cPtr = EfficioJNI.Pinch_Position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

  public void setFinger1(SWIGTYPE_p_Efficio__Body__Finger value) {
    EfficioJNI.Pinch_Finger1_set(swigCPtr, this, SWIGTYPE_p_Efficio__Body__Finger.getCPtr(value));
  }

  public SWIGTYPE_p_Efficio__Body__Finger getFinger1() {
    return new SWIGTYPE_p_Efficio__Body__Finger(EfficioJNI.Pinch_Finger1_get(swigCPtr, this), true);
  }

  public void setFinger2(SWIGTYPE_p_Efficio__Body__Finger value) {
    EfficioJNI.Pinch_Finger2_set(swigCPtr, this, SWIGTYPE_p_Efficio__Body__Finger.getCPtr(value));
  }

  public SWIGTYPE_p_Efficio__Body__Finger getFinger2() {
    return new SWIGTYPE_p_Efficio__Body__Finger(EfficioJNI.Pinch_Finger2_get(swigCPtr, this), true);
  }

  public EventType GetEventType() {
    return EventType.swigToEnum(EfficioJNI.Pinch_GetEventType(swigCPtr, this));
  }

  public void setSide(BodySide value) {
    EfficioJNI.Pinch_Side_set(swigCPtr, this, value.swigValue());
  }

  public BodySide getSide() {
    return BodySide.swigToEnum(EfficioJNI.Pinch_Side_get(swigCPtr, this));
  }

}
