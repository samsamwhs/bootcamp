public class DemoMethod {
  public static void main(String[] args) {
    //method (function)
    int x = 10;
    int y = x + 3; //function f(x)=y
    System.out.println(y);//13

    //! Method Caller
    int result = sum(50,99);
    System.out.println("result="+result);//149

    //-3 + 99
    //100+ 20000

    //Testing
    System.out.println(totalLength("hello", "Leo"));//8
    System.out.println(isValidString("hello would!"));//true
    System.out.println(multiplyResult(10));//30

    int[]arr = new int[] {100,-4,999,40};
    System.out.println(findMax(arr));//999

    String[]names = new String[]{"Stella","Candy","Allen"};
    System.out.println(countStringPattern(names));//2

  }

  //!method

  //1. sum -> method name
  //2. int x, int y -> parameter, function 入口
  //3. the int after static -> return type 出口類型
  public static int sum(int x, int y){
    // int result = x + y;
    // return result;//variable must be int since the return type set in the beginning
    return x + y;
  }

  // Design Method: Given two Strings, sum up their length, and return it
  public static int totalLength(String s1, String s2){ //no. of length is int not string, therefore int after static
    // int totalLength= s1.length() + s2.length();
    // return totalLength;
    return s1.length()+s2.length();
  }

  // Design Method: Given a String value, check if it length > 10, return true/false
  public static boolean isValidString(String s1){
    // boolean result;
    // if(s1.length()>10){
    //   result = true;
    // }else{
    //   result = false;
    // }
    // return result;
    return s1.length()>10;
  }

  //Design Method: Given an int value, if it is odd number, return this number * 2; 
  // if it is even number, return this number * 3

  public static int multiplyResult (int x){
    // int result;
    // if (x % 2 == 1){
    //   result = x * 2;
    // }else{
    //   result = x * 3;
    // }
    // return result;
    return x % 2 == 1 ? x * 2 : x * 3;  //! ? ->  if statement(x % 2 == 1) -> true, return x * 2, : -> otherwise return x * 3
  }

  // Design Method: Given an int array, find and return the max value of it

  public static int findMax(int[]arr){
    int max = 0;
    for (int i = 0; i < arr.length; i++){
      // if( arr[i] > max){
      //   max = arr[i];
      // }
    max = Math.max(arr[i],max);
    }
    return max;
  }

  // Design Method: Gvien a String array, count the number of String value that contain "ll"
  public static int countStringPattern (String[] arr){
    int count = 0;
    //   for (int i = 0; i < arr.length; i++) {
    //   if (arr[i].indexOf("ll") != -1) {
    //     count++;
    //   }
    // }
    for (String s : arr){
      if (s.contains("ll")){
        count++;
      }
    }
    return count;
  }

}
