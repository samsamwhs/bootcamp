public class DemoInt {
  public static void main (String[] args) { //starting wording
    //! Variable and Data Type
    int x = 3;        
    // int x -> declaration: the data type of variable x is interger
    // = 3 -> assignment: value 3 assigned to x
    // assignment must be after declaration
    System.out.println(x); //3

    int y = 10;
    System.out.println(y); //10

    int total = x + y;
    System.out.println(total); //13

    int baseSalary = 20000; //Camel Case Naming: baseSalary 
    int bonus = 5000;
    int totalSalary = baseSalary + bonus;
    System.out.println(totalSalary); //25000
    System.out.println(bonus); //5000

    // discount
    int price = 150;
    double discountRate = 0.8;
    //! Math Operation: 1. int + int / int -> int  2. int + double -> double 
    double finalPrice = price * discountRate; //finalPrice cannot be int, there is a double in the equation
    System.out.println(finalPrice); //120.0

    int finalPrice2 = price * 80/100; //all are int in the equation
    System.out.println(finalPrice2); //120

    int englishScore = 82;
    int mathScore = 91;
    int historyScore = 83;
    double averageScore = (englishScore + mathScore + historyScore)/3.0; 
    System.out.println(averageScore); // 85 (3 is int) , 85.333333 (3.0 is double)

    int appleCount = 9;
    double applePrice = 5.5;
    int orangeCount = 4;
    double orangePrice = 6.5;

    double discount = 0.95;

    double finalAmount = (applePrice * appleCount + orangePrice * orangeCount)* discount;
    System.out.println(finalAmount);
  }
}