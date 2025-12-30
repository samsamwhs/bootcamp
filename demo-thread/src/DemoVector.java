import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//! Vector (thread safe) vs ArrayList(non-thread safe)
//! Vector is time-consuming but the result is correct
//! ArrayList is faster but the result is incorrect
public class DemoVector {
  
  public static void main(String[] args) {
    //C++
    //sync ArrayList
    List<String> names = new ArrayList<>(); //LinkedList() / ArrayList()
    // names.add("Jenny");
    // names.add("Leo");
    // names.add("Oscar");

    Runnable task = () -> {
      for(int i = 0; i < 1000; i++){
        names.add("Leo");
      }
    };

    long before = System.currentTimeMillis();
    Thread t1 = new Thread(task); // assign task to the thread
    Thread t2 = new Thread(task); // assign task to the thread
    t1.start(); // Thread t1 starts to execute task
    t2.start(); // Thread t2 starts to execute task

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }

    long after = System.currentTimeMillis();
    long timeUsed = after - before;
    System.out.println(names.size());
    System.out.println("Time used=" + timeUsed);

    

  }
}
