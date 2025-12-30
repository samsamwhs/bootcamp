import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        List<String> names = List.of("Mary", "Jenny", "Tommy", "Alex", "Sue");

        // !filter()
        List<String> names2 = names.stream()// once stream is called, List will change to Stream<String>
                .filter(n -> n.length() > 4)// Stream<String>
                .collect(Collectors.toList());// List<String>

        System.out.println(names);// [Mary, Jenny, Tommy, Alex, Sue]
        System.out.println(names2);// [Jenny, Tommy]

        // filter exercise

        Person p1 = Person.builder().name("Tommy").age(18).build();
        Person p2 = Person.builder().name("Jenny").age(30).build();
        Person p3 = Person.builder().name("Benny").age(42).build();
        Person p4 = Person.builder().name("John").age(23).build();
        List<Person> persons = List.of(p1, p2, p3, p4);
        List<Person> persons2 = persons.stream()//
                .filter(p -> p.getName().contains("J") && p.getAge() > 25)//
                .collect(Collectors.toList());
        System.out.println(persons2);// [Person(name=Jenny, age=30)]


        // "bcd" compareTo "abc"
        Comparator<String> sortedByDesc =
                (s1, s2) -> s1.compareTo(s2) > 0 ? -1 : 1;

        // !sorted()
        List<String> names3 = names.stream()//
                .filter(n -> n.length() % 2 == 1)//
                .sorted(sortedByDesc).collect(Collectors.toList());

        System.err.println(names3);// [Tommy, Sue, Jenny]



        // !map()

        List<String> personNames = persons.stream()//! -> re-structure List<Person> to List<String>
                .filter(p -> p.getName().endsWith("y"))//
                .map(p -> p.getName())
                .collect(Collectors.toList());
        System.out.println(personNames);// [Tommy, Jenny, Benny]


        List<Integer> personAges = persons.stream()//
                .filter(p -> p.getName().endsWith("y"))//
                .map(p -> p.getAge())//
                .collect(Collectors.toList());
        System.out.println(personAges);// [18, 30, 42]

        // ! print out
        persons.stream()//
                .forEach(p -> System.out.println(
                        "Person, age=" + p.getAge() + ",name=" + p.getName()));

        // ! collect to List
        List<String> staffNames =
                List.of("Mary", "Jenny", "Tommy", "Jenny", "Sue", "Tommy");

        List<String> uniqueStaffNames = staffNames.stream()//
                .distinct()//
                .collect(Collectors.toList());
        System.out.println(uniqueStaffNames);//[Mary, Jenny, Tommy, Sue]

        // ! collect to Set
        Set<String> uniqueStaffNames2 = staffNames.stream()//
                .collect(Collectors.toSet());
        System.out.println(uniqueStaffNames2);//[Sue, Jenny, Tommy, Mary]

        //Summary : Intermediate operation, terminal operation

        List<String> names4 = List.of("Sue","Jenny","Benny");
        
        List<Character> chs = names4.stream()//
          .filter(e -> e.endsWith("y")) // intermediate operation -> Stream<String>
          .map(e -> e.charAt(0)) // intermediate operation -> Stream<Character>
          .collect(Collectors.toList()); //terminal operation -> List<Character>
        System.out.println(chs);//[J, B]

        List<String> names5 = List.of("Sue","Jenny","Benny","Benny");
        long numberOfName = names5.stream()//
          .distinct()// intermediate operation -> Stream<String>
          .count();// Terminal operation -> long
        System.out.println(numberOfName);//3

        // map count
        long numberOfName2 = names5.stream()//
          //.map(e -> e.length())//! map() won't affect the result of count()
          .map(e -> {
            System.out.println("hello" + e);
            return e.length();
          }) //! map() is skipped when using .count() as terminal
          .count();
        System.out.println(numberOfName2);//4

        Person p10 = Person.builder().age(12).name("John").build();
        Person p11 = Person.builder().age(40).name("Kelly").build();
        Person p12 = Person.builder().age(25).name("Jacky").build();
        List<Person> staffs = List.of(p10,p11,p12);
        
        List<String> staffNames2 = staffs.stream()//
          .filter(e -> {
            System.out.println("filter name=" + e.getName());
            return e.getAge() >= 20;
          })//
          .map(e -> {
            System.out.println("map name=" + e.getName());
            return e.getName().toUpperCase(); //change to Stream<String>
          }) 
          .collect(Collectors.toList());
        System.out.println(staffNames2);//[KELLY, JACKY]

        //Stream.class
        Stream<String> emails = Stream.of("leo@gmail.com","jacky@gmail.com","jenny@gmail.com");
        long numOfValidEmail = emails.filter(e -> e.contains("@"))//
          .count();
        System.out.println(numOfValidEmail);//3
    }
}

