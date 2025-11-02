import java.math.BigDecimal;
import java.math.RoundingMode;

public class Customer {

  // customer has many orders, an order has many items
  // Item: quantity x price
  // Classes: Customer, Order, Item

  // !Attribute
  private Order[] orders;// create array

  // !Constructor : set rules to create new object, both  
  public Customer() {
    this.orders = new Order[0];
  }

  // !Setter

  public void addOrder(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1];

    int idx = 0;
    for (Order order : this.orders) {
      newOrders[idx++] = order;
    }
    newOrders[idx] = newOrder;
    this.orders = newOrders;
  }

  //! Object method
  public boolean isVip(){
    BigDecimal total = BigDecimal.ZERO;
    for (Order order : this.orders){
      total = total.add(BigDecimal.valueOf(order.totalAmount()))//
      .setScale(2,RoundingMode.HALF_UP);
    }
    return total.doubleValue() >= 10000;
  }


  public static void main(String[] args) {
    // Place item into shopping cart
    // checkout -> new order (total amount)
    // new order -> order history

    // "ABC" 2.5, 3
    // "DEF" 9.9, 10
    // "IJK" 999.9,2
    Order o1 = new Order();
    o1.addItem(new Item("ABC", 2.5, 3));
    o1.addItem(new Item("DEF", 9.9, 10));
    o1.addItem(new Item("IJK", 999.9, 2));

    System.out.println(o1.totalAmount());

    // Given Item name, find the subtotal
    // "DEF" -> 99 (9.9 x 10)
    System.out.println(o1.getSubTotal("DEF"));// 99.0

    Customer c1 = new Customer();
    c1.addOrder(o1);
    o1.

  }



}
