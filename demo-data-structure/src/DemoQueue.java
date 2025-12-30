import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  
  public static void main(String[] args) {
    Queue<Integer> q1 = new LinkedList<>();//Queue is an interface cannot write in right hand side
    q1.add(10);
    q1.add(3);
    q1.add(250);
    System.out.println(q1.size());//3

    //q1 cannot use .get() method 
    System.out.println(q1.poll());//get and remove head -> 10
    System.out.println(q1.size());//2

    System.out.println(q1.contains(250));//true
    System.out.println(q1.peek());//check the head value -> 3
    System.out.println(q1.size());//2

    //! common usage
    
    while (!q1.isEmpty()){
      System.out.println(q1.poll());
    }

    List<Integer> l1 = new LinkedList<>();
    l1.add(10);
    l1.add(3);
    l1.add(250);
    System.out.println(l1.get(1));//3

    //ArrayDeque
    Queue<String> q2 = new ArrayDeque<>();
    q2.add("John");
    q2.add("Tommy");
    q2.add("Steven");

    System.out.println(q2.poll());//John
    System.out.println(q2.poll());//Tommy
    System.out.println(q2.size());//1

    //Deque
    Deque<String> names = new LinkedList<>();
    names.add("John");
    names.addFirst("Vincent");
    names.addLast("Mary");
    
    System.out.println(names.pollFirst());//Vincent
    System.out.println(names.pollLast());//Mary
    System.out.println(names.size());//1

    //Last in First out(LIFO): Undo and Redo, browser history
  }
}
