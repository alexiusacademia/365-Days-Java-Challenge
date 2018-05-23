package Day8;// Problem
// Given the classComplexNumber. Override its methods equals() and hashCode(). The method equals() should compare
// two instances of ComplexNumber by the fields re and im. The method hashCode() must be consistent with your implementation of equals().
//
// Implementation of the method hashCode() returning a constant or not considering a fractional part of re and im, will not be accepted.
import java.util.Objects;

public class ObjectsExercise {
  public static void main (String[] args) {
    ComplexNumber num1 = new ComplexNumber(5.25, 6.31);
    ComplexNumber num2 = new ComplexNumber(5.25, 6.31);
    System.out.println(num1.equals(num2));
  }
}

final class ComplexNumber {
  private final double re;
  private final double im;

  public ComplexNumber(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public double getRe() {
    return re;
  }

  public double getIm() {
    return im;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!ComplexNumber.class.isAssignableFrom(obj.getClass())) {
        return false;
    }
    final ComplexNumber otherNumber = (ComplexNumber)obj;
    if (this.re != otherNumber.re || this.im != otherNumber.im) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.re, this.im);
  }
}
