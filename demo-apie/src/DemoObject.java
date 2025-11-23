public class DemoObject {
  
  public static void main(String[] args) {
    //! Parent vs Child
    //! Child Object can be assigned to Parent Object reference
    
    //Example
    String s = "hello"; //"hello" -> String Object 
    Object o1 = "hello";
    Object o2 = new Warrior();//Object is parent of all class,原始祖先
    Shape sh1 = new Circle();//Circle extended Shape

    //Student stu = "hello"; Student object reference cannot store String object

    Object[] things = new Object[3];
    things[0] = new Warrior();
    things[1] = new String(); 
    things[2] = new Square(3.4, "BLUE");

    //!Polymorphism 
    //Square -> area
    //things[2].getArea(); //!runtime OK, but cannot pass through the complie time
    //error: Object reference type cannot indicate the object value type,
    //so that parent class cannot use child class method

    //Complie Time (The time you writing the code)
    Square sq1 = new Square(3.4, "BLUE");
    sq1.getArea();

    //Shape is an abstract class
    //Object.class -> Shape.class -> Circle.class

  }
}
