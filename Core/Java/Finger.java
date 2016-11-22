/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class Finger {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Finger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Finger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioJNI.delete_Finger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Finger(SWIGTYPE_p_Efficio__Models__Body__FingerType fingerType, boolean isExtended, float length, Joint tip, Joint dip, Joint mcp, Joint pip) {
    this(EfficioJNI.new_Finger(SWIGTYPE_p_Efficio__Models__Body__FingerType.getCPtr(fingerType), isExtended, length, Joint.getCPtr(tip), tip, Joint.getCPtr(dip), dip, Joint.getCPtr(mcp), mcp, Joint.getCPtr(pip), pip), true);
  }

  public void setTip(Joint value) {
    EfficioJNI.Finger_Tip_set(swigCPtr, this, Joint.getCPtr(value), value);
  }

  public Joint getTip() {
    long cPtr = EfficioJNI.Finger_Tip_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void setDIP(Joint value) {
    EfficioJNI.Finger_DIP_set(swigCPtr, this, Joint.getCPtr(value), value);
  }

  public Joint getDIP() {
    long cPtr = EfficioJNI.Finger_DIP_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void setMCP(Joint value) {
    EfficioJNI.Finger_MCP_set(swigCPtr, this, Joint.getCPtr(value), value);
  }

  public Joint getMCP() {
    long cPtr = EfficioJNI.Finger_MCP_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void setPIP(Joint value) {
    EfficioJNI.Finger_PIP_set(swigCPtr, this, Joint.getCPtr(value), value);
  }

  public Joint getPIP() {
    long cPtr = EfficioJNI.Finger_PIP_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public SWIGTYPE_p_FingerType getFingerType() {
    return new SWIGTYPE_p_FingerType(EfficioJNI.Finger_FingerType_get(swigCPtr, this), true);
  }

  public boolean getIsExtended() {
    return EfficioJNI.Finger_IsExtended_get(swigCPtr, this);
  }

  public float getLength() {
    return EfficioJNI.Finger_Length_get(swigCPtr, this);
  }

}
