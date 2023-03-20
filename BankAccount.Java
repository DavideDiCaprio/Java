public class BankAccount {
  
  private double balance;

  public BankAccount(double balance){
    this.balance = balance;  
  }

  public void show_balance(){
    System.out.println(this.balance);
  }

  public void withdraw(float amount){
    
    if (amount > this.balance){
      System.out.println("Not enougth money for this operation!");
    }
    else {
      this.balance -= amount;
    }
  }
  
  public void deposit(float amount){
        this.balance += amount;
  }
}

class Main {  
  public static void main(String args[]) { 

    BankAccount my_bank_account = new BankAccount(1000);
    
    myBankAccount.withdraw(500);
    myBankAccount.show_balance();
    myBankAccount.deposit(250);
    myBankAccount.show_balance();
  } 
}
