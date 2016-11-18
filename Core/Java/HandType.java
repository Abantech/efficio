/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public final class HandType {
  public final static HandType LeftHand = new HandType("LeftHand");
  public final static HandType RightHand = new HandType("RightHand");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static HandType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + HandType.class + " with value " + swigValue);
  }

  private HandType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private HandType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private HandType(String swigName, HandType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static HandType[] swigValues = { LeftHand, RightHand };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

