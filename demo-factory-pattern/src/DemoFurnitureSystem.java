public class DemoFurnitureSystem {
  //! Advantages of Factory Pattern:
  //1. When have a new type of furniture, don't need to revise the exisiting code
  //(open-close coding pattern)
  //2. main logic can be isolated (de-coupling)
  //3. Attribute -> Class

  public static void main(String[] args) {
    Furniture.Style style = Furniture.Style.MODERN;
    int furnitureType = 1; //1 -> chair, 2 -> sofa

    FurnitureFactory factory = FurnitureFactory.create(style); //Modern Factory
    Furniture furniture = Furniture.create(furnitureType, factory); //Type of furniture
    System.out.println(furniture.hasLegs());


  }
}
