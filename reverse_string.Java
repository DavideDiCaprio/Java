import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter text:");
        String input_string = myScanner.nextLine();
        
        int len_string = input_string.length();
        
        for(int i=(len_string-1);i>=0;i--){
            System.out.print(input_string.charAt(i));
        }
    }
}
