public class DemoWrapperClassII {
  public static void main(String[] args) {
    // ! Don't use == for Wrapper Class

    Integer a10 = Integer.valueOf(127);
    Integer a11 = Integer.valueOf(127);
    System.out.println(a10 == a11);// true

    Integer a12 = Integer.valueOf(128);
    Integer a13 = Integer.valueOf(128);
    System.out.println(a12 == a13);// false, checking the storing address not value;so a12 is not equal to a13
    System.out.println(a12.equals(a13));// true, checking the value

    // ! -128 to 127 is cache, always store 1 set in our computer, applys to all type of variable

    // Short, Byte, Long
    Long l10 = Long.valueOf(128);
    Long l11 = Long.valueOf(128);
    System.out.println(l10 == l11);// false


    Boolean b10 = true;
    Boolean b11 = new Boolean(true);// force java to open a new box to store value
    Boolean b12 = Boolean.valueOf(true);
    Boolean b13 = Boolean.valueOf(true);

    System.out.println(b12 == b11);// false
    System.out.println(b12 == b13);// true

    //Character
    Character c10 = 'a';
    Character c11 = new Character('a');// force java to open a new box to store value
    Character c12 = Character.valueOf('a');
    Character c13 = Character.valueOf('a');

    System.out.println(c12 == c11);// false
    System.out.println(c12 == c13);// true
    System.out.println(c12 == c10);// true

  }

}
