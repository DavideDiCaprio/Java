/* Ask the user to input the current temperature, then ask the user to input 'F'
   if it is measured in Fahreneit, 'C' if it is measured in Celsius.

   1. Print a nicely formatted string 'Your temperature is (T) (U).' replacing
      (T) with the temperature and (U) with the unit.

   2. Convert the temperature to the other unit, then print the same message but
      with the converted temperature and the appropriate unit.

   *Note*: you can find online formulas to perform the conversions C <-> F. */


import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter F/C. (F is for Fahreneit, C is for Celsius.) ");
    String userTemperature = myScanner.nextLine();
    
    if (userTemperature=="F"){
        System.out.println("Enter Fahreneit temperature...");
        float Fahreneith_temperature = myScanner.nextFloat();

        float Celsius = ((Fahreneith_temperature-32)*5)/9;
        System.out.println("Your temperature is" + Celsius +  "celsius."); 
    }
    
    else if (userTemperature=="C"){
        System.out.println("Enter Celsius temperature...");
        float Celsius_temperature = myScanner.nextFloat();
        float Fahreneit = ;
        System.out.println("Your temperature is" + Fahreneit +  "fahreneit.");
    }
    
    else {System.out.println("Uncorrect input.");}
    
    }
}
