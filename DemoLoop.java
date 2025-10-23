import java.util.Scanner;

public class DemoLoop {
  public static void main(String[] args) {
    // flow -> if-else,
    // loop (for-loop, while)

    int x = 3;
    x *= 3;
    x *= 3;
    System.out.println(x);

    // for-loop
    // (initialization; continue criteria; modifier)
    for (int i = 0; i < 3; i++) { // run 3 times: 0 to 2
      System.out.println("Hello");
    }
    // Step 1: int i = 0
    // Step 2: i < 3 ? Yes
    // Step 3: print hello
    // Step 4: i++ (i=1)
    // Step 5: i < 3 ? Yes
    // Step 6: print hello
    // Step 7: i++ (i=2)
    // Step 8: i < 3 ? Yes
    // Step 9: print hello
    // Step 10: i++ (i=3)
    // Step 11: i < 3 ? No
    // Step 12: Exit Loop

    // loop -> 0,1,2,3,4,5 -> total=15
    int total = 0;
    for (int i2 = 0; i2 < 6; i2++) {
      total = total + i2;
      { // total += 1
        System.out.println("total=" + total);
      }
    }
    // for loop + if (1-10, print odd number only)
    for (int i3 = 0; i3 < 11; i3++) {
      if (i3 % 2 == 1) {
        System.out.println(i3);
      }
    }
    // sum up all even numbers between 0-20
    int sum = 0;
    for (int i4 = 0; i4 < 21; i4++) {
      if (i4 % 2 == 0) {
        sum += i4;
      }
    }
    System.out.println(sum);// 110

    // 0-100, sum up all numbers that is divided by 3
    sum = 0;
    for (int i5 = 0; i5 < 101; i5++) {
      if (i5 % 3 == 0) {
        sum += i5;
      }
    }
    System.out.println(sum);// 1683

    // 0-50, the difference between the sum of all even number and the sum of all odd number
    int evenSum = 0;
    int oddSum = 0;
    for (int i6 = 0; i6 < 51; i6++) {
      if (i6 % 2 == 0) {
        evenSum += i6;
      } else {
        oddSum += i6;
      }
    }
    System.out.println(evenSum - oddSum);// 25

    // 0-20, sum up all even number; 21-50, sum up all odd numbers,
    // find the product of both sum up amount.

    evenSum = 0;
    oddSum = 0;
    for (int i7 = 0; i7 < 51; i7++) {
      if (i7 <= 20) { // number hv bussiness meaning here, for easy reading and align with requirement
        if (i7 % 2 == 0) {
          // this is second condition, if put it in 1st condition with &&, more number will go to else-if part to filter
          evenSum += i7;
        }
      } else if (i7 >= 21 && i7 <= 50) {
        if (i7 % 2 == 1) {
          oddSum += i7;
        }
      }
    }
    System.out.println(evenSum * oddSum);// 57750

    // Loop + if + break/continue
    //1.break (to stop searching when condition meet)
    String[] names = new String[] {"John", "Peter", "Sally", "Vincent", "Steven"}; //fixed length is 5
    //(String[] names = new String[5]) + assign values into the array
    String targetName = null;
    for (int i = 0; i < names.length; i++){
      System.out.println("i=" + i); //i=0; i=1; i=2;i=3
      if (names[i].length() > 5){
        targetName = names[i];
        break; //break the loop
      }
    }
    System.out.println(targetName);//break: Vincent; without break: Steven



    //Scanner
    //Scanner s = new Scanner(System.in);//let user to input
    //System.out.println("Please input an integer:");
    //int input = s.nextInt();
    //int result = input * 3;
    //System.out.println("result=" + result);


  }
}


