//! Generic 
public class Box3<T extends Animal> { // Class's T definition applies to the type of object and its instance method
  private T value;

  public Box3(T value){
    this.value = value;
  }

  public static void main(String[] args) {
    
    //new Box3<>(new Circle(3));
    //T datatype extended Animal in this class
  
    Box3<Animal> box = new Box3<>(new Cat());
    Box3<Cat> box1 = new Box3<>(new Cat());
    Box3<Dog> box2 = new Box3<>(new Dog());



  }

}
