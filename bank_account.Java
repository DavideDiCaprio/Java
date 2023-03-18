import java.util.Scanner;

public class BankAccount {
    
    Scanner myScanner = new Scanner(System.in);
        
    String owner_name;
    String owner_surname;
    String owner_id;
    int balance;
    
    System.out.println("Classe creation test.");
    
    public void print_balance(){
        System.out.println("Current balance is: " + this.balance);}
        
    public void withdraw(){
        System.out.println("Enter amount of operation: "); 
        float amount = myScanner.nextFloat();
        if (amount > this.balance){
            System.out.println("Not enougth money for this operation!");}
            else {
                    this.balance -= amount;
                }
            }
            
    public void deposit(){
        System.out.println("Enter amount of operation: "); 
        float amount = myScanner.nextFloat();
        this.balance += amount;}
        
    public static void main(String[] args) {
        BankAccount();}
    }
    
   
   

