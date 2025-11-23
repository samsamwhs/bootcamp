import java.util.Arrays;

public class DemoArraySwap {
  public static void main(String[] args) {
    int x = 10;
    int y = 7;

    // Swap the values between x and y
    int temp = x;// backup x
    x = y; // backup y
    y = temp;
    System.out.println("x=" + x + ", y=" + y);// x=7, y=10

    // given int[]
    int[] arr1 = new int[5];
    arr1[0] = 17;
    arr1[1] = 5;
    arr1[2] = -8;
    arr1[3] = 20;
    arr1[4] = 2;

    // Sorting in ascending order
    // find the max value, put it at the tail of the array

    for (int i = 0; i < arr1.length - 1; i++) { // -1: only need to loop 4 times not 5 times
      for (int j = 0; j < arr1.length - i - 1; j++) {
        // ! - i - 1: don't let 17 to replace 20: refer to Bubble sort in notes
        if (arr1[j] > arr1[j + 1]) {
          temp = arr1[j];
          arr1[j] = arr1[j + 1];
          arr1[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr1));// [-8, 2, 5, 17, 20]
    // 1st loop: inner for-loop [5, -8, 17, 2, 20] outer for-loop [-8, 2, 5, 17, 20]


    // inner loop in the 1st outer loop
    // 17,5,-8,20,2
    // 5,17,-8,20,2 (loop1)
    // 5,-8,17,20,2 (loop2)
    // 5,-8,17,20,2 (loop3)
    // 5,-8,17,2,20 (loop4)

    // Swap
    String name = "Steven";
    char[] name2 = name.toCharArray();// ['S','t','e','v','e','n'] String to char[] (char array)
    // to get "nevetS"

    // Round 1: swap S and n
    // Round 2: swap t and e
    // Round 3: swap e and v

    char backup;
    for (int i = 0; i < name2.length / 2; i++) { // 5/2 -> 3, so only 3 loops
      backup = name2[i];
      name2[i] = name2[name2.length - 1 - i];
      name2[name2.length - 1 - i] = backup;
    }
    System.out.println(Arrays.toString(name2));// [n, e, v, e, t, S]
    System.out.println(String.valueOf(name2));// nevetS
  }
}


