import java.util.LinkedList;
import java.util.List;


public class DemoLinkedList {
  public static void main(String[] args) {

    //! LinkedList vs ArrayList
    // use ArrayList in most application
    //1. add() (add to tail): LinkedList has little advantage
    //2. size(): similar, both should store the current size 
    //3. get() i.e. find the 10th elements in the list (ArrayList is faster, no need to go through all elements in the linkedlist)
    //4. contains(): similar, both need to loop
    //5. remove(): similar, both need to loop


    LinkedList<Cat> cats = new LinkedList<>(List.of(new Cat("John"),new Cat("Mary")));

    System.out.println(cats);//[Cat(name=John), Cat(name=Mary)]
    cats.remove(new Cat("John"));//left: cats, right must be cat after override "equals" method in Cat
    System.out.println(cats);//[Cat(name=Mary)]

    System.out.println(cats.size());//1

    System.out.println(cats.contains(new Cat("John")));//false
    

    //why need LinkedList?






  }
}
