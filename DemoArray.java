import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // The way to store value: 8 primitives, 8 wrapper class, 1 String (17 types)
    // New way to store a set of same type of values
    // new int[4] -> array object numbers
    int[] arr = new int[4];
    // assign values into an array
    arr[0] = 100;
    arr[1] = 70;
    arr[2] = 2_100_000_000;
    arr[3] = -200;

    // ! ArrayIndexOutOfBound (error: not inside our array object)
    // arr[-1] = xxx;
    // arr[4] = xxx;

    // for loop to read array
    for (int i = 0; i < 4; i++) {
      System.out.println(arr[i]);// 0,1,2,3
    }

    // long array, with length 3
    // 99,5,40
    long[] arr1 = new long[3];
    arr1[0] = 99L;
    arr1[1] = 5L;
    arr1[2] = 40L;

    for (int i = 0; i < 3; i++) { // 0,1,2
      if (arr1[i] % 2 == 0) {
        System.out.println(arr1[i]);
      }
    }

    System.out.println(arr1.length);// 3

    // boolean array, with length 4
    // false, true, false, true

    boolean[] arr2 = new boolean[4];
    arr2[0] = false;
    arr2[1] = true;
    arr2[2] = false;
    arr2[3] = true;

    // count how many false in boolean array

    int falseCounter = 0;
    for (int i = 0; i < 4; i++) {
      if (arr2[i] == false) {
        falseCounter++;
      }
    }
    System.out.println(falseCounter);// 2

    // for loop -> find out the max value in arr4
    int[] arr4 = new int[5];
    arr4[0] = 10;
    arr4[1] = -4;
    arr4[2] = 90;
    arr4[3] = 100;
    arr4[4] = -20;

    int max = 0;
    int idxMaxValue = 0;
    for (int i = 0; i < 5; i++) {
      max = Math.max(max, arr4[i]);
      idxMaxValue = arr4[i];
    }
    System.out.println("max="+max);// 100
    System.out.println("idxMaxValue="+ idxMaxValue);

    int max1 = arr4[0];
    int min1 = arr4[0];
    int idxMaxValue1 = 0;
    for (int i = 0; i < arr4.length; i++) {
      if (arr4[i] > max1) {
        max1 = arr4[i];
        idxMaxValue1 = i;
      } else {
        if (arr4[i] < min1) {
          min1 = arr4[i];
        }
      }
    }
    System.out.println("max1="+max1);// 100
    // find the min value in arr4
    System.out.println("min1="+min1);// -20
    // find the index of the max
    System.out.println("idxMaxValue1="+idxMaxValue1);// 3

    // String[]
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Jennie";
    names[2] = "Steve";

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);// John, Jennie, Steve
    }

    // loop: Find name startsWith J, print their name
    // names -> array
    // names -> String
    for (int i = 0; i < names.length; i++) {
      if (names[i].startsWith("J")) { // ==true: names[i].startsWith("J"),==false: !names[i].startsWith("J")
        System.out.println(names[i]); // John, Jennie
      }
    }
    // loop: Find the names with substring "nn"
    for (int i = 0; i < names.length; i++) {
      if (names[i].contains("nn")) {
        System.out.println(names[i]); // Jennie
      }
    }
    for (int i = 0; i < names.length; i++) {
      if (names[i].indexOf("nn") != -1) {
        System.out.println(names[i]);
      }
    }
    // charAt
    // loop: Find the index of 'e' for each name, put them in an array
    int eCount = 0;
    for (int i = 0; i < names.length; i++) {
      for (int j = 0; j < names[i].length(); j++) {
        if (names[i].charAt(j) == 'e') {
          eCount++;
        }
      }
    }
    int[] arr10 = new int[eCount];
    int idx = 0;
    for (int i = 0; i < names.length; i++) {
      for (int j = 0; j < names[i].length(); j++) {
        if (names[i].charAt(j) == 'e') {
          arr10[idx] = j;
          idx++;
        }
      }
    }
    // ! Print an Array -> Arrays.toString()
    System.out.println(Arrays.toString(arr10));// [1,5,2,4]

    // search + count
    String n1 = "Mandy";
    //count the number of 'd'
    int dCount = 0;
    for (int i = 0; i < n1.length(); i++){
      if (n1.charAt(i)=='d'){
        dCount++;
      }
    }
    System.out.println(dCount);//1

    //reference data type : OOP
    int[] test = {10,20,30,40};
    int[] test1 = test;
    System.out.println(Arrays.toString(test));
    test[1]=50;
    System.out.println(Arrays.toString(test1));
    System.out.println(Arrays.toString(test));
  }
}

