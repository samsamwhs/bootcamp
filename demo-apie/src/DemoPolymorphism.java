public class DemoPolymorphism {
  

  public static void main(String[] args) {
    
    //Complie Time (java file -> class file)
    //Main Purpose of Parent Class/ Interface -> Polymorphism

    Shape shape1 = new Circle(3.4, "RED");
    System.out.println(shape1.getArea()); //getArea is abstract method, getArea is in Shape 

  //! Follow the reference type (Shape) to determine if the method can be called

  //(Circle)shape1.getArea2() to override the risk and put shape to Circle type
  //we can avoid the risk by using "instanceOf"

  //Advantages

  Shape [] shapes = new Shape[2];
  shapes[0] = new Circle(3.2,"WHITE");
  shapes[1] = new Square(3.2,"YELLOW");
  //!The area calculation is decoupled. Open-Closed
  double total = 0.0;
  for (Shape shape: shapes){
    total += shape.getArea();
  }
  System.out.println(total);

    //Run Time
    //! shape.getArea()-> runtime polymorphism

    
  }
}
