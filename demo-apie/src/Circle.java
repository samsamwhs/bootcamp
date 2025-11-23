import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
  //!by default, child's empty contructor would call Parent's empty constructor
  //write empty constructor in both parent and child class

  private double radius;

  public Circle(){
  //call the empty constructor from Shape
  //super();//no matter write this line or not
  }

  public Circle(double radius, String color){
    super(color);//need to be in first line of the constructor; call parent's constructor
    this.radius=radius;
  }

  public double getRadius(){
    return this.radius;
  }

  //getArea
  public double getArea (){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius))//
     .multiply(BigDecimal.valueOf(Math.PI)).setScale(2,RoundingMode.HALF_UP).doubleValue();
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    Circle c2 = new Circle();

    System.out.println(c1.getColor());//RED
  }
}
