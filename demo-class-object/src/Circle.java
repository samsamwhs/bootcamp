import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  private double radius;
  
  //!Constructor
  public Circle(){

  }

  //!All args constructor
  public Circle (double radius){
    this.radius = radius;
  }

  //!getter and setter
  public double getRadius() {
    return this.radius;
  }
  
  public void setRadius (double radius){
    this.radius = radius;
  }

  //getArea (radius * radius * PI)
  public double getArea (){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).setScale(2,RoundingMode.HALF_UP)//
     .multiply(BigDecimal.valueOf(Math.PI)).setScale(2,RoundingMode.HALF_UP).doubleValue();
  }
  //getDiameter
  public double getDiameter (){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(2.0)).setScale(2,RoundingMode.HALF_UP).doubleValue();
  }

  public static void main(String[] args) {
    // c1 1.3
    Circle c1 = new Circle(1.3);
    System.out.println(c1.getArea());//5.31
    System.out.println(c1.getDiameter());//2.6

    //c2 2.8
    Circle c2 = new Circle(2.8);
    System.out.println(c2.getArea());//24.63
    System.out.println(c2.getDiameter());//5.6

    //c3 3.5
    Circle c3 = new Circle(3.5);
    System.out.println(c3.getArea());//38.48
    System.out.println(c3.getDiameter());//7.0

    //Cicle Array
    Circle[] circles = new Circle[] {c1,c2,c3};

    //Loop -> total area
    BigDecimal total = BigDecimal.ZERO;//or use BigDecimal.ONE
    for (Circle x : circles){
      //!total.add(BigDecimal.valueOf(c.getArea())) -> return an new BigDecimal object
      total = total.add(BigDecimal.valueOf(x.getArea())).setScale(2,RoundingMode.HALF_UP);
    }
    System.out.println(total.doubleValue());//68.42
  }
}
