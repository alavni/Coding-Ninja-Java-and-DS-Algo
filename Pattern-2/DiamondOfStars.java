import java.util.Scanner;

public class DiamondOfStars {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int mid_line = (n+1)/2;
    int reverse = mid_line - 1;

    //first for loop for simple triangle
    for (int i = 1; i <= mid_line; i++) {

      for (int j = (mid_line-i); j >= 1; j--) {
        System.out.print(" ");
      }

      for (int k = 1; k <= 2*i-1; k++) {
        System.out.print("*");
      }

      System.out.println();
    }

    //reverse star loop
    for (int i = reverse; i >= 1; i--) {
      
      //spaces loop
      for (int j = 0; j <= reverse-i; j++) {
        System.out.print(" ");
      }

      //star loop
      int star = 2*i-1;
      for (int k = 1; k <= star; k++) {
        System.out.print("*");
      }
      System.out.println();

    }

  }
}
