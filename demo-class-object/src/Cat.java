// ! Class -> blueprint (模), file in hard disk
// ! Object
public class Cat {
  //!Attribute
  //Describe the detail of this class, no limit
  //Only need to create what is neccessary to the program
  private String name; 
  private int age;

  //!Empty Constructor/ No args (means no parameters)
  //Cat() need to be same as Class name
  public Cat(){
    System.out.println("Creating a cat...");
  //default attribute which will be applied to every cat(can be overided)
    this.name = "John"; //"this" = the subject "cat"
    this.age = 10;
  }

  //!All Args Constructor
  public Cat(String name, int age){
    this.name = name;
    this.age = age;
  }

  //!Object Method (Instance Method)
  public String getName(){
    return this.name;
  }
   
  public int getAge(){
    return this.age;
  }

  //main is execution code block
  public static void main(String[] args) {
    //! Create a cat object
    // "new" -> create
    // "Cat()" -> Calling a respective constructor
    // "new Cat()" -> create a cat object

    // "c1" is a label to refer the cat object 
    Cat c1 = new Cat();
    System.out.println("c1="+c1.name);//John
    System.out.println("c1="+c1.age);//10

    new Cat();//No longer able to find the cat object, after creating it.

    Cat c2 = new Cat();
    System.out.println("c2="+c2.name);//John
    System.out.println("c2="+c2.age);//10

    //overide the default attributes
    c2.name = "Jennie";
    c2.age = 12;

    Cat[] cats = new Cat[]{c1, c2};
    System.out.println(cats[1].name);//Jennie
    System.out.println(cats[1].age);//12

    //!Without Class
    String[] names = new String[] {"John", "Jennie"};//= excel's column
    int[] ages = new int[]{10,12};//=excel's column

    //! excel's row -> object which has name and age

    Cat c3 = new Cat("Mary", 8);
    Cat c4 = new Cat();
    System.out.println(c3.getAge());//8
    System.out.println(c4.getAge());//10 

  }
}

