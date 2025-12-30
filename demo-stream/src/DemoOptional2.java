//!Wrong usages for Optional
public class DemoOptional2 {
  public static void main(String[] args) {
    
  }

  //! What if someone passes null as parameters to call this method?
  public static int sum(OptinalInteger x, Integer y){
   
    
  }

  //! Correct Approach
  public static int sum2(Integer x, Integer y){
    //null check -> throw (OK)
    if (x == null || y == null){
      throw new IllegalArgumentException("x and y should not be null.");
    return x + y;
    }
  }
}
