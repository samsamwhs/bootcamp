import java.util.Objects;

public class Bird {
  private String name;
  private int age;

  public Bird(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // ! Three MUST override instance Methods
  @Override
  public String toString() {
    return "Bird("//
        + "name=" + this.name//
        + ",age=" + this.age//
        + ")";
  }

  // ! Method Signature = method name + parameter list
  @Override // to verify if parent has this method, it's a checking
  public boolean equals(Object o) { // cannot be "public boolean equals(Bird bird)"
    // if name & object are same, then must be the same bird
    // ! this vs o (target)
    if (this == o) { // == : checking address, this: bird object
      return true;
    }
    if (!(o instanceof Bird)) {// verify the object is from specific class at runtime
      return false;
    }
    // this -> bird object, o -> bird object
    Bird bird = (Bird) o;// downcast
    return this.name.equals(bird.getName())//
        && this.age == bird.getAge();
  }

  //! the definition of equals() and hashCode() must be SAME.
  //! hashCode () will return a unique value
  //! "hello" vs "hello1" -> they have a different hash code
  @Override
  public int hashCode() { // hashcode() is another method
    return Objects.hash(this.name,this.age);//Objects is a class for static method
  }
  //import Objects : import java.util.Objects;



  public static void main(String[] args) {
    Bird b1 = new Bird("John", 3);
    Bird b2 = new Bird("John", 3);
    System.out.println(b1.equals(b2));// false -> true after override equals instance method
    // cuz equals method in Object class is checking the object in memory, they (b1 & b2) are 2 objects
    System.out.println(b1.hashCode() == b2.hashCode());//true

    b2.setAge(10);
    System.out.println(b1.equals(b2));// false
    System.out.println(b1.hashCode() == b2.hashCode());//false

  }
}
