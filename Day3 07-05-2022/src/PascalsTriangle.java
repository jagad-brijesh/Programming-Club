import java.util.Scanner;

class PascalsTriangle {
   static int factorial(int n) {
      int f=1;
      while(n>1){
         f*=n;
         n--;
      }
      return f;
   }
   static int nCr(int n,int r) {
      return factorial(n)/(factorial(n-r)*factorial(r));
   }
   public static void main(String args[]){
      
      System.out.println("Enter N:");
      int n, i, j;
      n = new Scanner(System.in).nextInt();

      /* logic behind the pattern:
                    0C0
                 1C0   1C1
              2C0   2C1   2C2
           3C0   3C1   3C2   3C3
         4C0   4C1  4C2   4C3   4C4
                ...till N...
      */
      for(i = 0; i < n; i++) {
         for(j = 0; j < n-i; j++){
            System.out.print(" ");
         }
         for(j = 0; j <= i; j++){
            System.out.print(" "+nCr(i, j));
         }
         System.out.println();
      }
   }
}