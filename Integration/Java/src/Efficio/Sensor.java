/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public class Sensor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Sensor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Sensor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioRuntimeJNI.delete_Sensor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TrackingType TrackingTypes() {
    return TrackingType.swigToEnum(EfficioRuntimeJNI.Sensor_TrackingTypes(swigCPtr, this));
  }

  public Frame Connect() {
    return new Frame(EfficioRuntimeJNI.Sensor_Connect(swigCPtr, this), true);
  }

  public Frame Disconnect() {
    return new Frame(EfficioRuntimeJNI.Sensor_Disconnect(swigCPtr, this), true);
  }

  public void setID(String value) {
    EfficioRuntimeJNI.Sensor_ID_set(swigCPtr, this, value);
  }

  public String getID() {
    return EfficioRuntimeJNI.Sensor_ID_get(swigCPtr, this);
  }

  public void setEnabled(boolean value) {
    EfficioRuntimeJNI.Sensor_Enabled_set(swigCPtr, this, value);
  }

  public boolean getEnabled() {
    return EfficioRuntimeJNI.Sensor_Enabled_get(swigCPtr, this);
  }

  public Status GetStatus() {
    return Status.swigToEnum(EfficioRuntimeJNI.Sensor_GetStatus(swigCPtr, this));
  }

  public Frame GetFrame() {
    return new Frame(EfficioRuntimeJNI.Sensor_GetFrame(swigCPtr, this), true);
  }

  public String GetSource() {
    return EfficioRuntimeJNI.Sensor_GetSource(swigCPtr, this);
  }

  public SensorInformation GetSensorInformation() {
    return new SensorInformation(EfficioRuntimeJNI.Sensor_GetSensorInformation(swigCPtr, this), true);
  }

}