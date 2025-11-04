import java.util.Random;

public class DemoPrimitiveAdvanced {
  public static void main(String[] args) {
    //! Overflow Problem; be careful of the data type!!
    short s1 = 30000;
    short s2 = 31000;//total: 61000
    //short s3 = s1 + s2; 
    //error: short + short = int, byte + byte = int, byte + short = int
    //cannot convert from int to short
    short s3 = (short) (s1 + s2); //force Java to return short
    System.out.println("s3="+s3);//-4536; 32,767 -> +1 -> -32,768...-32,767...-4536
    
    int i1 = 2_100_000_000; //for easy reading, =2100000000 =2,100,000,000 
    int i2 = 100_000_000;
    int i3 = i1 + i2;
    System.out.println(i3);//-2094967296; max. int: 2,147,483,647

    //! Promotion/upcast
    //byte -> short -> int -> long -> float -> double
    byte b1 = -100;
    short s4 = b1;
    int i10 = s4;
    long l10 = i10;
    float f10 = l10;
    double d10 = f10;

    //! Downcasting
    //float f11 = 10.5; //error: 10.5 is double, it's risky
   float f11 = (float) 10.5;
   long l12 = 2_200_000_000L;
   int i11 = (int)l12;//force Java to return int, user confirmed to accept the risk
   System.out.println(i11);//-2094967296; error: overflow


    //In Java, we don't have byte and short value
    //assign int value into short variable
    short s11 = 1; //safe
    int x = 1;
    //short s2 = x;//risky, error: cannot convert from int to short

    long l1 =100L;
    long l2 = 100;//promote from int to long, it's safe

    //float f2 = 1.5;//risky, assign double value to float variable
    float f1 = 1.5f;
    double d1 = 1.5d;//promote from int to long, it's safe

    //char -> int, every character has ASCII code 
    char c1 = 'a';
    System.out.println(c1+1);//98
    System.out.println('a'+'b');//195
    System.out.println('!'+1);//34
    System.out.println(' '+1);//33
    System.out.println('你'+1);//20321

    int result = '你'+100; //20320 + 100 -> int value -> int variable
    System.out.println(result); //20420

    // Math.random
    // new Random() is tool
    int r1 = new Random().nextInt(3); //0-2
    System.out.println("r1=" + r1);

    // marksix (1-49) -> 0-48
    int r2 = new Random().nextInt(48);
    System.out.println(r2 +1);

    //Answer
    int marksix = new Random().nextInt(49)+1;
    System.out.println(marksix);// a number within 1-49

    //'a'-'z' 97-122
    int r3 = new Random().nextInt(25);
    r3 = r3 + 97;
    char character = (char) r3 ;
    System.out.println(character);

    //Answer
    int targetAscii = new Random().nextInt(26) + 97;
    System.out.println((char) targetAscii);// random 'a'-'z'

}}
