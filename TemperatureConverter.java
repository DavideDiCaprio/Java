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
    System.out.println("Enter F/C. (Enter F is for Fahreneit, C is for Celsius.) ");
    String startingTemperature = myScanner.nextLine();
    
    if (startingTemperature.equals("F")){
        System.out.println("Enter Fahreneit temperature...");
        float Fahreneith_value = myScanner.nextFloat();

        float Celsius_value = ((Fahreneith_value-32)*5)/9;
        System.out.println("Your temperature is " + Celsius_value +  " celsius."); 
    }
    
    else if (startingTemperature.equals("C")){
        System.out.println("Enter Celsius temperature...");
        float Celsius_value = myScanner.nextFloat();
        float Fahreneit_value = ((Celsius_value*9)/5)+32;
        System.out.println("Your temperature is " + Fahreneit_value +  " fahreneit.");
    }
    
    else {System.out.println("Uncorrect input.");}
    
    }
}
