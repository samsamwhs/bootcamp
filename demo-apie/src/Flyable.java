//this is not class, it's a contract 合約
public interface Flyable {
  public static int counter = 0;

  public static int sum (int x, int y){
    return x + y;
  }


  //! Interface (after Java 8)
  // Static Method
  // Default instance method, the class implements this interface could call run() method
    //this is also a part of the contract
    //this is good way to add/ change method in Interface that no need to amend the class which implements this interface previously
    //no need to explain in the class that implements this interface
    //e.g. Superman won't be impacted when a new class superwoman can enjoy the default method "drink"

  default void run(){
    System.out.println("This is default run method in the Interface.");
  }

  default void drink(){

  }

  //! Interface 
  // - No attribute
  // - No constructor

  // Abstract method : no concrete method, not explaining anything
  // 1 interface can have more than 1 abstract method, e.g. void walk()
  // can have static variable & method

  //implicitly all are abstract method in interface

 void fly();
}
