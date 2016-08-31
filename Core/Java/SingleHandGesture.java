/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class SingleHandGesture {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SingleHandGesture(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SingleHandGesture obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioJNI.delete_SingleHandGesture(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SingleHandGesture(BodySide side) {
    this(EfficioJNI.new_SingleHandGesture(side.swigValue()), true);
  }

  public void setSide(BodySide value) {
    EfficioJNI.SingleHandGesture_Side_set(swigCPtr, this, value.swigValue());
  }

  public BodySide getSide() {
    return BodySide.swigToEnum(EfficioJNI.SingleHandGesture_Side_get(swigCPtr, this));
  }

}