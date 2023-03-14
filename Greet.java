/* Write a Java program that asks the user for their name and surname, then greets
   them with a string like 'Hi name surname, it is a pleasure to meet you!'.*/

import java.util.Scanner;

class Greet {
    
  public static void main(String[] args) {
      
      Scanner myScanner = new Scanner(System.in);
      
      System.out.println("Enter name!");
      String userName = myScanner.nextLine();
      System.out.println("Enter surname!");
      String userSurname = myScanner.nextLine();

      System.out.println("Hi " + userName + " " + userSurname + ", it is a pleasure to meet you!");  
  }

}
