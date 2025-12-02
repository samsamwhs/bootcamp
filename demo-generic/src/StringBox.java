public class StringBox {
  
  private String value;

  public StringBox (String value){
    this.value = value;
  }

  public String getValue(){
    return this.value;
  }

  public static void main(String[] args) {
    //Box of String
    //Box of Integer

    //what if we need a flexible design for storing different type of values
    //1. write different class with specific datatype
    //2. set Object attribute only can store different type of object but can't to call the related methods
    //3. Generic - Box<T>
    
    Box<String> stringBox = new Box<>("hello");
    Box<Integer> integerBox = new Box<>(100);

    //!Generic just help us not to write many class for different datatype only with same attributes, 
    //! after declared the datatype when creating new box in main
    //! integerBox = "hello"; integerBox has been declared as Integer object during intialization

    //If need a box to store anything at anytime
    //but can't to call the related methods
    //Polymorphism
    Box<Object> superBox = new Box<Object>("hello");
    superBox.setValue(Double.valueOf(10.5));

    superBox.setValue("abc");
    //superBox.getValue().charAt(0);
    //Compile time error: cannot call method based on value instead of reference
    //object reference is Object now
    //Object.class is parent, cannot call child's method




  }


}

