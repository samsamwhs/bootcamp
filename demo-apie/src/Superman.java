//! class only can extend once, but can implement multiple interfaces

public class Superman extends Human implements Flyable, Eatable {


  // !default empty constructor will be void
  // !when you write a constructor explicitly
  // !which implies that you don't need the default empty constructor
  public Superman(double weight, double heigth) {
    super(weight, heigth);
  }



  // must be verb,
  // when implements Flyable, need to explain fly 
  @Override
  public void fly() {
    System.out.println("Superman is flying...");
  }

  @Override
  public void eat(){
    System.out.println("Superman is eating...");
  }

 public static void main(String[] args) {
  Eatable[] things = new Eatable[2];
  //! Those class implements Eatable can be assigned into Eatable array
  things[0]= new Superman (3.4, 71);
  things[1]= new Student("John"); 
 
  for (Eatable e : things){
    e.eat();
    //Superman is eating...
    //Student is eating...

  //!default with run() method after implements Flyable interface

  Flyable [] things2 = new Flyable[2];
  things2[0] = new Superman(3, 7);
  
  Flyable [] things3 = new Flyable[2];
  things3[0] = new Superman(10, 90);
  things3[1] = new Superman(9, 23);

  for (Flyable thing : things3){
    thing.fly();
    thing.run();
  }




  }

}



}
