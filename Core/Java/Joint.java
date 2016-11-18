/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class Joint {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Joint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Joint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioJNI.delete_Joint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Joint(JointName name, Vector3 position) {
    this(EfficioJNI.new_Joint(name.swigValue(), Vector3.getCPtr(position), position), true);
  }

  public void setName(JointName value) {
    EfficioJNI.Joint_Name_set(swigCPtr, this, value.swigValue());
  }

  public JointName getName() {
    return JointName.swigToEnum(EfficioJNI.Joint_Name_get(swigCPtr, this));
  }

  public void setPosition(Vector3 value) {
    EfficioJNI.Joint_Position_set(swigCPtr, this, Vector3.getCPtr(value), value);
  }

  public Vector3 getPosition() {
    long cPtr = EfficioJNI.Joint_Position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

}