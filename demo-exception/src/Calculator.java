public class Calculator {

  public static char firstChar(String str) {

    // what if str is null?
    // use String as parameter, you should consider null and empty string "" or some special symbols
    if (str == null) // Java run the left side first, the position matter
      // return ' ';
      throw new RuntimeException("The parameter cannot be null.");
    else if ("".equals(str))
      throw new RuntimeException("The parameter cannot be empty string.");
    return str.charAt(0);
  }

  

  public static void main(String[] args) {

    // System.out.println(firstChar(""));//!error
    // "" -> array with length 0

    String input = "";



    try {
      char result = firstChar(input);//if we hit error here, skip the rest of lines
      System.out.println("Check point 1..."); //skip line 26 & 27 and jump to line 30
      result = firstChar(null);
    } catch (RuntimeException e) { //!Re-cover
      // do something else
      System.out.println("RuntimeException: " + e.getMessage());//RuntimeException: The parameter cannot be empty string.
    }
    // -> System.out.println(firstChar(""));//error

    System.out.println("Check point 2...");

    String input1 = null;
    try {
      char result = firstChar(input1);
    } catch (RuntimeException e) {
      System.out.println("RuntimeException: " + e.getMessage());//RuntimeException: The parameter cannot be null.
    }
    // -> System.out.println(firstChar(null));//Not hit
    System.out.println("End of Program.");
  }

   

}
