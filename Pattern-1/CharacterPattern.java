import java.util.Scanner;

public class CharacterPattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for (int i = 1; i <= n ; i++) {
      char ch = (char)('A'+i-1);
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}
