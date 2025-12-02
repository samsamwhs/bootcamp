public class Dog {
  
  private String name;
  private Dog dog;

  public Dog(String name){
    this.name = name;
  }

  private void setNextDog (Dog newDog){
    this.dog = newDog;
  }

  //only can use while loop for LinkedList
  public void add(Dog newDog){ //add to tail
    //Find the last one (getDog -> null), then setDog (newDog)
    Dog currentDog = this;
    while(currentDog != null){
      if(currentDog.getNextDog()==null){
        currentDog.setNextDog(newDog);
        break; //break while loop
      }
      currentDog = currentDog.getNextDog();
    }
  }



  // public void add(Dog dog){
  //   Dog firstDog = this;
  //   while(firstDog == null){
  //     this.dog = dog;
  //     firstDog = firstDog.getDog();
  //   }
  // }

  public int size(){
    //loop linkedlist structure
     Dog currentDog = this;
     int count = 0;
    while(currentDog != null){
      count++; //can do anything here
      currentDog = currentDog.getNextDog();
    }
    return count;
  }
  
  //remove by index, dog -> dog -> dog
  public void removeByIdx(int idx){
    Dog currentDog = this;
    int count = 0;
    while(currentDog != null){
      count++;
      if (count -1 == idx)
      currentDog = null;
    }
  }
  


  public String getName(){
    return this.name;
  }

  public Dog getNextDog(){
    return this.dog;
  }


  public static void main(String[] args) {
    Dog d1 = new Dog("John");
    d1.add(new Dog("Mary"));
    System.out.println(d1.getNextDog().getName());//Mary
    System.out.println(d1.getNextDog().getNextDog());//null

    d1.add(new Dog("Tommy"));
    System.out.println(d1.getNextDog().getNextDog());


  }
}
