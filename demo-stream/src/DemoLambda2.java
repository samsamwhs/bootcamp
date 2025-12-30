import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoLambda2 {
  public static void main(String[] args) {
    // Java 5
    // Generic -> ArrayList<String>

    // Java 8
    // Lambda -> 1. Data Structure advanced features 2. stream

    // For-loop classic code
    List<Square> squares =
        List.of(new Square(3.5), new Square(7.0), new Square(2.3));
    // before Lambda
    for (Square square : squares) {
      System.out.println(square.area());
    }
    // Lambda (after 2000)
    squares.forEach(s -> System.out.println(s.area()));

    //! to put new value to database when checked there is no relevant key
    Map<Character, String> fruitMap = new HashMap<>();
    fruitMap.put('a', "apple");
    fruitMap.put('b', "banana");

    fruitMap.computeIfAbsent('a', c -> "kiwi");
    System.out.println(fruitMap);
    fruitMap.computeIfAbsent('c', c -> "kiwi");
    System.out.println(fruitMap);

  }
}
