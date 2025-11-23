import java.util.Arrays;
import java.util.Random;

public class Teacher {

  public static int candyCount = 23;
  private static final String[] CANDY_COLORS =
      new String[] {"RED", "BLUE", "YELLOW"};//0,1,2

  private Candy[] candies;


  public Teacher(int candyCount) { // new Teacher (23)
    // random color -> BLUE, RED, YELLOW
    this.candies = new Candy[candyCount];
    for (int i = 0; i < this.candies.length; i++) {
      // new Random() -> random String
      String randomColor = CANDY_COLORS[new Random().nextInt(3)];//3 is exclusive in this random draw
      this.candies[i] = new Candy(randomColor); // = new Candy["BLUE"]:23 blue candy to new teacher
    }
  }
//!need to refer to Vincent's code
  public void distributeAll(Student[] students) {
    // teacher's candy?
    // remove the teacher's candy
    // call distribute
    int candyIdx = 0;
    while (candyIdx < this.candies.length) { // candayCount--:23; --candyCount>=0: counting (22->0) -> 23 times
      for (int i = 0; i < this.candies.length; i++) { // teacher's candy (0-22)
        for (Student student : students) {
        Candy candy = this.candies[candyIdx];
        this.candies[candyIdx] = null;// remove teacher's candy
          this.distribute(student, candy);
          if (++candyCount >= this.candies.length) {
            break;
          }
          //System.out.println(student.getId()+ " "+ candy.getColor());
          this.distribute(student, candy);
        }
      } 
    }
    this.candies = new Candy[0];//to clear teacher's array
  }


  public void distribute(Student student, Candy candy) { // give to who
    student.receiveCandy(candy);// receive at the end
  }

  public static void main(String[] args) {
    // OOP
    // 5 students, 23 Candy
    // Algorithm (算法) -> loop + if + break -> Performance (Time complexity) / space complexity (=money)
    Student[] students = new Student[] {new Student(), new Student(),
        new Student(), new Student(), new Student()};
    while (candyCount > 0) { // candayCount--:23; --candyCount>=0: counting (22->0) -> 23 times
      for (int i = 0; i < students.length; i++) {
        if (candyCount-- <= 0) { // if (candyCount-- <= 0){ (23->1) or if (--candyCount <0){(22->0)
          break; // break for-loop
        }
        students[i].addCandy();
      }
      // after break, go to while loop, no exclusion, no need to plan another mission
    }

    System.out.println(students[0].getCandyCount());// 5
    System.out.println(students[1].getCandyCount());// 5
    System.out.println(students[2].getCandyCount());// 5
    System.out.println(students[3].getCandyCount());// 4
    System.out.println(students[4].getCandyCount());// 4



    // while (--candyCount >=0){ //candayCount--:23; --candyCount>=0: counting (22->0) -> 23 times
    //System.out.println(candyCount);//candayCount--:22
    // for (int i=0; i< students.length; i++){
    // }
    // }



    // Answer: 5 5 5 4 4
    // Student1.getCandyCount() -> 5

    // student id = 3, candyCount?

    // ! Bonus: 3 classes: Teacher, Student, Candy
    // without using static candyCount, we use Teacher object to hold 23 candy
    // Candy object with color, distribute to 5 students (should be object since not just no. )

    // ! Candy.java (color), Teacher (Candy) -> distribute, Student (Candy) -> receiveCandy
    // ! Candy (ownership)
    // Answer: At the end, Teacher has no candy. Each student has their own candy with different color.
    
    
    Student[] students2 = new Student[] {new Student(), new Student(),
        new Student(), new Student()};
    Teacher t1 = new Teacher(37);
    t1.distributeAll(students2);
    System.out.println(Arrays.toString(students2[0].getCandies()));
    System.out.println(Arrays.toString(students2[1].getCandies()));
    System.out.println(Arrays.toString(students2[2].getCandies()));
    System.out.println(Arrays.toString(students2[3].getCandies()));
  }
}

