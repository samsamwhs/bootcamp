import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    //! Optional Method User: Use isPresent() / ifPresent() to check if the value exists.
    Integer[] ages = new Integer[0];
    Optional<Integer> maxAge = findMaxNumber(ages);
    System.out.println(maxAge);//Optional.empty
    if(maxAge.isPresent()){
      System.out.println("Max age=" + maxAge.get()); 
      //!must check isPresent() to check if the value exists, before maxAge.get())
      //!now maxAge no longer become null
    }else{
      System.out.println("Not Found.");//Not Found.
    }

    if (!maxAge)

    //Find Food, search database, if found, return food, not found, return String "Not found"
    //! not return same datatype
    //Therefore, if found, return Optional.of(Food), else Optional.empty()
  }


  //Lambda



  //searching
  //! Optional Method Author: Use Optional to present "not found"
  public static Optional<Integer> findMaxNumber(Integer[] numbers){
    //numbers -> null || numbers.length = o
    if (numbers == null)
      throw new IllegalArgumentException("numbers should not be null.");
    if (numbers.length == 0)
      return Optional.empty();
    //! After using Optional design for the method, we don't need to return null anymore
    int max = numbers[0];
    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] > max)
        max = numbers[i];
    }
    return Optional.of(max);
  }
}
