// ! Java 16
// ! Attributes (to be Final attribute by default) means cannot re-set after initialization
public record Cat(String name, int age) {

  // No need to have below things:
  // Attribute: write above

  // Constructor: cannot have empty constructor

  // getter -> no "get" prefix

  // no setter
  // record like history, we won't revise history

}
