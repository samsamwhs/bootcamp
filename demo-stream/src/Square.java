

public class Square {
  private double length;


  // 3 Square constructor
  public Square(double length) {
    this.length = length;
  }

  // 4 other instance method for Square

  public double area() {
    return this.length * this.length;
  }

  // 2 static method builder
  public static Builder builder() {
    return new Builder();
  }

  // 1 builder class frame
  public static class Builder {
    private double length;

    public Builder length(double length) {
      this.length = length;
      return this;
    }

    public Square build() {
      return new Square(this.length);
    }

  }

  // outcome
  public static void main(String[] args) {
    Square s1 = Square.builder()// static method builder to return builder obj
        .length(7)// instance method of builder ".length()" to return builder obj
        .build();// return Square obj for Square constructor
  }



}
