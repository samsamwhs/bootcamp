public class ObjectList<T> {
  private T[] objects;


  public ObjectList(){
    this.objects = (T[]) new Object[0]; // generic array(another code)
    
    


  }

  public static void main(String[] args) {
    //! structure of ArrayList.class, which have it in Java 8 (2014)
    ObjectList<String> strings = new ObjectList<>();
  }
}
