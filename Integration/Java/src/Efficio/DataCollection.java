/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public class DataCollection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DataCollection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataCollection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioRuntimeJNI.delete_DataCollection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DataCollection() {
    this(EfficioRuntimeJNI.new_DataCollection__SWIG_0(), true);
  }

  public DataCollection(long n) {
    this(EfficioRuntimeJNI.new_DataCollection__SWIG_1(n), true);
  }

  public long size() {
    return EfficioRuntimeJNI.DataCollection_size(swigCPtr, this);
  }

  public long capacity() {
    return EfficioRuntimeJNI.DataCollection_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    EfficioRuntimeJNI.DataCollection_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return EfficioRuntimeJNI.DataCollection_isEmpty(swigCPtr, this);
  }

  public void clear() {
    EfficioRuntimeJNI.DataCollection_clear(swigCPtr, this);
  }

  public void add(Data x) {
    EfficioRuntimeJNI.DataCollection_add(swigCPtr, this, Data.getCPtr(x), x);
  }

  public Data get(int i) {
    long cPtr = EfficioRuntimeJNI.DataCollection_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Data(cPtr, true);
  }

  public void set(int i, Data val) {
    EfficioRuntimeJNI.DataCollection_set(swigCPtr, this, i, Data.getCPtr(val), val);
  }

}