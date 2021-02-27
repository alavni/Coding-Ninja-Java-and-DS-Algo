import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int p = s.nextInt();
    int power = 1;

    while(p>0){
      power = power*n;
      p--;
    }

    System.out.println(power);

  }
}
