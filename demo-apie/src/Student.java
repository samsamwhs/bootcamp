import java.time.LocalDate;

public class Student extends Human implements Eatable {
  // !Statis Variable(靜態變量)
  // !Variable in another space from the class
  public static int counter = 0;
 

  // ! Instance Variable (物件變量)
  private int id;
  private String name;// can be private String name = "John";
  private int candyCount;

  //for bonus question
  private Candy[] candies;


  public Student() {
    this.id = ++counter;
    this.candyCount = 0;
    this.candies = new Candy[0];
  }

  // all args constructor
  public Student(String name) {
    this.id = ++counter; // counter++ :start from 0,++counter: start from 1
    this.name = name;
    this.candyCount = 0;// default no.of candy for student
  }

  public Candy[] getCandies() {
    return this.candies;
  }

  public int getCandyCount() {
    return this.candyCount;
  }

  // just can add, no need setter to reset the no. of candy
  public void addCandy() {
    this.candyCount++;
  }

  @Override
  public void eat(){
    System.out.println("Student is eating...");
  }

  public void receiveCandy(Candy newCandy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    int idx = 0;
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[idx] = this.candies[i];
    }
    newCandies[idx] = newCandy;
    this.candies = newCandies;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // ! By default for Inheritance, child class (Student) don't need to rewrite parent method
  // ! this is to override parent's getHeight
  @Override // to rewrite or cover parent's attribute
  public double getHeight() {
    System.out.println("Student's getHeight");
    return super.getHeight() / 100.0;
    //super.-> human, cannot just super.height, because height is private
  }

  public LocalDate getParentDob() {
    return super.dateOfBirth;// Parent Container expose dateOfBirth directly (public)
  }


  public static void main(String[] args) {
    Student s1 = new Student("John");
    System.out.println(s1.getId());// 1

    Student s2 = new Student("Steven");
    System.out.println(s2.getId());// 2
  }
}


