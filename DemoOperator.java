public class DemoOperator {
  public static void main(String[] args) {
    //++, -- 
    int x = 3;
    x++; // x+1
    System.out.println(x);//4
    x += 1;//x + 1
    System.out.println(x);//5
    x = x + 1; 
    System.out.println(x);//6

    x--;
    System.out.println(x);//5
    
    // ++, -- (pre, post)
    int k = 6;
    int a1 = ++k + 3; // k +1 -> + 3 -> assign
    System.out.println(a1);//10
    System.out.println(k);//7

    //int a1 = k + 1;
    //int b1 = a1 + 3;
    //System.out.println(b1);//10

    int j = 6;
    int a2 = j++ +3; // j + 3 -> assign -> + 1
    System.out.println(a2);//9
    System.out.println(j);//7

    //int a2 = j + 3;
    //System.out.println(a2);
    //j++;
    

    //+=, -=, *=, /=
    int y = 8;
    y += 2; // y + 2
    System.out.println(y); //10
    y = y + 2;
    System.out.println(y);//12

    y -= 2; // y - 2 
    System.out.println(y);//10

    y *= 2; // y * 2
    System.out.println(y);//20

    y /= 2; // y / 2
    System.out.println(y);//10

    //remainder %
    int r = 10 %3;
    System.out.println(r);//1 (10-(3*3) =1)


  }
  
}
