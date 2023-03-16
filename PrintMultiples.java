/* Write a java program that asks two numbers to the user, one will be the range limit and
   another will be the divisor. Print all the numbers in the range ]divisor, limit] which
   are integer multiples of divisor.
   
   Here is an example:
   
   limit = 20, divisor = 5.
   output: 10, 15, 20
   
   limit = 30, divisor = 7.
   output: 14, 21, 28
 */

import java.util.Scanner;

class PrintMultiples {
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter limit:");
    int limit = myScanner.nextInt();
    
    System.out.println("Enter divisor:");
    int divisor = myScanner.nextInt();
    
    for(int i=divisor; i<=limit; i = i+divisor) {
        
        if (i%divisor == 0)
        System.out.println(i);
        }
    }
    
}
