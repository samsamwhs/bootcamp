import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
  private Color color;
  private int value;

  public Ball(Color color, int value){
    this.color = color;
    this.value = value;
  }

  //getter

  public Color getColor(){
    return this.color;
  }

  public int getValue(){
    return this.value;
  }


  //toString

  @Override

  public String toString(){
    return "Ball("//
    + "color=" + this.color//
    + ", value=" + this.value//
    + ")";
  }


  //this.ball vs ball
  //Yellow -> Blue -> Red
  //int -1 (this), 1(ball)
  @Override
  public int compareTo(Ball ball){
    if (this.color == Color.YELLOW)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    if (this.color == color.BLUE)
      return -1;
    if (ball.getColor() == color.BLUE)
      return 1;
    return -1;
  }



  //"static" to store a class under a class
  public static enum Color{
    RED, YELLOW, BLUE,;
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Color.RED, 10);
    Ball b2 = new Ball(Color.YELLOW, 20);
    Ball b3 = new Ball(Color.BLUE, 9);

    ArrayList<Ball> balls = new ArrayList<>(List.of(b1,b2,b3));

    //balls.add -> add to tail
    //have .addFirst & .addLast now
    //!try at home

    System.out.println(balls);
    //[Ball(color=RED, value=10), Ball(color=YELLOW, value=20), Ball(color=BLUE, value=9)]
    //ArrayList must have order



    //Sort
    Collections.sort(balls);
    System.out.println(balls);
    //[Ball(color=YELLOW, value=20), Ball(color=BLUE, value=9), Ball(color=RED, value=10)]


  }



}

