public class Tiger {
  public static final String RED = "RED"; //預設定義

  private String color;


  public Tiger(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public boolean isRed(){
    return this.color.trim().equalsIgnoreCase(Tiger.RED); //static variable called by class
  }



public static void main(String[] args) {
  Tiger t1 = new Tiger("RED");
  Tiger t2 = new Tiger("red");
  Tiger t3 = new Tiger("Red");
  Tiger t4 = new Tiger("RED ");

  //check if t2 is red color? //
  if (t2.getColor().equals("RED")){

  }

  Tiger t5 = new Tiger(Tiger.RED);


  //! Without enum, we cannot ensure user/caller passing the right parameter to call constructor
  // User still can create tiger with free text

}
}
