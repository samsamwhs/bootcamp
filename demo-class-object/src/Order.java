import java.math.BigDecimal;
import java.math.RoundingMode;

public class Order {

  // !Attribute
  private Item[] items;

  // !Empty Contructor
  public Order() {
    this.items = new Item[0];
    // 0 mean no place to store which is fine
  }

  // !Object method
  public int numberOfItems() {
    return this.items.length;
  }

  // !Setter
  public void addItem(Item newItem) {
    // add 1 more place to array "newItems"
    Item[] newItems = new Item[this.items.length + 1];

    // copy the original items into the new array
    int idx = 0;
    for (Item item : this.items) {
      newItems[idx] = item;
      idx++;
    }
    // assign the newItem to the last idx
    newItems[idx] = newItem;

    // reassign Order class attribute to new array "newItems"
    this.items = newItems;
  }

  // !Object method
  public double totalAmount() {

    // open an new box "total" to store value/object
    BigDecimal total = BigDecimal.ZERO;

    for (Item item : this.items) {
      // put the value in items array in the box "total"
      total = total.add(BigDecimal.valueOf(item.subTotalAmount())//
          .setScale(2, RoundingMode.HALF_UP));
    }
    return total.doubleValue();
  }

  public double getSubTotal(String itemName) {
    for (Item item : this.items) {
      if (item.getName().equals(itemName)) {
        return item.subTotalAmount();
      }
    }
    return 0.0;
  }

}


