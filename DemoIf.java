public class DemoIf {
public static void main(String[] args) {
    int x = 3;
    if (x>10) {
      System.out.println("hello");//skip
    }else{
      System.out.println("Goodbye");//Goodbye
    }

    if (x>=4){
      System.out.println("x is larger than 4");//skip
    }

    //&&(AND) OR
    int y = 10;
    if (x>2 && y<20){ // true && true -> true
      System.out.println("hello");//hello
    }

    if (x<2 && y<20){
      System.out.println("hello");//skip
    }else{
      System.out.println("goodbye");//goodbye
    }

}
  
}
