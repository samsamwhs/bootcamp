import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanAPR {

  //!Attribute
  private double loanAmount;
  private double fee;
  private double interestRate;
  private int numberOfDays;

  //!Empty Constructor
  public LoanAPR(){

  }

  //!All args Constructor
  public LoanAPR(double loanAmount, double fee, double interestRate, int numberOfDays){
    this.loanAmount = loanAmount;
    this.fee = fee;
    this.interestRate = interestRate*12/100;
    this.numberOfDays = numberOfDays;
  }

  //!getter and setter
  //setter
  public void setLoanAmount(double loanAmount){
    this.loanAmount = loanAmount;
  }
  public void setFee(double fee){
    this.fee = fee;
  }
  public void setInterestRate(double interestRate){
    this.interestRate = interestRate;
  }
  public void setNumberOfDays(int numberOfDays){
    this.numberOfDays = numberOfDays;
  }

  //getter
  public double getLoanAmount(){
    return this.loanAmount;
  }
  public double getFee(){
    return this.fee;
  }
  public double getInterestRate(){
    return this.interestRate;
  }
  public int getNumberOfDays(){
    return this.numberOfDays;
  }
  public double getNumberOfYear(){
     return BigDecimal.valueOf(this.numberOfDays).divide(BigDecimal.valueOf(365),2,RoundingMode.HALF_UP).doubleValue();
  }
  public double getTotalInterest(){
    return BigDecimal.valueOf(this.loanAmount).multiply(BigDecimal.valueOf(this.interestRate))//
    .multiply(BigDecimal.valueOf(getNumberOfYear())).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
  public double getApr(){
    BigDecimal feeAndInterest = BigDecimal.valueOf(this.fee).add(BigDecimal.valueOf(getTotalInterest()));
    BigDecimal dividedByLoanAmount = feeAndInterest.divide(BigDecimal.valueOf(this.loanAmount),4,RoundingMode.HALF_UP);
    BigDecimal dividedByNumberOfDays = dividedByLoanAmount//
    .divide(BigDecimal.valueOf(this.numberOfDays),8,RoundingMode.HALF_UP);
    return dividedByNumberOfDays//
    .multiply(BigDecimal.valueOf(365)).setScale(4,RoundingMode.HALF_UP)//
    .multiply(BigDecimal.valueOf(100)).setScale(4,RoundingMode.HALF_UP)//
    .doubleValue();
  }
  public double getMfr(){
    return BigDecimal.valueOf(this.interestRate).divide(BigDecimal.valueOf(12),4,RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100)).setScale(4,RoundingMode.HALF_UP).doubleValue();
  }


  //!main
  public static void main(String[] args) {
    LoanAPR l1 = new LoanAPR(8000.0,75.0,5,730);
    System.out.println(l1.getApr()+"%");
    System.out.println(l1.getMfr()+"%");
    LoanAPR l2 = new LoanAPR(50000.0,0.0,0.3,365);
    System.out.println(l2.getApr()+"%");
    System.out.println(l2.getMfr()+"%");
  }
}

