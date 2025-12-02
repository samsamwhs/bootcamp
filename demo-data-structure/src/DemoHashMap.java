import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
  
  public static void main(String[] args) {
    //HashMap -> consist of Key and Value
    //! Value -> can be any type of object, String, int, double....

    //Key & value
    // Fruits: orange, apple, banana
    // Animals: rabbit, monkey

    ArrayList <String> fruits = new ArrayList<>(List.of("orange","apple", "banana"));
    ArrayList <String> animals = new ArrayList<>(List.of("rabbit","monkey"));

    //<Key,value>, .put(Key,value) to add to HashMap dictionary
    HashMap<String,ArrayList<String>> dictionary1 = new HashMap<>();
    //HashMap<String,ArrayList<String>> dictionary1 = new HashMap<String,ArrayList<String>>();
    dictionary1.put("fruits",fruits);
    dictionary1.put("animals",animals);

    //we use Key to find corresponding values, .get(Key)
    ArrayList<String> listOfFruits = dictionary1.get("fruits");
    System.out.println(listOfFruits);//[orange, apple, banana]
    ArrayList<String> listOfAnimals = dictionary1.get("animals");
    System.out.println(listOfAnimals);//[rabbit, monkey]

    //Add an new animal
    //dictionary1.get("animals") -> return arraylist object -> call add()
    dictionary1.get("animals").add("tiger");
    
    //both to get the address, so no difference
    System.out.println(listOfAnimals);//[rabbit, monkey, tiger]
    System.out.println(dictionary1.get("animals"));//[rabbit, monkey, tiger]

    animals.add("lion");
    System.out.println(listOfAnimals);//[rabbit, monkey, tiger, lion]
    System.out.println(dictionary1.get("animals"));//[rabbit, monkey, tiger, lion]

    //the definition of put ->
    // hashMap.put() -> 1. if key exists, override the value, otherwise, add an new entry
     System.out.println(listOfFruits);
    // dictionary1.put("fruits","lemon")-> "lemon" is not ArrayList which is not matched with our preset definition of value
    //HashMap<String,ArrayList<String>> dictionary1 = new HashMap<>();
    
    dictionary1.put("fruits", new ArrayList<>(List.of("lemon")));//new arraylist to override original fruit arraylist
    System.out.println(dictionary1);//{fruits=[lemon], animals=[rabbit, monkey, tiger, lion]}

    System.out.println(fruits);//[orange, apple, banana]
    //object reference still exists, so we still can find the original fruit arraylist

    //Example 2: Key=Integer, Value= String
    //!variable name cannot use Java keywords
    HashMap <Integer, String> classmates = new HashMap<>();
    classmates.put(1,"John");//Java will autobox int "1" to Integer
    //= classmates.put(Integer.valueOf(1),"John");
    //int y = Integer.valueOf(1); -> unbox

    System.out.println(classmates);//{1=John}

    classmates.put(1,"John");
    classmates.put(2,"Peter");
    System.out.println(classmates.get(2));//Peter

    //Replace key=2 by Mary (Peter-> Mary)
    classmates.put(2,"Mary");
    System.out.println(classmates.get(2));//Mary

    //if key not exists, get() will return null
    System.out.println(classmates.get(3));//null
   // System.out.println(classmates.get(3).charAt(0));//runtime error

    //size: the number of entries
    System.out.println(classmates.size());//2

    //remove
    System.out.println(classmates.remove(1));//John; Java remove and return removed value

    System.out.println(classmates.get(2));//Mary
    System.out.println(classmates);//{2=Mary}
    System.out.println(classmates.size());//1

    //isEmpty
    System.out.println(classmates.isEmpty());//false

    //Loop HashMap (to loop entries)
    //Entry Object has 2 methods: getKey(), getValue()
    //for loop is used for if-else to eliminate and restructure, like searching, counting
    for(Map.Entry<Integer,String> student : classmates.entrySet()){
      System.out.println("student no=" + student.getKey()+ ", student name=" + student.getValue());
    }


    //containKey() -> for loop, should be more faster since looping hashcode
    System.out.println(classmates.containsKey(2));//true
    System.out.println(classmates.containsKey(1));//false

    //containValue() -> for loop
    System.out.println(classmates.containsValue("Mary"));//true
    System.out.println(classmates.containsValue("mary"));//false
  }
}
