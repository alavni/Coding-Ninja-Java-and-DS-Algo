import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int digit;
    int even_sum = 0;
    int odd_sum = 0;

    while (n > 0) {
      digit = n%10;
      n = n/10;
      if (digit%2==0) {
        even_sum += digit;
      } else {
        odd_sum += digit;
      }
    }
    System.out.println(even_sum + " " + odd_sum);

  }
}
