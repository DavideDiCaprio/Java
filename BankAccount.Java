public class BankAccount {

  double balance;

  BankAccount(double balance){
    this.balance = balance;  
  }

  void show_balance(){
    System.out.println(this.balance);
  }
  
}




// add class Main// 

class Main {  
  public static void main(String args[]) { 

    BankAccount bank_account = new BankAccount(1000);
    
    bank_account.show_balance();
  } 
}
