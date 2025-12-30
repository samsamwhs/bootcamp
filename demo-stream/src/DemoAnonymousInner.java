public class DemoAnonymousInner {
  
  public static interface Flyable {
    void fly();
  }

  public static class Superman implements Flyable{
    @Override
    public void fly(){
      System.out.println("Superman is flying....");
    }
  }





  public static void main(String[] args) {
    Flyable s1 = new Superman();
    s1.fly();//Superman is flying....
    
    //Anonymous Inner Class
    //no need to have class for interface, limitation: only 1 object e.g. s2 in below case

    Flyable s2 = new Flyable(){
      @Override
    public void fly(){
      System.out.println("Superman is flying");
    }
  };
  s2.fly();//Superman is flying
  }
}
