/* Ask the user to input a number n, then print a triangle made of the '*' character with
   n rows and n columns.

   Examples:

   n = 1
   output = *

   n = 2
   output = *
            **

   n = 4
   output = *
            **
            ***
            ****

*/
   
import java.util.Scanner;

class TriangularPattern {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.println("enter:");
    int n = myScanner.nextInt();
    
    for (int i = 0; i <= n; i++) {
      System.out.println("*");
    }  
  }
}
