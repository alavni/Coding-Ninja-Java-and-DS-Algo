import java.util.Scanner;

public class InvertedNumberPattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    for (int i = n; i >= 1; i--) {

      for (int j = i; j >= 1; j--) {
        System.out.print(i);
      }

      System.out.println();
    }
  }
}
