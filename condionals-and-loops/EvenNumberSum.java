// Sum of Even Numbers till N
// Given a number N, print sum of all even numbers from 1 to N.
// Input Format :
// Integer N
// Output Format :
// Required Sum 
// Sample Input 1 :
//  6
// Sample Output 1 :
// 12

import java.util.Scanner;
class Solution {
  
  public static int sumEvenNumbers(int n){
    int sum = 0;
    
    for(int i = 0; i<=n; i = i+2){
      sum = sum + i;
    }
    
    return sum;
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum = sumEvenNumbers(n);
    System.out.println(sum);
  }
}
