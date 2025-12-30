public class Person {
  private String name;
  private int age;

  @Override
  
  public String toString(){
    return "Person("//
    + "name=" + this.name//
    + ", age=" + this.age//
    + ")";
  }

  // first step
  public static Builder builder() {
    return new Builder();
  }

  // last step
  public Person(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  //Builder class
  public static class Builder {
    private String name;
    private int age;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }

  public static void main(String[] args) {
    Person person = Person.builder()//
        .name("John")//
        .age(30)//
        .build();

    Person person2 = Person.builder().age(30).build();
  }
}

