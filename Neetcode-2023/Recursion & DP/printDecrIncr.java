package Neetcode-2023.Recursion;

public class printDecrIncr {
    
// // exp - 4 3 2 1 1 2 3 4

// f -  4 
//      f(3)
//      4

// n
// f(n-1)
// n

  public static void pdi(int n) {
      
    if(n == 0)return;
    System.out.println(n);
    pdi(n-1);
    System.out.println(n);
}
}
