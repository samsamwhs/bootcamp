public class Candy {
  private final String color;
  //cannot change color; good presentation instead of just no setter in the class
  //static final = not store in object itself
  public Candy (String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public String toString(){
    return "Candy["//
      + "color=" + this.color//
      + "]";
  }
}
