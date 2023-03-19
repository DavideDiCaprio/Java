public class BankAccount {

  double balance;

  BankAccount(double balance){
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




// add class Main// 

class Main {  
  public static void main(String args[]) { 

    BankAccount bank_account = new BankAccount(1000);
    
    bank_account.withdraw(500);
    bank_account.show_balance();
    bank_account.deposit(250);
    bank_account.show_balance();
      } 
}
