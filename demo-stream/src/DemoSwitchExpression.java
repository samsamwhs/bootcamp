
public class DemoSwitchExpression {
  //!switch (Java 1.0)
  //Disadvantage : 1. no range checking 2. need to put break proactively
public static void main(String[] args) {
  
  char grade = 'B';
  switch (grade) {
    case 'A':
      System.out.println("Doing something for grade A");
      break;
    case 'B':
      System.out.println("Doing something for grade B");
      break;
    case 'C':
      System.out.println("Doing something for grade C");
      break;
    default: //else
      System.out.println("Doing something for other grades...");
  }

// without break
// Doing something for grade B
// Doing something for grade C
// Doing something for other grades...

//with break: Doing something for grade B



//no range checking
  int score = 80;
  char examGrade = ' ';

  //! something like void method
  switch (score){
    case 80:
     break;
    case 81:
     break;
    case 82:
     break;
    default:
     break;
  }

  //!Java 14: Switch Expression
  //! 1. enum + Switch Expression:
  //! Java helps to check if all enum value has been considered & avoid enum value in compiled time
  //! 2. simple logic for return value
  //! 3. support return value or void method
  Color[] colors = new Color[] {Color.RED, Color.YELLOW, Color.RED, Color.BLUE};
    //change color to int
    //sum
  int sum = 0;
  for (Color color : colors){
    int value = switch (color){ //return int 
      case RED -> 7;
      case YELLOW -> 9;
      case BLUE -> 15;
    };// this is 1 sentence
    sum += value;
  }
  System.out.println("sum=" + sum);//sum=38

  //Covert String
  String day = "Tuesday";
  //! Force to use default, when you apply String for Switch Expression
  String dayDescription = switch(day){
    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
    case "Saturday", "Sunday" -> "Weekend";
    default -> "Unknown";
  };
  System.out.println("Day Description=" + dayDescription);

  //! if lambda logic contain 1 line of code, use "->" without yield
  //! yield for multiple lines of codes OR "->" for 1 line of code
  //yield = return, only can be use in switch ONLY

  Direction d1 = Direction.WEST;
  int value = switch(d1){
    case EAST:
      yield 10;
    case SOUTH:
      yield 10;
    case WEST:
      yield 10;
    case NORTH:
      yield 10;
  };
  }

  public static enum Direction {
    EAST, SOUTH, WEST, NORTH,;
  }

  public static int covertDirection(Direction direction){
  int value = switch(direction){
    case EAST:
      yield 10;
    case SOUTH:
      yield 10;
    case WEST:
      yield 10;
    case NORTH:
      yield 10;
  };
  return value;
  }


  public static enum Color{
    RED, BLUE, YELLOW,;
  }



}
