public class DemoStatic {
  //! static variable
  public static String content = "";


  //! Final variable
  public final String https = "https";

  //! Static Final variable (常數/定義)
  //Naming convention: snake case + captial letter
  public static final int HOURS_PER_DAY = 24; 


  private int x;
  private int y;

  public DemoStatic(int x, int y){
    this.x = x;
    this.y = y;
  }

  public DemoStatic(){

  }

  public static void main(String[] args) {
    // Call static variable
    content += "abc";
    content += "def";
    System.out.println(content);// abcdef
    // Formally Call static variable 
    System.out.println(DemoStatic.content);//abcdef

    //!Call static method
    System.out.println(DemoStatic.sum(10,3));//13

    //!Call instance method
    DemoStatic ds = new DemoStatic();
    System.out.println(ds.subtract(10,3));//7

    //!Call instance method after change setting
    DemoStatic ds2 = new DemoStatic(10,3);
    System.out.println(ds2.multiply());//30

    //!Call final variable
    DemoStatic ds3 = new DemoStatic();
    System.out.println(ds3.https);//https
    //Final Variable cannot be re-assigned. Just read.
    //ds3.https = "hello";

    //!Call Statis Final variable
    System.out.println(DemoStatic.HOURS_PER_DAY);//24
  }


  //!Object's method can access static variable and method
  //!Static method cannot access object, doesn't make sense to call "this",
  //!because static method belongs to Class, not object


    //!Static method
    public static int sum(int x,int y){
    return x + y;
  }
    //!instance method
    //not a good instance method, need to input attributes 
    public int subtract(int x, int y){
    sum(30,3);
    return x-y;
  }


  public int multiply(){
    return this.x * this.y;
  }
}
