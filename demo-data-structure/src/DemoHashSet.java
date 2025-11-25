import java.util.HashSet;

public class DemoHashSet {


  public static void main(String[] args) {
    HashSet <Cat> cats = new HashSet<>();


    cats.add(new Cat("John"));
    cats.add(new Cat("Mary"));
    cats.add(new Cat("Tommy"));

    cats.remove(new Cat("John"));
    System.out.println(cats.contains(new Cat("John")));//false


    //! HashSet is from "Hash" family, most of the method from Hash Data Structure use both equals() & hashCode() if not override hashCode()
    //! HashSet is finding object by hashCode
    System.out.println(cats.size());//3 before override hashCode, 2 after override hashCode
    System.out.println(cats);//[Cat(name=Tommy), Cat(name=Mary), Cat(name=John)]

    //!purpose to use hashset
    // Avoid duplicated
    // use equals() and hashCode() to check duplication

    boolean result = cats.add(new Cat ("Tommy"));
    System.out.println(result);//false, bcuz hashSet don't allow 2 "Tommy" in the list

    result = cats.add(new Cat("Steven"));//!hashSet add() -> loop, need more time, poor performance
    System.out.println(result);//true



  }
}
