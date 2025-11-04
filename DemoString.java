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

    //! null (non-primitive/class)
    String s5 = "";
    System.out.println(s5.length());//0

    String s10 = null; //not String
    //System.out.println(s10.length());//error

    //5. isBlank()
    String s11 = "";
    String s12 = " ";
    String s13 = "Tommy";
    System.out.println(s11.isEmpty());//true
    System.out.println(s12.isEmpty());//false
    System.out.println(s13.isEmpty());//false

    System.out.println(s11.isBlank());//true
    System.out.println(s12.isBlank());//true
    System.out.println(s13.isBlank());//false

    //6. substring() 
    String s14 = "Hello World!!!";
    System.out.println(s14.substring(6,11)); //World (index = length -1)
    System.out.println(s14.substring(3));//lo World 

    //7. toLowerCase(), toUpperCase()
    System.out.println(s14.toUpperCase());//HELLO WORLD!!!
    System.out.println(s14.toLowerCase());//hello world!!!

    //Java -> Type
    //! chain method
    System.out.println(s14.toUpperCase().charAt(1));//E 
    //(E isn't string, after charAt, datatype: char)
    System.out.println(s14.substring(4).length());//10 (10 is int)

    //8. replace()
    String s17 = "Python";
    String s18 = s17.replace("y", "x");
    System.out.println(s18);//Pxthon
    System.out.println(s17.replace("y", "x").toUpperCase());//PXTHON
    String s19 = s17.replace("th","!!!");
    System.out.println(s19);//Py!!!on

    //9. contain
    System.out.println(s17.contains("Py"));//true
    System.out.println(s17.contains("py"));//false (Case sensitive)
    System.out.println(s17.contains(""));//true
    
    //10. startsWith(), endsWith()
    System.out.println(s17.startsWith("Phy"));//false
    System.out.println(s17.startsWith("p"));//false
    System.out.println(s17.startsWith("Pyt"));//true

    System.out.println(s17.endsWith("on"));//true
    System.out.println(s17.endsWith("s"));//false

    //!11. indexOf()
    System.out.println(s17.indexOf("th"));//2
    System.out.println(s17.indexOf("the"));//-1 (means: no result)
    System.out.println(s17.indexOf('o',3));//4
    System.out.println(s17.indexOf('o',3,4));//-1 

    //lastIndexOf()
    String s20 = "hello world";
    System.out.println(s20.indexOf('l')); //2
    System.out.println(s20.lastIndexOf('l'));//9

    //12. concat()
    String combined = "abc" + "def";
    System.out.println(combined);//abcdef
    String s21 = "abc".concat("def");
    System.out.println(s21);//abcdef (faster a bit, can use when it loops many times)
    System.out.println("abcd".concat("ijk").concat("xyz"));//abcdijkxyz

    //13. equalsIgnoreCase() - ignore upper/lower case
    String student1 = "John";
    String student2 = "john";
    System.out.println(student1.equals(student2)); //false
    System.out.println(student1.equalsIgnoreCase(student2));//true

    //14. trim()
    String username1 = "sammiwong";
    String username2 = "sammiwong  ";
    System.out.println(username2.trim());//sammiwong

    System.out.println(username1.trim().length());//9
    System.out.println(username2.trim().length());//9

    String username3 = "sammi wong";
    System.out.println(username3.trim());//sammi wong

    //15. compareTo()
    String apple = "apple";
    String banana = "banana";
    System.out.println(apple.compareTo(banana));//-1 (a - b)
    String cat = "cat";
    System.out.println(cat.compareTo(apple));// 2 (c - a)
    String boy = "boy";
    System.out.println(boy.compareTo(banana));//14 (o - a) 
    //(the 1st characters of both words are b, so compare their 2nd character)
    String boy1 = "boy";
    System.out.println(boy.compareTo(boy1));//0
    String book = "book";
    System.out.println(boy.compareTo(book));//10 (o - y)

    




  }
}