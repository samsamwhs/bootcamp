public class DemoWrapperClass {
  public static void main(String[] args) {
    //Total 8 Primitives, each primitive has its corresponding Wrapper Class

    //short -> Short
    //byte -> Byte
    //float -> Float

    //int -> Integer
    //long -> Long
    //char -> Character
    //boolean -> Boolean
    //double -> Double

    Integer x = 3;
    //int is for storing the value itself only, but Integer also can use tools

    double x2 = x.doubleValue();
    System.out.println(x2);//3.0
    System.out.println(x);//3
    String x3 = x.toString();
    System.out.println(x3);//"3"

    //Null Value (only can be assiged to Wrapper Class datetype)
    x = null;
    //byte b1 = x.byteValue(); //error: x has no value (null)
    //y = null; //error: y is int variable

    //equals()
    //! Never use i,j,k as local variable since they are used in For-loop
    Integer a1 = 7;
    Integer a2 = 8; 
    System.out.println(a1 == a2);//Integer == Integer -> int == int -> false
    System.out.println(a1.equals(a2));//false
    System.out.println(a1.compareTo(a2));//-1

    //>=, >
    System.out.println('a'>95);//true

    a1 = 200;
    byte b2 = a1.byteValue();//downcasting
    System.out.println(b2);//-56; overflow

    //Character
    Character c1 = 'a';//auto-box (primitive value -> wrapper class object)
    char c2 = c1;//un-box

    System.out.println(c1.compareTo('a'));//0
    System.out.println(c1.compareTo('c'));//-2 ('a' (97)-'c' (99))
    System.err.println(c1.equals('a'));//true
    System.err.println(c1.equals('c'));//false

    System.out.println(Character.isAlphabetic('a'));//static method: asking 'a' is Alphabet; true
    System.out.println(Character.isDigit('a'));//static methoud: asking 'a' is digit; false

    //find out if it is lowercase
    char c3 = 'a';
    //approach 1
    if (c3 >= 97 && c3 <= 122){
      System.out.println("c3 is a lowercase letter.");//c3 is a lowercase letter.
    }
    //approach 2
    System.out.println(Character.isLowerCase(c3));//true


    //Double
    Double d1 = 1.5;
    double d2 = d1;

    //convert into int? Integer?
    int a10 = d1.intValue();
    System.out.println(a10);//1; force java to do; user confirmed the risk
    
    //3 ways to create an object of Integer
    Integer a20 = Integer.valueOf(9);// recommended to use this tool
    Integer a21 = new Integer(9);//old school, will be obsoleted
    Integer a22 = 9;

    //Primitive 
    //int x = 3; 
    //we call "x" as variable, while 3 is int value

    //non-Primitive (Class)
    //String s = "hello"
    //we call "s" as object reference, while "hello" is an String object

    String a23 = String.valueOf("hello");
    String a24 = new String("hello");
    String a25 = "hello";
    System.out.println(a23.length());//5
    
  }
}
