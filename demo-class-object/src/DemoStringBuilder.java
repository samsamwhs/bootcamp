import java.math.BigDecimal;

public class DemoStringBuilder {
  public static void main(String[] args) {
    String name = "John";
    String[] names = new String[] {"Peter", name, "Sally"};

    // loop: to combine all names in the array
    String combinedNames = "";
    for (String i : names) {
      combinedNames = combinedNames.concat(i);// or combinedNames + i
    }
    System.out.println(combinedNames);

    // StringBuilder
    StringBuilder sb = new StringBuilder();// create and assume there is empty string
    sb.append("hello");// amending sb's value
    sb.append("world");
    System.out.println(sb.toString());// "helloworld"

    BigDecimal bd = new BigDecimal("3.5");
    bd = bd.add(BigDecimal.TEN);// create and return new BigDecimal value
    System.out.println(bd);

    // !Performance of String concat
    long before = System.currentTimeMillis();//milli second
    String result = "";
    for (int i = 0; i < 100_000; i++){
      result += "a";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before);//371ms(~0.3s)

    before = System.currentTimeMillis();
    sb = new StringBuilder();
    for (int i = 0; i < 100_000; i++){
      sb.append("a");
    }
    after = System.currentTimeMillis();
    System.out.println(after - before);//3ms

    //Real application, usually concat 2 strings only, but not 100k times



//! Literal Pool
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1.hashCode());//99162322
    System.out.println(s2.hashCode());//99162322

    s1 = new String("hello");//create new string object
    System.err.println(s1.hashCode());//99162322
    System.out.println(s1 == s2);//false, checking object not address

    s1 = String.valueOf("hello"); //! firstly, it search string pool
    System.out.println(s1 == s2);//true, 

    s1 += "!!!";
    System.out.println(s1.hashCode());//-792732177
    //will write new object and reassign s1 to it, only apply to String





  }
}
