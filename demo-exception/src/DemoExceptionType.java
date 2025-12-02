public class DemoExceptionType {
  public static void main(String[] args) {
    //build in exception

    //1. Math

    int count = 0;
    //double average = 10/count;//!move inside try
    //System.out.println(average);//!move inside try
    //System.out.println(10/count);//Error in Java
    //if we don't have try throw, we could use if-else to check count =0;

    try{
      double average = 10/count;
      System.out.println(average);
    }catch(ArithmeticException e){
      System.out.println("Cannot not / by zero.");//Cannot not / by zero. //! Java still run 
    }

    //2. array
    int[] arr = new int[2];
    arr[0] = 100;
    arr[1] = 300;

    int idx = 2;
    //System.out.println(arr[idx]);//we should use if-else to avoid in real world

    try{
      arr[idx] = 1000;
    }catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Array Index Out Of Bounds");//Array Index Out Of Bounds
    }

    //3. String

    try {
      String s = "hello";
      s.charAt(s.length()); // we should use if-else to avoid (real world)
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("String Index Out of Bound.");
    }

    //4. NPE(Null Pointer Exception)
try {
      lastChar("hello"); // OK
      lastChar(null); // runtime error, NullPointerException
      lastChar(""); // runtime error, ArrayIndexOutOfBoundsException
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Exception."); // 
    } catch (ArrayIndexOutOfBoundsException e) { // ! else if -> catch
      System.out.println("Array Index Out of Bound.");
    }

    //Class.forName("String");

    //5. NumberofException
    Integer x = null;
    Integer x2 = null;
    try{
    x = Integer.valueOf("100");
    x2 = Integer.valueOf("abc");//error
    } catch (NumberFormatException e){
      System.out.println("NumberFormatException."+e.getMessage());//NumberFormatException.For input string: "abc"
      System.out.println("x="+ x);//x=100
    } 

    //6. IllegalArgumentException (IAE)
    
    //! when there is chain method caller
    //! method A -> method B -> method C
    //! cannot tell caller that the answer is incorrect -> use throw error message
    //! and method B catch the message 
    //! and do follow up actions like send email to customer, fall back stock, return debit amount the credit card



  }

  // public static char lastChar(String s) {
  //   return s.charAt(s.length() - 1);
  // }

  
  





  public static char lastChar(String s) {
    if(s == null){
      throw new IllegalArgumentException("s cannot be null");
    return s.charAt(s.length-1);
    }
  }
}
