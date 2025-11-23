public class Panda {
  private Color color;//enum attribute

  //! enum as parameter in constructor -> Encapsulation, maintain data integrity, 
  //! no other way to create Panda
  //! String datatype is too flexiable for user
  public Panda(Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    Panda p1 = new Panda(Color.RED);
    Panda p2 = new Panda(Color.WHITE);
    //new Panda("RED"); //You cannot create enum by yourself

    //check if p2 is RED?
    //! we use == to compare enum value, no need equal
    if (p2.getColor() == Color.RED){ //since getColor() and Color.RED is object reference
      System.out.println("The Panda p2 is RED.");
    }

    Color color = Color.valueOf('R');
    System.out.println(color);//"RED", enum has toString method, that's why can print out directly
  }
}
