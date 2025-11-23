//! enum is a more powerful class 
//1. User cannot create enum in other class by themselves
//2. All enum values exists in memory without object reference, can call them directly by Color.RED

public enum Color { //all class can use this enum attribute
  RED('R'), // calling constructor, need have related constructor
  YELLOW('Y'), //
  WHITE('W');

  private char initial;//refer to ('R') and so on

  //constructor (private for enum constructor)
  private Color(char initial){
    this.initial = initial;
  }

  public char getInitial(){
    return this.initial;
  }

  //search enum value by attribute (char)
  public static Color valueOf(char initial){
    for (Color color: values()){ //values() = Color.values() which is implicitly exists in enum.class 
      if (color.getInitial() == initial){
        return color;
      }
    }
    return null;
  }




  //!Enum Examples in real world:
  //limited value in the world: 
  // weekday, 
  // only few colors in your project, 
  // poker(Diamond, Club), North, West
  // Mr., Miss,
  // occupation (like things in drop down list)


  

  //!Definition of Enum:
  // 1. Has to be finite values
  // 2. Not add/remove often
  // -> need program change for new requirement 


public static void main(String[] args) {
  System.out.println(valueOf('R'));//RED
}


}

