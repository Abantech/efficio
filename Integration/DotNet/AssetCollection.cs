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

public class AssetCollection : global::System.IDisposable, global::System.Collections.IEnumerable
    , global::System.Collections.Generic.IEnumerable<Asset>
 {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal AssetCollection(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(AssetCollection obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~AssetCollection() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioRuntimePINVOKE.delete_AssetCollection(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public AssetCollection(global::System.Collections.ICollection c) : this() {
    if (c == null)
      throw new global::System.ArgumentNullException("c");
    foreach (Asset element in c) {
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

  public Asset this[int index]  {
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

  public void CopyTo(Asset[] array)
  {
    CopyTo(0, array, 0, this.Count);
  }

  public void CopyTo(Asset[] array, int arrayIndex)
  {
    CopyTo(0, array, arrayIndex, this.Count);
  }

  public void CopyTo(int index, Asset[] array, int arrayIndex, int count)
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

  global::System.Collections.Generic.IEnumerator<Asset> global::System.Collections.Generic.IEnumerable<Asset>.GetEnumerator() {
    return new AssetCollectionEnumerator(this);
  }

  global::System.Collections.IEnumerator global::System.Collections.IEnumerable.GetEnumerator() {
    return new AssetCollectionEnumerator(this);
  }

  public AssetCollectionEnumerator GetEnumerator() {
    return new AssetCollectionEnumerator(this);
  }

  // Type-safe enumerator
  /// Note that the IEnumerator documentation requires an InvalidOperationException to be thrown
  /// whenever the collection is modified. This has been done for changes in the size of the
  /// collection but not when one of the elements of the collection is modified as it is a bit
  /// tricky to detect unmanaged code that modifies the collection under our feet.
  public sealed class AssetCollectionEnumerator : global::System.Collections.IEnumerator
    , global::System.Collections.Generic.IEnumerator<Asset>
  {
    private AssetCollection collectionRef;
    private int currentIndex;
    private object currentObject;
    private int currentSize;

    public AssetCollectionEnumerator(AssetCollection collection) {
      collectionRef = collection;
      currentIndex = -1;
      currentObject = null;
      currentSize = collectionRef.Count;
    }

    // Type-safe iterator Current
    public Asset Current {
      get {
        if (currentIndex == -1)
          throw new global::System.InvalidOperationException("Enumeration not started.");
        if (currentIndex > currentSize - 1)
          throw new global::System.InvalidOperationException("Enumeration finished.");
        if (currentObject == null)
          throw new global::System.InvalidOperationException("Collection modified.");
        return (Asset)currentObject;
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
    EfficioRuntimePINVOKE.AssetCollection_Clear(swigCPtr);
  }

  public void Add(Asset x) {
    EfficioRuntimePINVOKE.AssetCollection_Add(swigCPtr, Asset.getCPtr(x));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  private uint size() {
    uint ret = EfficioRuntimePINVOKE.AssetCollection_size(swigCPtr);
    return ret;
  }

  private uint capacity() {
    uint ret = EfficioRuntimePINVOKE.AssetCollection_capacity(swigCPtr);
    return ret;
  }

  private void reserve(uint n) {
    EfficioRuntimePINVOKE.AssetCollection_reserve(swigCPtr, n);
  }

  public AssetCollection() : this(EfficioRuntimePINVOKE.new_AssetCollection__SWIG_0(), true) {
  }

  public AssetCollection(AssetCollection other) : this(EfficioRuntimePINVOKE.new_AssetCollection__SWIG_1(AssetCollection.getCPtr(other)), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public AssetCollection(int capacity) : this(EfficioRuntimePINVOKE.new_AssetCollection__SWIG_2(capacity), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  private Asset getitemcopy(int index) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.AssetCollection_getitemcopy(swigCPtr, index);
    Asset ret = (cPtr == global::System.IntPtr.Zero) ? null : new Asset(cPtr, true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  private Asset getitem(int index) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.AssetCollection_getitem(swigCPtr, index);
    Asset ret = (cPtr == global::System.IntPtr.Zero) ? null : new Asset(cPtr, true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  private void setitem(int index, Asset val) {
    EfficioRuntimePINVOKE.AssetCollection_setitem(swigCPtr, index, Asset.getCPtr(val));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void AddRange(AssetCollection values) {
    EfficioRuntimePINVOKE.AssetCollection_AddRange(swigCPtr, AssetCollection.getCPtr(values));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public AssetCollection GetRange(int index, int count) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.AssetCollection_GetRange(swigCPtr, index, count);
    AssetCollection ret = (cPtr == global::System.IntPtr.Zero) ? null : new AssetCollection(cPtr, true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void Insert(int index, Asset x) {
    EfficioRuntimePINVOKE.AssetCollection_Insert(swigCPtr, index, Asset.getCPtr(x));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void InsertRange(int index, AssetCollection values) {
    EfficioRuntimePINVOKE.AssetCollection_InsertRange(swigCPtr, index, AssetCollection.getCPtr(values));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void RemoveAt(int index) {
    EfficioRuntimePINVOKE.AssetCollection_RemoveAt(swigCPtr, index);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void RemoveRange(int index, int count) {
    EfficioRuntimePINVOKE.AssetCollection_RemoveRange(swigCPtr, index, count);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public static AssetCollection Repeat(Asset value, int count) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.AssetCollection_Repeat(Asset.getCPtr(value), count);
    AssetCollection ret = (cPtr == global::System.IntPtr.Zero) ? null : new AssetCollection(cPtr, true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void Reverse() {
    EfficioRuntimePINVOKE.AssetCollection_Reverse__SWIG_0(swigCPtr);
  }

  public void Reverse(int index, int count) {
    EfficioRuntimePINVOKE.AssetCollection_Reverse__SWIG_1(swigCPtr, index, count);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void SetRange(int index, AssetCollection values) {
    EfficioRuntimePINVOKE.AssetCollection_SetRange(swigCPtr, index, AssetCollection.getCPtr(values));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

}

}
