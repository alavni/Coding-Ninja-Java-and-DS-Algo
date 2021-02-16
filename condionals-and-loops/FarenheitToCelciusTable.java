import java.util.Scanner;
class Solution { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int start = s.nextInt();
    int end = s.nextInt();
    int step = s.nextInt();
    
    for(int i = start; i<=end; i = i+step){
    	int celsius = ((i-32)*5)/9;
      	System.out.println(i + " " + celsius);
    }
    
  }
}