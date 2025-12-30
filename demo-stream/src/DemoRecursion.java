public class DemoRecursion {
  


  public static void main(String[] args) {
    // Q1: 1+2+3+4+5
    // n = 100

    int sum = 0;
    for (int i = 1; i <=100; i++){
      sum += i;
    }
    System.err.println(sum); //5050
    System.out.println(sum(100)); //5050

    //Q2: Positive Number: 2+4+6+...+n

    System.err.println(sum2(10));//30
  }

  //! Tail Recursion (method call itself)
  //Q1
  public static int sum(int n){
    if (n <= 1) //! Exit Criteria
      return 1;
    return n + sum(n - 1); //! call itself
  }

  //Q2
  public static int sum2(int n){
    if(n <=2)
      return n;
    return n + sum2(n - 2);
  }

  //100 + sum(99) = 100 + 99 (system is holding till final return)
  //99 + sum(98) = 99 + 98
  //...
  //2 + sum(1) = 2 + 1
  //return 1 (not adding to the sum)

  //! Non- Tail Recursion
public static void order (String[] customers){

  //index
  int idx = customers.length;

  //1.confirm order (important)
  //2.send email
}

  public static 

}
