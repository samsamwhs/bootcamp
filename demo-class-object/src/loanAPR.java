import java.math.BigDecimal;
import java.math.RoundingMode;

public class loanAPR {

  //!Attribute
  private double loanAmount;
  private double fee;
  private int numberOfDays;
  private double InterestRate;

  //!Empty Constructor
  public loanAPR(){

  }
  
  //!All args Constructor
  public loanAPR(double loanAmount, double fee, double InterestRate, int numberOfDays){

  }

  //!main
  public static void main(String[] args) {
    loanAPR l1 = new loanAPR();
    l1.loanAmount = 8000;
    l1.monthlyInterestRate = 0.004167;
    l1.numberOfDays = 730;
    l1.fee = 75.0;
    l1.totalInterest = calTotalInterest(l1.loanAmount, l1.monthlyInterestRate, l1.numberOfDays);
    System.out.println(calAPR(l1.fee,l1.totalInterest,l1.loanAmount,l1.numberOfDays));
  
  }



  public static double calTotalInterest(double loanAmount, double monthlyInterestRate, double numberOfDays){
    BigDecimal numberOfYear = BigDecimal.valueOf(numberOfDays).divide(BigDecimal.valueOf(365,2,RoundingMode.HALF_UP);
    double totalInterest = new BigDecimal(loanAmount * monthlyInterestRate * 12 * numberOfYear).setScale(0, RoundingMode.HALF_UP).doubleValue();
    return totalInterest;
  }

  public static double calApr (double fee, double totalInterest, double loanAmount, int numberOfDays){
    BigDecimal feeAndInterest = BigDecimal.valueOf(fee).add(BigDecimal.valueOf(totalInterest));
    BigDecimal dividedByLoanAmount = feeAndInterest.divide(BigDecimal.valueOf(loanAmount),2,RoundingMode.HALF_UP);
    BigDecimal dividedByNumberOfDays = dividedByLoanAmount.divide(BigDecimal.valueOf(numberOfDays),2,RoundingMode.HALF_UP);
    return dividedByNumberOfDays//
    .multiply(BigDecimal.valueOf(365)).setScale(2,RoundingMode.HALF_UP)//
    .multiply(BigDecimal.valueOf(100)).setScale(2,RoundingMode.HALF_UP)//
    .doubleValue();
  }
}

