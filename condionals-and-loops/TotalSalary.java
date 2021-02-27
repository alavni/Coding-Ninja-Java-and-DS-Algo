import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int basic_salary = s.nextInt();
    String str = s.next();
    char grade = str.charAt(0);
    int allow;

    if (grade == 'A') {
      allow = 1700;
    } else if (grade == 'B') {
      allow = 1500;
    } else {
      allow = 1300;
    }

    double ts=((basic_salary+(0.20*basic_salary)+(0.50*basic_salary)+allow)-(0.11*basic_salary));
		double p=Math.round(ts);
		int h=(int)(p);
		System.out.println(h);

  }
}
