import java.math.BigDecimal;

public class DemoLoopII {
  public static void main(String[] args) {
    //Basic
    for (int i = 0; i < 5; i++){
      System.out.println(i);//0,1,2,3,4
    }

    //while loop //! cannot use i,j,k which will be used in for-loop
    int counter = 0; //(int i = 0;)
    while (counter < 5){ //(i < 5)
      System.out.println(counter);  //0,1,2,3,4 (System.out.println(i);)
      counter++; //(i++)
    }

    // Array
    double [] amounts = new double[4]; //array name shoud be plural so able to recognize it is array instead variable
    amounts[0] = 10.5;
    amounts[1] = 100.9;
    amounts[2] = 24.22;
    amounts[3] = 1010.9;

    //for-each loop
    for (double x : amounts){//loop every value in array "amounts"; x is a copy of each value in the array
      System.out.println(x); //do reading;
    } 
    //compare to basic loop
    for (int i = 0; i < amounts.length; i++){
      System.out.println(amounts[i]); //do reading; 
      //amounts[i] is the value itself, so it could be rewrite e.g. amounts[i]=100;
    }
    //!Sum up values (Important)
    double total = 0.0;
    for (double amount : amounts){
      total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(amount)).doubleValue();//.doubleValue() -> to return double value
      //"amounts" is an array with double value, so Bigdecimal should be used
    }
    System.out.println("total=" + total);//total=1146.52s



  }
}
