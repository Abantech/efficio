/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public class EfficioRuntimeJNI {
  public final static native void delete_Event(long jarg1);
  public final static native void Event_Time_set(long jarg1, Event jarg1_, long jarg2);
  public final static native long Event_Time_get(long jarg1, Event jarg1_);
  public final static native void Event_ID_set(long jarg1, Event jarg1_, long jarg2);
  public final static native long Event_ID_get(long jarg1, Event jarg1_);
  public final static native void Event_Source_set(long jarg1, Event jarg1_, String jarg2);
  public final static native String Event_Source_get(long jarg1, Event jarg1_);
  public final static native int Event_GetEventType(long jarg1, Event jarg1_);
  public final static native void delete_InternalEvent(long jarg1);
  public final static native int InternalEvent_GetEventType(long jarg1, InternalEvent jarg1_);
  public final static native void delete_SensorEvent(long jarg1);
  public final static native void SensorEvent_SensorInformation_set(long jarg1, SensorEvent jarg1_, long jarg2, SensorInformation jarg2_);
  public final static native long SensorEvent_SensorInformation_get(long jarg1, SensorEvent jarg1_);
  public final static native int SensorEvent_GetEventType(long jarg1, SensorEvent jarg1_);
  public final static native void delete_Gesture(long jarg1);
  public final static native int Gesture_GetGestureType(long jarg1, Gesture jarg1_);
  public final static native int Gesture_GetGestureState(long jarg1, Gesture jarg1_);
  public final static native long Gesture_GetStartTime(long jarg1, Gesture jarg1_);
  public final static native long Gesture_GetGestureDuration(long jarg1, Gesture jarg1_);
  public final static native int Gesture_GetEventType(long jarg1, Gesture jarg1_);
  public final static native void delete_DiscreteGesture(long jarg1);
  public final static native int DiscreteGesture_GetGestureType(long jarg1, DiscreteGesture jarg1_);
  public final static native int DiscreteGesture_GetGestureState(long jarg1, DiscreteGesture jarg1_);
  public final static native long new_Pinch(String jarg1, int jarg2, long jarg3, Finger jarg3_, long jarg4, Finger jarg4_);
  public final static native void delete_Pinch(long jarg1);
  public final static native void Pinch_Position_set(long jarg1, Pinch jarg1_, long jarg2, Vector3 jarg2_);
  public final static native long Pinch_Position_get(long jarg1, Pinch jarg1_);
  public final static native void Pinch_Finger1_set(long jarg1, Pinch jarg1_, long jarg2, Finger jarg2_);
  public final static native long Pinch_Finger1_get(long jarg1, Pinch jarg1_);
  public final static native void Pinch_Finger2_set(long jarg1, Pinch jarg1_, long jarg2, Finger jarg2_);
  public final static native long Pinch_Finger2_get(long jarg1, Pinch jarg1_);
  public final static native int Pinch_GetEventType(long jarg1, Pinch jarg1_);
  public final static native void Pinch_Side_set(long jarg1, Pinch jarg1_, int jarg2);
  public final static native int Pinch_Side_get(long jarg1, Pinch jarg1_);
  public final static native long new_EfficioStarted();
  public final static native void delete_EfficioStarted(long jarg1);
  public final static native int EfficioStarted_GetEventType(long jarg1, EfficioStarted jarg1_);
  public final static native long new_Connecting(long jarg1, SensorInformation jarg1_);
  public final static native void delete_Connecting(long jarg1);
  public final static native int Connecting_GetEventType(long jarg1, Connecting jarg1_);
  public final static native long new_Connected(long jarg1, SensorInformation jarg1_);
  public final static native void delete_Connected(long jarg1);
  public final static native int Connected_GetEventType(long jarg1, Connected jarg1_);
  public final static native long new_Faulted(long jarg1, SensorInformation jarg1_);
  public final static native void delete_Faulted(long jarg1);
  public final static native int Faulted_GetEventType(long jarg1, Faulted jarg1_);
  public final static native long new_Disconnecting(long jarg1, SensorInformation jarg1_);
  public final static native void delete_Disconnecting(long jarg1);
  public final static native int Disconnecting_GetEventType(long jarg1, Disconnecting jarg1_);
  public final static native long new_Disconnected(long jarg1, SensorInformation jarg1_);
  public final static native void delete_Disconnected(long jarg1);
  public final static native int Disconnected_GetEventType(long jarg1, Disconnected jarg1_);
  public final static native long new_ButtonPressed(long jarg1, SensorInformation jarg1_, int jarg2);
  public final static native void delete_ButtonPressed(long jarg1);
  public final static native void ButtonPressed_ButtonType_set(long jarg1, ButtonPressed jarg1_, int jarg2);
  public final static native int ButtonPressed_ButtonType_get(long jarg1, ButtonPressed jarg1_);
  public final static native int ButtonPressed_GetEventType(long jarg1, ButtonPressed jarg1_);
  public final static native long new_Vector3__SWIG_0();
  public final static native long new_Vector3__SWIG_1(float jarg1, float jarg2, float jarg3);
  public final static native void delete_Vector3(long jarg1);
  public final static native float Vector3_DistanceTo(long jarg1, Vector3 jarg1_, long jarg2, Vector3 jarg2_);
  public final static native float Vector3_X(long jarg1, Vector3 jarg1_);
  public final static native float Vector3_Y(long jarg1, Vector3 jarg1_);
  public final static native float Vector3_Z(long jarg1, Vector3 jarg1_);
  public final static native long Vector3_Midpoint(long jarg1, Vector3 jarg1_, long jarg2, Vector3 jarg2_);
  public final static native void delete_Data(long jarg1);
  public final static native int Data_GetDataType(long jarg1, Data jarg1_);
  public final static native long new_Joint__SWIG_0();
  public final static native long new_Joint__SWIG_1(long jarg1, Vector3 jarg1_, int jarg2);
  public final static native long new_Joint__SWIG_2(long jarg1, Vector3 jarg1_, int jarg2, float jarg3);
  public final static native void delete_Joint(long jarg1);
  public final static native void Joint_Valid_set(long jarg1, Joint jarg1_, boolean jarg2);
  public final static native boolean Joint_Valid_get(long jarg1, Joint jarg1_);
  public final static native void Joint_Position_set(long jarg1, Joint jarg1_, long jarg2, Vector3 jarg2_);
  public final static native long Joint_Position_get(long jarg1, Joint jarg1_);
  public final static native void Joint_Type_set(long jarg1, Joint jarg1_, int jarg2);
  public final static native int Joint_Type_get(long jarg1, Joint jarg1_);
  public final static native void Joint_Confidence_set(long jarg1, Joint jarg1_, float jarg2);
  public final static native float Joint_Confidence_get(long jarg1, Joint jarg1_);
  public final static native long Joint_ProximalJoints(long jarg1, Joint jarg1_, long jarg2, Joint jarg2_);
  public final static native long Joint_DistalJoints(long jarg1, Joint jarg1_, long jarg2, Joint jarg2_);
  public final static native float Joint_DistanceTo(long jarg1, Joint jarg1_, long jarg2, Joint jarg2_);
  public final static native long new_Finger__SWIG_0();
  public final static native long new_Finger__SWIG_1(int jarg1, boolean jarg2, float jarg3, long jarg4, Joint jarg4_, long jarg5, Joint jarg5_, long jarg6, Joint jarg6_, long jarg7, Joint jarg7_);
  public final static native void delete_Finger(long jarg1);
  public final static native void Finger_Tip_set(long jarg1, Finger jarg1_, long jarg2, Joint jarg2_);
  public final static native long Finger_Tip_get(long jarg1, Finger jarg1_);
  public final static native void Finger_DIP_set(long jarg1, Finger jarg1_, long jarg2, Joint jarg2_);
  public final static native long Finger_DIP_get(long jarg1, Finger jarg1_);
  public final static native void Finger_MCP_set(long jarg1, Finger jarg1_, long jarg2, Joint jarg2_);
  public final static native long Finger_MCP_get(long jarg1, Finger jarg1_);
  public final static native void Finger_PIP_set(long jarg1, Finger jarg1_, long jarg2, Joint jarg2_);
  public final static native long Finger_PIP_get(long jarg1, Finger jarg1_);
  public final static native void Finger_Valid_set(long jarg1, Finger jarg1_, boolean jarg2);
  public final static native boolean Finger_Valid_get(long jarg1, Finger jarg1_);
  public final static native void Finger_FingerType_set(long jarg1, Finger jarg1_, int jarg2);
  public final static native int Finger_FingerType_get(long jarg1, Finger jarg1_);
  public final static native void Finger_IsExtended_set(long jarg1, Finger jarg1_, boolean jarg2);
  public final static native boolean Finger_IsExtended_get(long jarg1, Finger jarg1_);
  public final static native void Finger_Length_set(long jarg1, Finger jarg1_, float jarg2);
  public final static native float Finger_Length_get(long jarg1, Finger jarg1_);
  public final static native long new_Hand__SWIG_0(int jarg1, long jarg2, FingerCollection jarg2_, float jarg3);
  public final static native long new_Hand__SWIG_1(int jarg1, long jarg2, FingerCollection jarg2_);
  public final static native void delete_Hand(long jarg1);
  public final static native void Hand_Side_set(long jarg1, Hand jarg1_, int jarg2);
  public final static native int Hand_Side_get(long jarg1, Hand jarg1_);
  public final static native void Hand_Confidence_set(long jarg1, Hand jarg1_, float jarg2);
  public final static native float Hand_Confidence_get(long jarg1, Hand jarg1_);
  public final static native void Hand_ID_set(long jarg1, Hand jarg1_, long jarg2);
  public final static native long Hand_ID_get(long jarg1, Hand jarg1_);
  public final static native void Hand_Source_set(long jarg1, Hand jarg1_, String jarg2);
  public final static native String Hand_Source_get(long jarg1, Hand jarg1_);
  public final static native void Hand_Fingers_set(long jarg1, Hand jarg1_, long jarg2, FingerCollection jarg2_);
  public final static native long Hand_Fingers_get(long jarg1, Hand jarg1_);
  public final static native long new_SensorInformation();
  public final static native void delete_SensorInformation(long jarg1);
  public final static native void SensorInformation_Name_set(long jarg1, SensorInformation jarg1_, String jarg2);
  public final static native String SensorInformation_Name_get(long jarg1, SensorInformation jarg1_);
  public final static native long new_Frame__SWIG_0(long jarg1, Frame jarg1_, int jarg2);
  public final static native long new_Frame__SWIG_1(long jarg1, Frame jarg1_);
  public final static native long new_Frame__SWIG_2();
  public final static native void delete_Frame(long jarg1);
  public final static native long Frame_GetData(long jarg1, Frame jarg1_);
  public final static native void Frame_AddData(long jarg1, Frame jarg1_, long jarg2, DataCollection jarg2_);
  public final static native void Frame_AddFrame(long jarg1, Frame jarg1_, long jarg2, Frame jarg2_);
  public final static native long Frame_GetEvents(long jarg1, Frame jarg1_);
  public final static native void Frame_AddEvent(long jarg1, Frame jarg1_, long jarg2, Event jarg2_);
  public final static native void Frame_AddEvents(long jarg1, Frame jarg1_, long jarg2, EventCollection jarg2_);
  public final static native void Frame_Time_set(long jarg1, Frame jarg1_, long jarg2);
  public final static native long Frame_Time_get(long jarg1, Frame jarg1_);
  public final static native void Frame_DeltaTime_set(long jarg1, Frame jarg1_, long jarg2);
  public final static native long Frame_DeltaTime_get(long jarg1, Frame jarg1_);
  public final static native void Frame_ID_set(long jarg1, Frame jarg1_, int jarg2);
  public final static native int Frame_ID_get(long jarg1, Frame jarg1_);
  public final static native long new_Engine();
  public final static native void delete_Engine(long jarg1);
  public final static native long Engine_Start(long jarg1, Engine jarg1_);
  public final static native long Engine_GetFrame__SWIG_0(long jarg1, Engine jarg1_);
  public final static native long Engine_GetFrame__SWIG_1(long jarg1, Engine jarg1_, int jarg2);
  public final static native float Engine_GetFrameRate(long jarg1, Engine jarg1_);
  public final static native void delete_Sensor(long jarg1);
  public final static native int Sensor_TrackingTypes(long jarg1, Sensor jarg1_);
  public final static native long Sensor_Connect(long jarg1, Sensor jarg1_);
  public final static native long Sensor_Disconnect(long jarg1, Sensor jarg1_);
  public final static native void Sensor_ID_set(long jarg1, Sensor jarg1_, String jarg2);
  public final static native String Sensor_ID_get(long jarg1, Sensor jarg1_);
  public final static native void Sensor_Enabled_set(long jarg1, Sensor jarg1_, boolean jarg2);
  public final static native boolean Sensor_Enabled_get(long jarg1, Sensor jarg1_);
  public final static native int Sensor_GetStatus(long jarg1, Sensor jarg1_);
  public final static native long Sensor_GetFrame(long jarg1, Sensor jarg1_);
  public final static native String Sensor_GetSource(long jarg1, Sensor jarg1_);
  public final static native long Sensor_GetSensorInformation(long jarg1, Sensor jarg1_);
  public final static native long new_Asset(String jarg1);
  public final static native void delete_Asset(long jarg1);
  public final static native void Asset_Sensors_set(long jarg1, Asset jarg1_, long jarg2, SensorCollection jarg2_);
  public final static native long Asset_Sensors_get(long jarg1, Asset jarg1_);
  public final static native String Asset_GetName(long jarg1, Asset jarg1_);
  public final static native long new_EventCollection__SWIG_0();
  public final static native long new_EventCollection__SWIG_1(long jarg1);
  public final static native long EventCollection_size(long jarg1, EventCollection jarg1_);
  public final static native long EventCollection_capacity(long jarg1, EventCollection jarg1_);
  public final static native void EventCollection_reserve(long jarg1, EventCollection jarg1_, long jarg2);
  public final static native boolean EventCollection_isEmpty(long jarg1, EventCollection jarg1_);
  public final static native void EventCollection_clear(long jarg1, EventCollection jarg1_);
  public final static native void EventCollection_add(long jarg1, EventCollection jarg1_, long jarg2, Event jarg2_);
  public final static native long EventCollection_get(long jarg1, EventCollection jarg1_, int jarg2);
  public final static native void EventCollection_set(long jarg1, EventCollection jarg1_, int jarg2, long jarg3, Event jarg3_);
  public final static native void delete_EventCollection(long jarg1);
  public final static native long new_SensorCollection__SWIG_0();
  public final static native long new_SensorCollection__SWIG_1(long jarg1);
  public final static native long SensorCollection_size(long jarg1, SensorCollection jarg1_);
  public final static native long SensorCollection_capacity(long jarg1, SensorCollection jarg1_);
  public final static native void SensorCollection_reserve(long jarg1, SensorCollection jarg1_, long jarg2);
  public final static native boolean SensorCollection_isEmpty(long jarg1, SensorCollection jarg1_);
  public final static native void SensorCollection_clear(long jarg1, SensorCollection jarg1_);
  public final static native void SensorCollection_add(long jarg1, SensorCollection jarg1_, long jarg2, Sensor jarg2_);
  public final static native long SensorCollection_get(long jarg1, SensorCollection jarg1_, int jarg2);
  public final static native void SensorCollection_set(long jarg1, SensorCollection jarg1_, int jarg2, long jarg3, Sensor jarg3_);
  public final static native void delete_SensorCollection(long jarg1);
  public final static native long new_GestureCollection__SWIG_0();
  public final static native long new_GestureCollection__SWIG_1(long jarg1);
  public final static native long GestureCollection_size(long jarg1, GestureCollection jarg1_);
  public final static native long GestureCollection_capacity(long jarg1, GestureCollection jarg1_);
  public final static native void GestureCollection_reserve(long jarg1, GestureCollection jarg1_, long jarg2);
  public final static native boolean GestureCollection_isEmpty(long jarg1, GestureCollection jarg1_);
  public final static native void GestureCollection_clear(long jarg1, GestureCollection jarg1_);
  public final static native void GestureCollection_add(long jarg1, GestureCollection jarg1_, long jarg2, Gesture jarg2_);
  public final static native long GestureCollection_get(long jarg1, GestureCollection jarg1_, int jarg2);
  public final static native void GestureCollection_set(long jarg1, GestureCollection jarg1_, int jarg2, long jarg3, Gesture jarg3_);
  public final static native void delete_GestureCollection(long jarg1);
  public final static native long new_DataCollection__SWIG_0();
  public final static native long new_DataCollection__SWIG_1(long jarg1);
  public final static native long DataCollection_size(long jarg1, DataCollection jarg1_);
  public final static native long DataCollection_capacity(long jarg1, DataCollection jarg1_);
  public final static native void DataCollection_reserve(long jarg1, DataCollection jarg1_, long jarg2);
  public final static native boolean DataCollection_isEmpty(long jarg1, DataCollection jarg1_);
  public final static native void DataCollection_clear(long jarg1, DataCollection jarg1_);
  public final static native void DataCollection_add(long jarg1, DataCollection jarg1_, long jarg2, Data jarg2_);
  public final static native long DataCollection_get(long jarg1, DataCollection jarg1_, int jarg2);
  public final static native void DataCollection_set(long jarg1, DataCollection jarg1_, int jarg2, long jarg3, Data jarg3_);
  public final static native void delete_DataCollection(long jarg1);
  public final static native long new_JointCollection__SWIG_0();
  public final static native long new_JointCollection__SWIG_1(long jarg1);
  public final static native long JointCollection_size(long jarg1, JointCollection jarg1_);
  public final static native long JointCollection_capacity(long jarg1, JointCollection jarg1_);
  public final static native void JointCollection_reserve(long jarg1, JointCollection jarg1_, long jarg2);
  public final static native boolean JointCollection_isEmpty(long jarg1, JointCollection jarg1_);
  public final static native void JointCollection_clear(long jarg1, JointCollection jarg1_);
  public final static native void JointCollection_add(long jarg1, JointCollection jarg1_, long jarg2, Joint jarg2_);
  public final static native long JointCollection_get(long jarg1, JointCollection jarg1_, int jarg2);
  public final static native void JointCollection_set(long jarg1, JointCollection jarg1_, int jarg2, long jarg3, Joint jarg3_);
  public final static native void delete_JointCollection(long jarg1);
  public final static native long new_FingerCollection__SWIG_0();
  public final static native long new_FingerCollection__SWIG_1(long jarg1, FingerCollection jarg1_);
  public final static native long FingerCollection_size(long jarg1, FingerCollection jarg1_);
  public final static native boolean FingerCollection_isEmpty(long jarg1, FingerCollection jarg1_);
  public final static native void FingerCollection_fill(long jarg1, FingerCollection jarg1_, long jarg2, Finger jarg2_);
  public final static native long FingerCollection_get(long jarg1, FingerCollection jarg1_, int jarg2);
  public final static native void FingerCollection_set(long jarg1, FingerCollection jarg1_, int jarg2, long jarg3, Finger jarg3_);
  public final static native void delete_FingerCollection(long jarg1);
  public final static native long new_AssetCollection__SWIG_0();
  public final static native long new_AssetCollection__SWIG_1(long jarg1);
  public final static native long AssetCollection_size(long jarg1, AssetCollection jarg1_);
  public final static native long AssetCollection_capacity(long jarg1, AssetCollection jarg1_);
  public final static native void AssetCollection_reserve(long jarg1, AssetCollection jarg1_, long jarg2);
  public final static native boolean AssetCollection_isEmpty(long jarg1, AssetCollection jarg1_);
  public final static native void AssetCollection_clear(long jarg1, AssetCollection jarg1_);
  public final static native void AssetCollection_add(long jarg1, AssetCollection jarg1_, long jarg2, Asset jarg2_);
  public final static native long AssetCollection_get(long jarg1, AssetCollection jarg1_, int jarg2);
  public final static native void AssetCollection_set(long jarg1, AssetCollection jarg1_, int jarg2, long jarg3, Asset jarg3_);
  public final static native void delete_AssetCollection(long jarg1);
  public final static native long InternalEvent_SWIGSmartPtrUpcast(long jarg1);
  public final static native long SensorEvent_SWIGSmartPtrUpcast(long jarg1);
  public final static native long Gesture_SWIGSmartPtrUpcast(long jarg1);
  public final static native long DiscreteGesture_SWIGSmartPtrUpcast(long jarg1);
  public final static native long Pinch_SWIGSmartPtrUpcast(long jarg1);
  public final static native long EfficioStarted_SWIGSmartPtrUpcast(long jarg1);
  public final static native long Connecting_SWIGSmartPtrUpcast(long jarg1);
  public final static native long Connected_SWIGSmartPtrUpcast(long jarg1);
  public final static native long Faulted_SWIGSmartPtrUpcast(long jarg1);
  public final static native long Disconnecting_SWIGSmartPtrUpcast(long jarg1);
  public final static native long Disconnected_SWIGSmartPtrUpcast(long jarg1);
  public final static native long ButtonPressed_SWIGSmartPtrUpcast(long jarg1);
}
