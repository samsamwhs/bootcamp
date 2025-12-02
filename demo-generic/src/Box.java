public class Box<T> {
  
  private T value; //no need to declare datatype

  public Box (T value){
    this.value = value;
  }

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value = value;
  }

  public static void main(String[] args) {
    //Generic
    Box<Animal> animalBox = new Box<>(new Cat());
    //Animal is parent class of Cat and Dog, so can store Cat and Dog
    //Box<Animal> = Box2 now, can store Cat and Dog and call Cat and Dog method

    //animalBox.askAnimalToEat();
    //=arraylist?

    
  }
}
