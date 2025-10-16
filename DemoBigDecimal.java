import java.math.BigDecimal;// java program code, VScode helps to import when use
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // !floating point issue
    System.out.println(0.2 + 0.1);// 0.30000000000000004
    System.out.println(0.3 - 0.1);// 0.19999999999999998
    System.out.println(0.1 * 0.2);// 0.020000000000000004
    System.out.println(0.3 / 0.1);// 2.9999999999999996
    // need to round up!!

    System.out.println(0.1 + 0.3);// 0.4

    // Solution: BigDecimal which is a class
    BigDecimal bd = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal bd3 = bd.add(bd2);
    System.out.println(bd3.doubleValue());// 0.3

    // ! substract

    BigDecimal bd4 = bd3.subtract(bd2);
    System.out.println(bd4.doubleValue());// 0.2

    double x = 0.3;
    double y = 0.1;
    double result =
        BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y)).doubleValue();
    System.out.println(result);// 0.2

    // ! multiply

    double a = 0.1;
    double b = 0.2;
    result =
        BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b)).doubleValue();
    System.out.println(result);// 0.02

    result = BigDecimal.valueOf(0.125).multiply(BigDecimal.valueOf(0.35))//
        .setScale(2, RoundingMode.HALF_UP)//
        .doubleValue();//
    System.out.println(result);//0.04


    // ! divide (non-terminated decimal place)
    double e = 10.0;
    double f = 3.0;

    // result = BigDecimal.valueOf(e).divide(f).doubleValue();
    // error: no exact representable decimal result

    result = BigDecimal.valueOf(e)//
        .divide(BigDecimal.valueOf(f), 2, RoundingMode.HALF_UP)// Half = 5,四捨五入
        .doubleValue();
    System.out.println(result);// 3.33

    result = BigDecimal.valueOf(0.5)//
        .divide(BigDecimal.valueOf(4.0), 2, RoundingMode.HALF_UP)// Half = 5,四捨五入
        .doubleValue(); // error: no exact representable decimal result
    System.out.println(result);// 0.13 (0.125, 2dp half up)


    result = BigDecimal.valueOf(0.5)//
        .divide(BigDecimal.valueOf(4.0), 2, RoundingMode.HALF_DOWN)// Half = 5
        .doubleValue(); // error: no exact representable decimal result
    System.out.println(result);// 0.12 (0.125, 2dp half down)

  }
}
