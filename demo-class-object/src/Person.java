public class Person {

  //Attribute
  private Eye[] eyes;

  //!Constructor
  //API"E" (Encapsulation)
  public Person() {
    this.eyes = new Eye[2]; //!Array Object
    this.eyes[0] = new Eye("BLACK");
    this.eyes[1] = new Eye("BLACK");
  }

//void -> nothing to return
  public void changeRightEyeColor (String color){
    this.eyes[1].setColor(color);
  }


  //setter
  public void setLeftEye(Eye eye){
    this.eyes[0] = eye;
  }
  public void setRightEye(Eye eye){
    this.eyes[1] = eye;
  }
  //getter
  public Eye getLeftEye(){ 
    return this.eyes[0];
  }

  public Eye getRightEye(){ 
    return this.eyes[1];
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    Eye e1 = new Eye("RED");
    p1.setLeftEye(e1); 

    //set an new eye object with color "YELLOW" for p1
    p1.setLeftEye(new Eye("YELLOW"));
    
    //!writing a bug here, shouldn't have 2 ways to set the color of eye
    e1.setColor("ORANGE");

    System.out.println(p1.getLeftEye().getColor());//"YELLOW"
    System.out.println(e1.getColor());//"ORANGE"

    p1.changeRightEyeColor("PINK");
    System.out.println(p1.getRightEye().getColor());
  }
}