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

public class DeviceCollection : global::System.IDisposable, global::System.Collections.IEnumerable
    , global::System.Collections.Generic.IEnumerable<Device>
 {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal DeviceCollection(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DeviceCollection obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~DeviceCollection() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioPINVOKE.delete_DeviceCollection(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public DeviceCollection(global::System.Collections.ICollection c) : this() {
    if (c == null)
      throw new global::System.ArgumentNullException("c");
    foreach (Device element in c) {
      this.Add(element);
    }
  }

  public bool IsFixedSize {
    get {
      return false;
    }
  }

  public bool IsReadOnly {
    get {
      return false;
    }
  }

  public Device this[int index]  {
    get {
      return getitem(index);
    }
    set {
      setitem(index, value);
    }
  }

  public int Capacity {
    get {
      return (int)capacity();
    }
    set {
      if (value < size())
        throw new global::System.ArgumentOutOfRangeException("Capacity");
      reserve((uint)value);
    }
  }

  public int Count {
    get {
      return (int)size();
    }
  }

  public bool IsSynchronized {
    get {
      return false;
    }
  }

  public void CopyTo(Device[] array)
  {
    CopyTo(0, array, 0, this.Count);
  }

  public void CopyTo(Device[] array, int arrayIndex)
  {
    CopyTo(0, array, arrayIndex, this.Count);
  }

  public void CopyTo(int index, Device[] array, int arrayIndex, int count)
  {
    if (array == null)
      throw new global::System.ArgumentNullException("array");
    if (index < 0)
      throw new global::System.ArgumentOutOfRangeException("index", "Value is less than zero");
    if (arrayIndex < 0)
      throw new global::System.ArgumentOutOfRangeException("arrayIndex", "Value is less than zero");
    if (count < 0)
      throw new global::System.ArgumentOutOfRangeException("count", "Value is less than zero");
    if (array.Rank > 1)
      throw new global::System.ArgumentException("Multi dimensional array.", "array");
    if (index+count > this.Count || arrayIndex+count > array.Length)
      throw new global::System.ArgumentException("Number of elements to copy is too large.");
    for (int i=0; i<count; i++)
      array.SetValue(getitemcopy(index+i), arrayIndex+i);
  }

  global::System.Collections.Generic.IEnumerator<Device> global::System.Collections.Generic.IEnumerable<Device>.GetEnumerator() {
    return new DeviceCollectionEnumerator(this);
  }

  global::System.Collections.IEnumerator global::System.Collections.IEnumerable.GetEnumerator() {
    return new DeviceCollectionEnumerator(this);
  }

  public DeviceCollectionEnumerator GetEnumerator() {
    return new DeviceCollectionEnumerator(this);
  }

  // Type-safe enumerator
  /// Note that the IEnumerator documentation requires an InvalidOperationException to be thrown
  /// whenever the collection is modified. This has been done for changes in the size of the
  /// collection but not when one of the elements of the collection is modified as it is a bit
  /// tricky to detect unmanaged code that modifies the collection under our feet.
  public sealed class DeviceCollectionEnumerator : global::System.Collections.IEnumerator
    , global::System.Collections.Generic.IEnumerator<Device>
  {
    private DeviceCollection collectionRef;
    private int currentIndex;
    private object currentObject;
    private int currentSize;

    public DeviceCollectionEnumerator(DeviceCollection collection) {
      collectionRef = collection;
      currentIndex = -1;
      currentObject = null;
      currentSize = collectionRef.Count;
    }

    // Type-safe iterator Current
    public Device Current {
      get {
        if (currentIndex == -1)
          throw new global::System.InvalidOperationException("Enumeration not started.");
        if (currentIndex > currentSize - 1)
          throw new global::System.InvalidOperationException("Enumeration finished.");
        if (currentObject == null)
          throw new global::System.InvalidOperationException("Collection modified.");
        return (Device)currentObject;
      }
    }

    // Type-unsafe IEnumerator.Current
    object global::System.Collections.IEnumerator.Current {
      get {
        return Current;
      }
    }

    public bool MoveNext() {
      int size = collectionRef.Count;
      bool moveOkay = (currentIndex+1 < size) && (size == currentSize);
      if (moveOkay) {
        currentIndex++;
        currentObject = collectionRef[currentIndex];
      } else {
        currentObject = null;
      }
      return moveOkay;
    }

    public void Reset() {
      currentIndex = -1;
      currentObject = null;
      if (collectionRef.Count != currentSize) {
        throw new global::System.InvalidOperationException("Collection modified.");
      }
    }

    public void Dispose() {
        currentIndex = -1;
        currentObject = null;
    }
  }

  public void Clear() {
    EfficioPINVOKE.DeviceCollection_Clear(swigCPtr);
  }

  public void Add(Device x) {
    EfficioPINVOKE.DeviceCollection_Add(swigCPtr, Device.getCPtr(x));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  private uint size() {
    uint ret = EfficioPINVOKE.DeviceCollection_size(swigCPtr);
    return ret;
  }

  private uint capacity() {
    uint ret = EfficioPINVOKE.DeviceCollection_capacity(swigCPtr);
    return ret;
  }

  private void reserve(uint n) {
    EfficioPINVOKE.DeviceCollection_reserve(swigCPtr, n);
  }

  public DeviceCollection() : this(EfficioPINVOKE.new_DeviceCollection__SWIG_0(), true) {
  }

  public DeviceCollection(DeviceCollection other) : this(EfficioPINVOKE.new_DeviceCollection__SWIG_1(DeviceCollection.getCPtr(other)), true) {
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public DeviceCollection(int capacity) : this(EfficioPINVOKE.new_DeviceCollection__SWIG_2(capacity), true) {
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  private Device getitemcopy(int index) {
    global::System.IntPtr cPtr = EfficioPINVOKE.DeviceCollection_getitemcopy(swigCPtr, index);
    Device ret = (cPtr == global::System.IntPtr.Zero) ? null : new Device(cPtr, true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  private Device getitem(int index) {
    global::System.IntPtr cPtr = EfficioPINVOKE.DeviceCollection_getitem(swigCPtr, index);
    Device ret = (cPtr == global::System.IntPtr.Zero) ? null : new Device(cPtr, true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  private void setitem(int index, Device val) {
    EfficioPINVOKE.DeviceCollection_setitem(swigCPtr, index, Device.getCPtr(val));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public void AddRange(DeviceCollection values) {
    EfficioPINVOKE.DeviceCollection_AddRange(swigCPtr, DeviceCollection.getCPtr(values));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public DeviceCollection GetRange(int index, int count) {
    global::System.IntPtr cPtr = EfficioPINVOKE.DeviceCollection_GetRange(swigCPtr, index, count);
    DeviceCollection ret = (cPtr == global::System.IntPtr.Zero) ? null : new DeviceCollection(cPtr, true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void Insert(int index, Device x) {
    EfficioPINVOKE.DeviceCollection_Insert(swigCPtr, index, Device.getCPtr(x));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public void InsertRange(int index, DeviceCollection values) {
    EfficioPINVOKE.DeviceCollection_InsertRange(swigCPtr, index, DeviceCollection.getCPtr(values));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public void RemoveAt(int index) {
    EfficioPINVOKE.DeviceCollection_RemoveAt(swigCPtr, index);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public void RemoveRange(int index, int count) {
    EfficioPINVOKE.DeviceCollection_RemoveRange(swigCPtr, index, count);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public static DeviceCollection Repeat(Device value, int count) {
    global::System.IntPtr cPtr = EfficioPINVOKE.DeviceCollection_Repeat(Device.getCPtr(value), count);
    DeviceCollection ret = (cPtr == global::System.IntPtr.Zero) ? null : new DeviceCollection(cPtr, true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void Reverse() {
    EfficioPINVOKE.DeviceCollection_Reverse__SWIG_0(swigCPtr);
  }

  public void Reverse(int index, int count) {
    EfficioPINVOKE.DeviceCollection_Reverse__SWIG_1(swigCPtr, index, count);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public void SetRange(int index, DeviceCollection values) {
    EfficioPINVOKE.DeviceCollection_SetRange(swigCPtr, index, DeviceCollection.getCPtr(values));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

}

}