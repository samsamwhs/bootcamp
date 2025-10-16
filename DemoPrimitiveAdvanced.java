public class DemoPrimitiveAdvanced {
  public static void main(String[] args) {
    //! Overflow Problem; be careful of the data type!!
    short s1 = 30000;
    short s2 = 31000;
    //short s3 = s1 + s2; 
    // error: short + short = int, byte + byte = int, byte + short = int
    // cannot convert from int to short
    short s3 = (short) (s1 + s2); //force Java to return short
    System.out.println(s3);//-4536; 32,767 -> +1 -> -32,768...-32,767...-4526
    

    int i1 = 2_100_000_000;
    int i2 = 100_000_000;
    int i3 = i1 + i2;
    System.out.println(i3);//-2094967296; max. int 2,147,483,647

    //! Promotion/upcast
    //byte -> short -> int -> long -> float -> double
    byte b1 = -100;
    short s4 = b1;
    int i10 = s4;
    long l10 = i10;
    float f10 = l10;
    double d10 = f10;

    //! Downcasting
   // float f11 = 10.5; //error: 10.5 is double
   float f11 = (float) 10.5;
   long l12 = 2_200_000_000L;
   int i11 = (int)l12;//force Java to return int, user accept the risk
   System.out.println(i11);//-2094967296; error: overflow





    //char -> int

  }
}
