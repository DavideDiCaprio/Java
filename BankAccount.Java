public class BankAccount {
  
  public BankAccount(double balance){
    double balance;
    this.balance = balance;  
  }

  void show_balance(){
    System.out.println(this.balance);
  }

  void withdraw(float amount){
      
    if (amount > this.balance){
      System.out.println("Not enougth money for this operation!");
    }
    else {
      this.balance -= amount;
    }
  }
  
  void deposit(float amount){
        this.balance += amount;
  }
}

class Main {  
  public static void main(String args[]) { 

    BankAccount my_bank_account = new BankAccount(1000);
    
    my_bank_account.withdraw(500);
    my_bank_account.show_balance();
    my_bank_account.deposit(250);
    my_bank_account.show_balance();
  } 
}
