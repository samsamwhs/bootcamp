public class DemoString {
  public static void main (String[] args) {

    //! String stores Characters except numbers
    String name = "John";
    String tutor = "Vincent Lau";
    String s1 = "!@*@)*((&))";

    //! String has + operation
    String firstName = "Jennie";
    String lastName = "Wong";
    String fullName = firstName + " " + lastName;

    //!sysout (ShortCut)
    System.out.println(fullName); //Jennie Wong

    //! emptyString ""
    String emptyString = "";

    //! String has no -, *, / operations
    //! Any data type + String = String
    //! Assign String value to String variable only
    String s3 = "Sally" + 0.3;
    System.out.println(s3); //Sally0.3

    //! "String" with uppercase "S" is Class which has function behind
    //! Methods (Functions)
    //1. length
    String teacher = "Steven";
    //! . to initiate function length(), isEmpty()...
    System.out.println(teacher.length());//6

    //2.isEmpty
    System.out.println(teacher.isEmpty());//false
    System.out.println(emptyString.isEmpty());//true
    
    //3.equals
    String s6 = "abc";
    String s7 = "abc";
    System.out.println(s6.equals(s7));//true

    String s8 = "abcd";
    System.out.println(s8.equals(s7));//false

    //4.charAt. (ask to return what character in specific position of a word)
    //! Index begins at 0
    System.out.println(s8.charAt(0));//a
    System.out.println(s8.charAt(1));//b
    //System.out.println(s8.charAt(4)); (error: There is no 4th char. in the word)
    //System.out.println(s8.charAt(-1)); (error: no -1 in Java)
  }
}