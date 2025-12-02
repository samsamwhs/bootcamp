import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

  //don't need to be public; public means can be seen in other folder
  abstract double area();

  //T
  public static double totalArea(ArrayList<Shape> shapes){
    double total = 0.0;
    for(Shape shape : shapes){
      total += shape.area();
    }
    return total;
  }
  



  //! For static method of generic
  //! we have to define the range of T (<T extends Shape>)
  //! now can put arraylist of circle (child class) in totalArea2
  public static <T extends Shape> double totalArea2(ArrayList<T> shapes){
        double total = 0.0;
    for(Shape shape : shapes){
      total += shape.area();
    }
    return total;
  }


  public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(3));

    for (Shape shape : shapes){
      System.out.println(shape.area());//28.274333882308138
    }

    System.out.println(totalArea(shapes));//28.274333882308138

    System.out.println(totalArea2(shapes));//28.274333882308138

    //! The difference between totalArea() and  totalArea2()
    ArrayList<Circle> circles = new ArrayList<>(List.of(new Circle(3),new Circle(4)));
    System.out.println(totalArea2(circles));//78.53981633974483
    //System.out.println(totalArea(circles)); 
    //totalArea only can put in arraylist of shape, it is compile time error
    //The design of totalArea2() is more flexible than totalArea()
  }
}