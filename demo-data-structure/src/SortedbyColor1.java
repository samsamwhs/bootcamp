import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedbyColor1 implements Comparator<Ball> {

  // BLUE -> RED -> YELLOW
  // (-1) b1, (1) b2
  @Override
  public int compare(Ball b1, Ball b2) {
    if (b1.getColor() == Ball.Color.BLUE)
      return -1;
    if (b2.getColor() == Ball.Color.BLUE)
      return 1;
    if (b1.getColor() == Ball.Color.RED)
      return -1;
    if (b2.getColor() == Ball.Color.RED)
      return 1;
    return -1;
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Ball.Color.RED, 10);
    Ball b2 = new Ball(Ball.Color.YELLOW, 20);
    Ball b3 = new Ball(Ball.Color.BLUE, 9);

    ArrayList<Ball> balls = new ArrayList<>(List.of(b1,b2,b3));
    Collections.sort(balls, new SortedbyColor1());
    System.out.println(balls);
    //[Ball(color=BLUE, value=9), Ball(color=RED, value=10), Ball(color=YELLOW, value=20)]


  }
}
