import java.math.BigDecimal;

public class Square extends Shape {
  private double length;

  public Square(double length, String color) {
    super(color);
    this.length = length;
  }

  public double getlength() {
    return this.length;
  }

  public void setlength(double length) {
    this.length = length;
  }

  // !As a child class, you have to implement the getArea logic
  @Override
  public double getArea() {
    return this.length * this.length;
  }

  @Override
  public String toString() {
    return "Square("//
        + "length=" + this.length//
        // +",color=" + super.getColor()//
        // !no need to write this for parent, should write at parent class page
        + "shape=" + super.toString()//
        + ")";
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Square)) {
      return false;
    }
    Square square = (Square) o;
    return this.length == square.getlength()//
        && super.equals(square);
  }



  public static void main(String[] args) {
    // ! Reason to need parent class (inheritance)?
    // 1. share common attribute
    // 2. Shape[], but not only Circle[] or Square[]

    // The type of array can be Parent Class,
    // which allows storing the child object
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(3.5, "RED");
    shapes[1] = new Square(5.0, "ORANGE");
    shapes[2] = new Circle(2.3, "YELLOW");

    // Calculate the total area of all shapes.
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      // ! Java just check if the class has that method, this is looping parent class Shape
      // In other words, Shape (parent) class has no getArea (Orginally)
      // shape.getArea()

      // !After having abstract method in Parent Class,
      total = total.add(BigDecimal.valueOf(shape.getArea()));
    }
    System.out.println(total);// 80.10

    Square s1 = new Square(3.4, "BLACK");
    System.out.println(s1); // Square (length)


  }
}
