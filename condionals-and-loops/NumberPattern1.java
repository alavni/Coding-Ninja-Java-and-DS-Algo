// Print the following pattern
// Pattern for N = 4
// 1
// 23
// 345
// 4567
// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines
// Sample Input 1 :
// 3
// Sample Output 1 :
// 1
// 23
// 345
import java.util.Scanner;
class Solution { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int number = 1;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
          System.out.print(number);
          number++;
        }      
		System.out.println();
    }
  }
}