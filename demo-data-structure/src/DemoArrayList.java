import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] names = new String[2];
    names[0] = "John";
    names[1] = "Peter";

    // Array Disadvantages:
    // 1. fixed length (can't know the required length before using it)
    // 2. all same type of values in the array

    // ArrayList has variable length. not fixed length.
    // but still same type of variable
    // Author write class for Array to overcome the disadvantage, with method

    ArrayList<String> names2 = new ArrayList<>(); //open an array with 10 boxes, and then add 10 when needed
    names2.add("John");
    names2.add("Peter");
    names2.add("Susan");

    System.out.println(names2); // [John, Peter, Susan]
    names2.remove("Peter");
    System.out.println(names2);// [John, Susan]

    System.out.println(names2.size());// 2

    System.out.println(names2.get(1));// Susan
    System.out.println(names2.get(0));// John

    System.out.println(names2.isEmpty());//false

    System.out.println(names2.indexOf("Susan"));//1
    System.out.println(names2.contains("John"));//true
    System.out.println(names2.contains("Peter"));//false

    //Cat.java -> ArrayList<Cat>
    //Animal.java (Cat extends Animal) -> ArrayList<Animal>

    Cat c1 = new Cat ("John");
    Cat c2 = new Cat ("Mary");

    //Approach 1: Create ArrayList Object
    ArrayList <Cat> cats = new ArrayList<>(); 
    cats.add(c1);
    cats.add(c2);
    cats.add(new Cat ("Leo"));

    //remove: for loop to find cat, and call equals method
    //if no override equals method in Cat.java, it will call Objects.class equals method which is checking the object reference
    //! important to overide equals
    cats.remove(new Cat("Leo"));//new another cat, so the address is different since not override the equals from Objects.class
    System.out.println(cats);

    //! remove ()-> only remove first matched object
    //to test: try to add 2 cats with same name and remove 

    //Approach 2: 
    ArrayList <Cat> cats2 = new ArrayList<>(List.of(new Cat("Oscar"), new Cat("Jenny")));
    

    //Combine 2 cat list
    //addAll just for list, cannot add 1 cat only
    cats.addAll(cats2);




  }
}
