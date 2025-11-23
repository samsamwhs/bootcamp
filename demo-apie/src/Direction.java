public enum Direction {
  NORTH('N',1), //
  WEST('W',-1), //
  SOUTH('S',2), //
  EAST('E',-2);

  public char value;
  public int label;

  private Direction(char value, int label) {
    this.value = value;
    this.label = label;
  }

  public char getValue() {
    return this.value;
  }

  public int getLabel(){
    return this.label;
  }

  //! Instance Method
  public Direction opposite(){
    for (Direction d: Direction.values()){
      if(d.getLabel() * -1 == this.label){
        return d;
      }
    }
    return null; //impossible since author design enum label



//     if (values().equals(EAST)){
//       return WEST;
//     }else{
//       if (values().equals(NORTH)){
//         return SOUTH;
//     }else{
//       if (values().equals(SOUTH)){
//         return NORTH;
//     }else{
//       return EAST;
//     }
//   }
// }
}

//!Static Method(check if 2 direction value are opposite)
  public static Boolean isOpposite (Direction d1, Direction d2){
    return d1.getLabel() * -1 == d2.getLabel();//boolean already have if meaning
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.opposite());//SOUTH
    System.out.println(Direction.isOpposite(WEST, EAST));//false
  }



}
