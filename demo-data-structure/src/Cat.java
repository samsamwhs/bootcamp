import java.util.ArrayList;
import java.util.Objects;

public class Cat extends Animal{
  private String name;
  // private int age;
  // private String color;


  public Cat (String name){
    this.name = name;
    // this.age = age;
    // this.color = color;
  }

  public String getName(){ //at least to have getter
    return this.name;
  }

  @Override
  //override equals method like below, imply them are same cat with same name
  public boolean equals (Object obj){
    if (this==obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat c1 = (Cat) obj;
    return Objects.equals(this.name, c1.getName());
  }

  @Override
  public String toString(){
    return "Cat("//
    + "name=" + this.name//
    +")";
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }

  // public int getAge(){
  //   return this.age;
  // }

  // public String getColor(){
  //   return this.color;
  // }



}


