import java.util.Arrays;

//! Purpose: String1 vs String (Try to simulate String Design), char array inside String
public class String1 {
  private char[] values;

  //! constructor
  public String1(String characters){
    this.values = characters.toCharArray();
  }

  //Answer
  //public String1 (String str){}

  //! length()
  public int length(){
    int lengthCounter = 0;
    for (int x : this.values){
      lengthCounter++;
    }
    return lengthCounter;
  }

  //! charAt(int index) return char
  public char charAt(int index){
    return this.values[index];
  }

  //Answer -1?? if condition




  //! replace(...)  no revise itself
  // public void replace(char oldChar, char newChar){
  //   for (int i = 0; i < this.values.length; i++){
  //     if(this.values[i]==oldChar){
  //       this.values[i] = newChar;
  //     }
  //   }
  // }

  //Answer

  public String1 replace (char fromChar, char byChar){
    String str = "";
    for (char c : this.values){
      if (c == fromChar){
        str += byChar;
      }else{
        str = this.values[c];
      }
    }

  }



  //!substring(...) no revise itself
  // public String substring(int startIdx, int endIdx){
  //   int idx = 0;
  //   char[] arrtoString = new char[endIdx-startIdx];
  //   for (int i = 0; i < this.values.length; i++){
  //     if(i >= startIdx && i<endIdx){
  //       arrtoString[idx] = this.values[i];
  //       idx++;
  //     }
  //   }
  //   return String.valueOf(arrtoString);
  // }

//Answer 

  public String1 substring(int fromIndex, int endIndex){
    String str = "";
    for(int i = fromIndex; i < endIndex; i++){
      str += this.values[i]; //string + char = string
    }
    return new String1(str);
  }

  //! equals(String1 s)

  //Answer:
  public boolean equals(String s){
    //1.length same?
      if(this.values.length != s.length()){ //!Early return
        return false;
      }
    //2.compare char values, all of them are not same ->false
      int idx = 0;
      for(char c : s.toCharArray()){
        if(this.values[idx++] != c){//!Early return
          return false;
        }
      }
      return true;

    }
  // }

  //!getter

  public char[] getValues(){
    return this.values;
  }

  public String toString(){
    return new String(this.values);
  }
public static void main(String[] args) {
  String1 helloString = new String1("hello");
   System.out.println(helloString.length());//5
   System.out.println(helloString.charAt(4));//o
   helloString.replace('e', 'a');
   System.out.println(helloString.charAt(1));//a
   System.out.println(helloString.substring(1, 4));//all


   //!Testing -> Design Test cases so that every line of code in the method being tested.
  String1 s1 = new String1("hello");
  String s2 = "hello";

  System.out.println(s1.equals(s2));
  System.out.println(s1.equals("hello!"));
  System.out.println(s1.equals("hxllo"));

  System.out.println(Arrays.toString(s1.substring(1, 3)).getValues());
  System.out.println("hello".replace(1,3));//el

  //System.out.println() -> call object's toString(), once the class hv toString method, Java can do it automatically





}
}
