

public abstract class Shape {
  
  //!1.not allow to create object 
  //a parent class to hold attributes only
  //!2. Abstract Class allows abstract method

  private String color; //If the object has no color, then the object won't be a shape.

  // constructor, getter, setter

  //!constructor is for child class
  public Shape(){
    System.out.println("Shape's empty constructor");
  }

  public Shape (String color){
    System.out.println("Shape's all args constructor");
    this.color = color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  //! Abstract method: don't need to present the logic at this moment
  //! logic need to present in child class since there is an abstract method in parent class
  public abstract double getArea();




  //!Parent Class can be return type of a method
  public static Shape getShape(int value){
    if (value == 1){
      return new Square(1.0, "WHITE");
    }else if(value == 2){
      return new Circle(2.5,"WHITE");
    }
    return null;
    }
  }





