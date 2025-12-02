import java.util.ArrayList;
import java.util.HashMap;

//! Generic supports multiple Type Definitions
// Entry
public class CustomMap<K, V> { // <K,V> can be any letters

  // usually don't use K and V which are Java key words

  // private K key;
  // private V value;

  private ArrayList<CustomEntry<K, V>> entries;

  public CustomMap() {
    this.entries = new ArrayList<>();
  }

  public void put(K key, V value) {
    this.entries.add(new CustomEntry<>(key, value));
  }

  // get(K key)
  public V get(K key) {
    if (key == null){
      return null;
    for (CustomEntry<K, V> entry : this.entries) {
      if(entry.getKey().equals(key))
        return entry.getValue();
    }
    return null;
}
  }
//containsKey()
//containsValue()
//size()
//isEmpty

  public static void main(String[] args) {
    HashMap<String, String> map1 = new HashMap<>();
    map1.put("banana", "John");

    CustomMap<String, String> map2 = new CustomMap<>();
    map2.put("banana", "John");

    System.out.println();


  }

}
