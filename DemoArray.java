public class DemoArray {
  public static void main(String[] args) {
    // The way to store value: 8 primitives, 8 wrapper class, 1 String (17 types)
    // New way to store a set of same type of values
    // new int[4] -> array object
    int[] arr = new int[4];
    // assign values into an array
    arr[0] = 100;
    arr[1] = 70;
    arr[2] = 2_100_000_000;
    arr[3] = -200;

    // ! ArrayIndexOutOfBound (error: not inside our array object)
    // arr[-1] = -200;
    // arr[4] = -200;

    // for loop to read array
    for (int i = 0; i < 4; i++) { // 0,1,2,3
      System.out.println(arr[i]);
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

    int a = 0;
    for (int i = 0; i < 5; i++) {
      a = Math.max(a, arr4[i]);
    }
    System.out.println(a);// 100

    int max = arr4[0];
    int min = arr4[0];
    int idxMaxValue = 0;
    for (int i = 0; i < arr4.length; i++){
      if (arr4[i] > max) {
        max = arr4[i];
        idxMaxValue = i;
      }else{
        if (arr4[i] < min){
          min = arr4[i];
        }
      }
    }
    System.out.println(max);//100
    
    //find the min value in arr4
    System.out.println(min);//-20
    
    //find the index of the max
    System.out.println(idxMaxValue);//3
    

  }
}
