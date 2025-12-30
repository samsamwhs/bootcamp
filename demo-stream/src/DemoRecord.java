public class DemoRecord {
  
public static void main(String[] args) {
  //! record class type has no empty constructor
  //Cat c1 = new Cat();
  //! only have All-args constructor by default
  Cat c2 = new Cat("Benny", 13);

  //!Getter -> no "get" prefix
  System.out.println(c2.name());//Benny

  //! record has no setter
}
}
