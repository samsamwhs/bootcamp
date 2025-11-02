//!Class author write down the ways to access(read & write) the attribute values
//!Method Definition: Presentation

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dog {
  //!Attribute
  private double weight;
  private double height;

  //!Empty constructor
  public Dog(){

  }

  //!All args constructor
  public Dog(double weight, double height){
    this.weight = weight;
    this.height = height;
  }

  //!different arg constructor, problem: difficult to recognise the object
  //! duplicated: the no. and type of parameter are same, so Java can't recognise

  
  public Dog(double weight){
    this.weight = weight;
  }

  //   public Dog(double height){
  //   this.height = height;
  // }

  //!getter for weight and height
  public double getWeight(){
    return this.weight;
  }
  public double getHeight(){
    return this.height;
  }

  //!A presentation of weight and height
  public double getBmi(){
    BigDecimal heigthSquare = BigDecimal.valueOf(this.height)//
    .multiply(BigDecimal.valueOf(this.height))//
    .setScale(2,RoundingMode.HALF_UP);
    return BigDecimal.valueOf(this.weight)//
    .divide(heigthSquare, 2, RoundingMode.HALF_UP)//
    .doubleValue();
  }

  //!Setter (update attribute values)
  public void setWeight (double weight){
    this.weight = weight;
  }
  public void setHeight (double height){
    this.height = height;
  } 

  //main -> testing
  public static void main(String[] args) {
    //Dog 4.5, 0.3
    Dog d1 = new Dog(4.5,0.3);
    //Dog 5.5, 0.25
    Dog d2 = new Dog(5.5,0.25);

    //get d2's height
    System.out.println(d2.getHeight());
    //get d1's weight
    System.out.println(d1.getWeight());

    Dog d3 = new Dog();
    System.out.println(d3.getHeight());//0.0
    System.out.println(d3.getWeight());//0.0

    System.out.println(d1.getBmi());//50.0
    System.out.println(d2.getBmi());//91.67
  }
}
