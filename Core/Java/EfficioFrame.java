/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class EfficioFrame extends Frame {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected EfficioFrame(long cPtr, boolean cMemoryOwn) {
    super(EfficioJNI.EfficioFrame_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EfficioFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        EfficioJNI.delete_EfficioFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setHands(SWIGTYPE_p_std__vectorT_std__shared_ptrT_Efficio__Body__Hand_t_t value) {
    EfficioJNI.EfficioFrame_Hands_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__shared_ptrT_Efficio__Body__Hand_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_std__shared_ptrT_Efficio__Body__Hand_t_t getHands() {
    long cPtr = EfficioJNI.EfficioFrame_Hands_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_std__shared_ptrT_Efficio__Body__Hand_t_t(cPtr, false);
  }

  public void setEvents(EventCollection value) {
    EfficioJNI.EfficioFrame_events_set(swigCPtr, this, EventCollection.getCPtr(value), value);
  }

  public EventCollection getEvents() {
    long cPtr = EfficioJNI.EfficioFrame_events_get(swigCPtr, this);
    return (cPtr == 0) ? null : new EventCollection(cPtr, false);
  }

  public void setID(int value) {
    EfficioJNI.EfficioFrame_ID_set(swigCPtr, this, value);
  }

  public int getID() {
    return EfficioJNI.EfficioFrame_ID_get(swigCPtr, this);
  }

  public EfficioFrame(int ID) {
    this(EfficioJNI.new_EfficioFrame(ID), true);
  }

  public EventCollection GetEvents() {
    return new EventCollection(EfficioJNI.EfficioFrame_GetEvents(swigCPtr, this), true);
  }

  public void AddEvent(Event eventPtr) {
    EfficioJNI.EfficioFrame_AddEvent(swigCPtr, this, Event.getCPtr(eventPtr), eventPtr);
  }

}
