import java.util.Arrays;

public class String1 {
  private char[] values;

  //! constructor
  public String1(String characters){
    this.values = characters.toCharArray();
  }

  // length()
  public int length(){
    int lengthCounter = 0;
    for (int x : this.values){
      lengthCounter++;
    }
    return lengthCounter;
  }

  // charAt(int index) return char
  public char charAt(int index){
    return this.values[index];
  }

  //!setter

  // replace(...)
  public void replace(char oldChar, char newChar){
    for (int i = 0; i < this.values.length; i++){
      if(this.values[i]==oldChar){
        this.values[i] = newChar;
      }
    }
  }


  // substring(...)
  public String substring(int startIdx, int endIdx){
    int idx = 0;
    char[] arrtoString = new char[endIdx-startIdx];
    for (char x : this.values){
      if(startIdx = x && x < endIdx){
        arrtoString[idx] = this.values[x];
        idx++;
      }
    }
    return String.valueOf(arrtoString);
  }




  // equals(String1 s)
  // public boolean equals(String1 s){
  //   if (s == this.values)
  // }



public static void main(String[] args) {
  String1 helloString = new String1("hello");
   System.out.println(helloString.length());//5
   System.out.println(helloString.charAt(4));//o
   helloString.replace('e', 'a');
   System.out.println(helloString.charAt(1));//a
   System.out.println(helloString.substring(1, 4));

  



}
}
