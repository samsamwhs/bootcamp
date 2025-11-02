public class DemoPrimitives {
  //Raw type
  //8 Primitives (byte, short, int, long, float, double, char, boolean)
  // For primitive comparison, == equal, != not equal, >=, <=, >, <
  public static void main (String[] args) {
    //! shortcut : main

    //! Integer: int, long, short, byte
    int x = 3;
    System.out.println(x);//3

    //Re-assignment  don't need to declare datatype again
    x=10;
    System.out.println(x);//10

    //byte: 127 to -128
    //short: 32,767 to -32,768
    //int: 2,147,483,647 (2^31) to -2,147,483,648
    //long: 2^63 to -2^63
    //! By default, use int since a lot of function linked to int


    //! Decimal: double, float
    // Precision: double > float 

    //! computer store number first and then the position of fullstop
    //! bit = on/off = 1 switch (2^1), 3 bit = 2^3, save 1 bit for "-"

    //! Java (cannot assign double value to float variable)
    //float value: 3.2f, double value: 3.2

    float f1 = 3.2f;
    double d2 = 3.2f;

    double d3 = 10.3;
    //float f3 = d3; <- risk: 
    //will be less precisive when change to float datatype, Java doesn't allow to do so.

    //! char: store single character, for example: gender, more precisive
    //'a' is char value
    // assign char value into char variable
    // use single quote '' for char value
    char c1 = 'a';
    String s10 = "a "; //String is not primitive, is a Class with function code behind

    char gender = 'F';
    char grade = 'A';
    System.out.println(gender == grade); //false
    System.out.println(gender != 'M'); //true

    int score = 73;
    System.out.println(score> 70); //true

    //! boolean
    // variable name : isXXXX by default with business meaning
    // value : true, false only
    int age = 19;
    boolean isAdult = age >= 18;//true
    
    boolean b10 = true;//true


  }
}