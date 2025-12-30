import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
    pq.add("Steven");
    pq.add("Alex");
    pq.add("Cathy");

    // PriorityQueue has no ordering during the add process,
    // only have order by alphabet when poll, so the performance of poll will be slower

    System.out.println(pq);// [Alex, Steven, Cathy]
    System.out.println(pq.poll());// Alex
    pq.add("Ben");
    System.out.println(pq.poll());// Ben
    System.out.println(pq.poll());// Cathy
    System.out.println(pq.poll());// Steven

    pq.add("Anna");
    pq.add("Alex");
    pq.add("Amy");
    pq.add("A");
    System.out.println(pq.poll());//A
    System.out.println(pq.poll());//Alex
    System.out.println(pq.poll());//Amy
    System.out.println(pq.poll());//Anna
    System.out.println(pq.size());//0

    //Example 2
    Queue<Integer> integers = new PriorityQueue<>(new SortByDesc());
    integers.add(1);
    integers.add(3);
    integers.add(5);
    integers.add(7);
    System.out.println(integers.poll());//7
    System.out.println(integers.poll());//5
    System.out.println(integers.poll());//3
    System.out.println(integers.poll());//1

    Queue<Integer> integers1 = new PriorityQueue<>();
    integers1.add(2);
    integers1.add(4);
    integers1.add(6);
    integers1.add(8);
    System.out.println(integers1.poll());//2
    System.out.println(integers1.poll());//4
    System.out.println(integers1.poll());//6
    System.out.println(integers1.poll());//8

  }

    public static class SortByDesc implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
      return i1 > i2 ? -1 : 1; // i1 > i2 -> -1 else 1
    }
  }
}
