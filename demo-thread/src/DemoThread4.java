import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread4 {
    private AtomicInteger x = new AtomicInteger(0);

  public void increment() {
    this.x.getAndAdd(1);
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) {
    // ! main Thread
    int x = 3;
    x++;
    System.out.println(x); // 4
    x++;
    System.out.println(x); // 5

    DemoThread d1 = new DemoThread();

    // lambda
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        d1.increment();
      }
    };

    // ! t1 is the second thread
    Thread t1 = new Thread(task); // assign task to the thread
    
    // ! t2 is the third thread
    Thread t2 = new Thread(task); // assign task to the thread

    // ! Main Thread release Thread t1
    t1.start(); // Thread t1 starts to execute task

    // ! Main Thread release Thread t2
    t2.start(); // Thread t2 starts to execute task

    // ! Main Thread come here after release t1 and t2
    System.out.println(d1.getX()); // not 200_000
}
