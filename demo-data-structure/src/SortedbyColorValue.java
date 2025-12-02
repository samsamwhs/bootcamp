import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedbyColorValue implements Comparator<Ball> {


  // Yellow -> Red -> Blue
  // if same color, higher value goes first

  @Override
  public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == Ball.Color.YELLOW)
      return -1;
    if (b2.getColor() == Ball.Color.YELLOW)
      return 1;
    if (b1.getColor() == Ball.Color.RED)
      return -1;
    if (b2.getColor() == Ball.Color.RED)
      return 1;
    if (b1.getColor() == b2.getColor()) {
      if (b1.getValue() > b2.getValue()) {
        return -1;
      } else {
        return 1;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    Ball b1 = new Ball(Ball.Color.RED, 10);
    Ball b2 = new Ball(Ball.Color.YELLOW, 20);
    Ball b3 = new Ball(Ball.Color.BLUE, 9);
    Ball b4 = new Ball(Ball.Color.RED, 20);
    Ball b5 = new Ball(Ball.Color.BLUE, 90);
    ArrayList<Ball> balls = new ArrayList<>(List.of(b1, b2, b3, b4, b5));
    Collections.sort(balls, new SortedbyColorValue());
    System.out.println(balls);
    // [Ball(color=YELLOW, value=20),
    // Ball(color=RED, value=20), Ball(color=RED, value=10),
    // Ball(color=BLUE, value=90), Ball(color=BLUE, value=9)]


  }



}
