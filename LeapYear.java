/* Write a program that asks the user to input a number that represents a year,
   then prints '{year} is a leap year!' or '{year} is NOT a leap year!' after
   checking if the year is leap or not.
   
   Remember that a year is leap if it is a multiple of 4 and not a multiple of
   100, or if it is a multiple of 400. */


import java.util.Scanner;

class LeapYear {

  public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
      System.out.println("Enter year!");
      
      int year = myScanner.nextInt();
      
      if (year%4==0 && year%100!=0 && year%400!=0) {
          System.out.println("Is leap");}
    
        else if (year%4==0 && year%100== 0 && year%400 !=0){
            System.out.println("No leap only century");}
        
        else if (year%4==0 && year%100==0 && year%400==0){
            System.out.println("Leap and century");}
            
        else {System.out.println("Not leap.");}
            
    }
  }
