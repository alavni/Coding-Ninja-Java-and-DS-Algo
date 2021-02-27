import java.util.Scanner;


public class TriangleofNumbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    for (int i = 1; i <= n; i++) {
      //spaces loop
      for (int j = n-i; j >= 1; j--) {
        System.out.print(" ");
      }

      //simple loop for 1 23 345 4567
      int start_number_simple = i;
      for (int j = 1; j <= i; j++) {
        System.out.print(start_number_simple);
        start_number_simple++;
      }

      //reverse loop
      int start_number = 2*i-2;
      for (int j = 1; j <= i-1; j++) {
        System.out.print(start_number);
        start_number--;
      }

      System.out.println();
    }

  }
}
