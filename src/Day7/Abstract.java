package Day7;// Problem
// You have the abstract class Shape with two abstract methods: getPerimeter() and getArea(). See the provided code template.
// You need to declare and implement three classes: Triangle, Rectangle and Circle.
// The classes must extend the Shape class and implement all abstract methods. To implement the methods the standard class
// Math may help you. Do not make your classes public.
// The class Triangle must have a constructor with three double arguments for setting the length of each side.
// To calculate the area of this shape you may use the Heron's formula.
//
// The class Rectangle must have a constructor with two double arguments for setting the length of different sides.
//
// The class Circle must have a constructor with one double argument for setting the radius. You may use Math.PI as the PI constant or declare it yourself.

public class Abstract {
  public static void main(String[] args) {

  }
}

abstract class Shape {

  abstract double getPerimeter();

  abstract double getArea();
}

class Triangle extends Shape {
   protected double a, b, c;
   public Triangle(double a, double b, double c) {
     this.a = a;
     this.b = b;
     this.c = c;
   }
   public double getPerimeter() {
     return this.a + this.b + this.c;
   }

   public double getArea() {
     double p = (a + b + c) / 2;
     double area = p * (p-a) * (p-b) * (p-c);
     area = Math.sqrt(area);
     return area;
   }
}

class Rectangle extends Shape {
   protected double width;
   protected double length;

   public Rectangle(double width, double length) {
     this.width = width;
     this.length = length;
   }

   public double getPerimeter() {
     return (this.width + this.length) * 2;
   }

   public double getArea() {
      return this.width * this.length;
   }
}

class Circle extends Shape {
   protected double radius;

   public Circle(double radius) {
     this.radius = radius;
   }

   public double getPerimeter() {
     return 2 * Math.PI * this.radius;
   }

   public double getArea() {
     return Math.PI * Math.pow(this.radius, 2);
   }
}
