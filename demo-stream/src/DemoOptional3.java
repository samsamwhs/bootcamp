import java.util.Optional;

public class DemoOptional3 { //!Cat has Optional Obj, and Optional Obj has name -> wasting memory
  private Optional<String> name; //means the object can be no name 

  //! what is the problem of returning null after getName()
  public Optional<String> getName (){
    return this.name;
  }

  public static void main(String[] args) {
    //Cat c1 = new Cat("Jenny");
    //if (c1.getName().equals("Jenny")) -> if name = null, .equals will be problem
    
    //! Summary: As developer, always need to do null check before using the obj
    //1. Avoid
    //should be : if (c1.getName() != null && c1.getName().equals("Jenny"))

    
    //2. Transfer -> Throw
  }


}
