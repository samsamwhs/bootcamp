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

    //Example: max, min, requires to print "max=12, min=10"
    int num1 = 10;
    int num2 = 12;
    
    int max = num1;
    int min = num2;
    if (num1 > num2){
      max = num1;
      min = num2;
    }else{
      max = num2;
      min = num1;
    }
    System.out.println("max=" + max + ",min=" + min);

    //if-else, else if
    // score >= 90, Grade A
    // score >= 80, Grade B
    // score >= 70, Grade C
    // score < 70, Fail

    int score = 0;
    String grade = "";
    if (score >= 90){
      grade = "A";
    } else if (score >= 80 && score < 90){ //! Prevent overlapping for beginner
      grade = "B";
    } else if (score >= 70 && score < 80){
      grade = "C";
    } else {
      grade = "Fail";
    }
    System.out.println("Grade=" + grade);

}
    
}
