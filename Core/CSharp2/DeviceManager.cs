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

public class DeviceManager : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal DeviceManager(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DeviceManager obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~DeviceManager() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioPINVOKE.delete_DeviceManager(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public DeviceManager() : this(EfficioPINVOKE.new_DeviceManager(), true) {
  }

  public void AddDevice(Device device) {
    EfficioPINVOKE.DeviceManager_AddDevice(swigCPtr, Device.getCPtr(device));
  }

  public DeviceCollection GetDevices() {
    DeviceCollection ret = new DeviceCollection(EfficioPINVOKE.DeviceManager_GetDevices(swigCPtr), true);
    return ret;
  }

  public DeviceCollection GetConnectedDevices() {
    DeviceCollection ret = new DeviceCollection(EfficioPINVOKE.DeviceManager_GetConnectedDevices(swigCPtr), true);
    return ret;
  }

  public DeviceCollection GetDevicesWithStatus(DeviceStatus status) {
    DeviceCollection ret = new DeviceCollection(EfficioPINVOKE.DeviceManager_GetDevicesWithStatus(swigCPtr, (int)status), true);
    return ret;
  }

  public Device GetDeviceByID(string ID) {
    global::System.IntPtr cPtr = EfficioPINVOKE.DeviceManager_GetDeviceByID(swigCPtr, ID);
    Device ret = (cPtr == global::System.IntPtr.Zero) ? null : new Device(cPtr, true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void RemoveDevice(string ID) {
    EfficioPINVOKE.DeviceManager_RemoveDevice(swigCPtr, ID);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

}

}