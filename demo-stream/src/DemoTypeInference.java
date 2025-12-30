import java.util.ArrayList;
import java.util.Optional;

public class DemoTypeInference {

  //2. Attribute
  private var name;
  public static void main(String[] args) {
    // Java 10
    int x = 3;
    // ! because x has been defined as int, we cannot re-define the type of x again.
    // x = 3.5;

    // ! var supports implicite original type when initialization (1st assignment)
    // ! "value assignment" decides the type of reference
    var y = 10;
    System.out.println(y);// 10
    var name = "Jenny";
    System.out.println(name);// Jenny

    var ages = new int[] {10, 3, 9};
    var email = Optional.of("peter@gmail.com");
    var apples = new ArrayList<>();
    // apples = 10;
    // because "apples" has been defined as "ArrayList" in line 24

    //! Java is Static (Compile) and Strong (explicit conversion) type language

    //var score; 

  }

    //! Can't do

    //1. Parameter
    // public static int sum(var x, var y){

    // }

    //3. Return type of method 
    // public static var sum(int x, int y){
    //   return x + y;
    //  }


}
