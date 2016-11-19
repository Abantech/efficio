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

  public Joint(Vector3 position, SWIGTYPE_p_JointType type) {
    this(EfficioJNI.new_Joint__SWIG_0(Vector3.getCPtr(position), position, SWIGTYPE_p_JointType.getCPtr(type)), true);
  }

  public Joint(Vector3 position, SWIGTYPE_p_JointType type, float confidence) {
    this(EfficioJNI.new_Joint__SWIG_1(Vector3.getCPtr(position), position, SWIGTYPE_p_JointType.getCPtr(type), confidence), true);
  }

  public Vector3 getPosition() {
    long cPtr = EfficioJNI.Joint_Position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

  public SWIGTYPE_p_JointType getType() {
    return new SWIGTYPE_p_JointType(EfficioJNI.Joint_Type_get(swigCPtr, this), true);
  }

  public float getConfidence() {
    return EfficioJNI.Joint_Confidence_get(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t ProximalJoints(Joint joint) {
    return new SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t(EfficioJNI.Joint_ProximalJoints(swigCPtr, this, Joint.getCPtr(joint), joint), true);
  }

  public SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t DistalJoints(Joint joint) {
    return new SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t(EfficioJNI.Joint_DistalJoints(swigCPtr, this, Joint.getCPtr(joint), joint), true);
  }

}
