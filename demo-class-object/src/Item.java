public class Item {
  // !Attribute
  private int quantity;
  private double price;
  private String name;

  // !Empty Constructor

  public Item() {

  }

  // !All args constructor
  public Item(String name, double price, int quantity) {
    this.price = price;
    this.quantity = quantity;
    this.name = name;
  }

  // !Object method
  public double subTotalAmount() {
    return this.price * this.quantity;
  }

  public String getName() {
    return this.name;
  }
}


