public class Helloworld {
  public static void main(String[] args) {         //starting command
    System.out.println("Hello World");

int numericGrade = 78;
char letterGrade = 'x';
// "Case 78" fulfill? What's next?
switch (numericGrade) {
    case 50: {
        letterGrade = 'B';
    }
    case 78: {
        letterGrade = 'A';
    }
    case 80: {
        letterGrade = 'D';
    }
    default: {
        letterGrade = 'C';
    }
}

System.out.println("The letter grade is " + letterGrade); // letterGrade = ?



}
}
