public class DemoMath {
  public static void main(String[] args) {
    double r = Math.pow(2, 4);
    System.out.println(r);//16.0

    System.out.println(Math.ceil(3.1));//4.0
    System.out.println(Math.floor(3.9));//3.0
    System.out.println(Math.PI);//3.141592653589793
    
    //!absolute value
    System.out.println(Math.abs(-3));//3
    System.out.println(Math.abs(4));//4

    int score = -4;
    System.out.println(Math.max(0, score));//0
    System.out.println(Math.min(0, score));//-4

    score = 130;
    System.out.println(Math.max(100, score));//130
    System.out.println(Math.min(100, score));//100

    System.out.println(Math.round(0.1234));//0
    System.out.println(Math.round(0.5234));//1

    double d10 = 0.1235;// ->0.124
    System.out.println(Math.round(d10*1000)/1000.0); //round returns long value, so /1000.0

    System.out.println(Math.random());//0.3678779739192297; random number from 0-1

  }
}
