/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class Frame {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Frame(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Frame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioRuntimeJNI.delete_Frame(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Frame(Frame previousFrame, int ID) {
    this(EfficioRuntimeJNI.new_Frame__SWIG_0(Frame.getCPtr(previousFrame), previousFrame, ID), true);
  }

  public Frame(Frame previousFrame) {
    this(EfficioRuntimeJNI.new_Frame__SWIG_1(Frame.getCPtr(previousFrame), previousFrame), true);
  }

  public Frame() {
    this(EfficioRuntimeJNI.new_Frame__SWIG_2(), true);
  }

  public DataCollection GetData() {
    return new DataCollection(EfficioRuntimeJNI.Frame_GetData(swigCPtr, this), true);
  }

  public void AddData(DataCollection data) {
    EfficioRuntimeJNI.Frame_AddData(swigCPtr, this, DataCollection.getCPtr(data), data);
  }

  public void AddFrame(Frame frame) {
    EfficioRuntimeJNI.Frame_AddFrame(swigCPtr, this, Frame.getCPtr(frame), frame);
  }

  public EventCollection GetEvents() {
    return new EventCollection(EfficioRuntimeJNI.Frame_GetEvents(swigCPtr, this), true);
  }

  public void AddEvent(Event eventPtr) {
    EfficioRuntimeJNI.Frame_AddEvent(swigCPtr, this, Event.getCPtr(eventPtr), eventPtr);
  }

  public void setTime(SWIGTYPE_p_clock_t value) {
    EfficioRuntimeJNI.Frame_Time_set(swigCPtr, this, SWIGTYPE_p_clock_t.getCPtr(value));
  }

  public SWIGTYPE_p_clock_t getTime() {
    return new SWIGTYPE_p_clock_t(EfficioRuntimeJNI.Frame_Time_get(swigCPtr, this), true);
  }

  public void setDeltaTime(SWIGTYPE_p_clock_t value) {
    EfficioRuntimeJNI.Frame_DeltaTime_set(swigCPtr, this, SWIGTYPE_p_clock_t.getCPtr(value));
  }

  public SWIGTYPE_p_clock_t getDeltaTime() {
    return new SWIGTYPE_p_clock_t(EfficioRuntimeJNI.Frame_DeltaTime_get(swigCPtr, this), true);
  }

  public void setID(int value) {
    EfficioRuntimeJNI.Frame_ID_set(swigCPtr, this, value);
  }

  public int getID() {
    return EfficioRuntimeJNI.Frame_ID_get(swigCPtr, this);
  }

}
