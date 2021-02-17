// Print the following pattern
// Pattern for N = 4
//    1
//   23
//  345
// 4567
// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
// 5
// Sample Output :
//    1
//   23
//  345
// 4567
//56789
import java.util.Scanner;

class Solution
{
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    
	    for(int i = 1;i<=n;i++){
	    int number = i;
	      for(int space = n-i; space>=1; space--){
	          System.out.print(" ");
	      }      
	        
	      for(int j=1;j<=i;j++){
	         System.out.print(number);
	         number++;
	      }
        	
	      System.out.println();
	    } 
	}
}