import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
  public static void main(String[] args) {
    int x = 3;
    x++; //non-thread safe
    System.out.println(x);//4

    AtomicInteger y = new AtomicInteger(3);
    y.getAndAdd(1); //thread safe, Atomic use it's method to make it thread safe instead of using sychonized
    System.out.println(y);//4

    Atomic



  }
}
