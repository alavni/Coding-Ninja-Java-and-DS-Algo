import java.util.Scanner;

public class InterestingAlphabets {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    for (int i = 1; i <= n; i++) {
      char starting_char = (char)('A'+(n-i));
      for (int j = 1; j <= i; j++) {
        System.out.print(starting_char);
        starting_char++;
      }
      System.out.println();
    }
    

  }
}
