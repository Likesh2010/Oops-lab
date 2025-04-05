class BankAccount{
  private double balance;
  public void deposit(double amount){
    if (amount > 0)
      balance += amount;
    else
      System.out.println("Deposit amount must be positive.");
  }
  public void withdraw(double amount){
    if (amount > 0 && amount <= balance){
      balance -= amount;
      if (balance < 1000){
        System.out.println("Warning: Low balance.");
      }
    }
	else{
      System.out.println("Insufficient balance or invalid amount.");
    }
  }
  public double getBalance(){
    return balance;
  }
}
public class Encapsulation4{
  public static void main(String[] args){
    BankAccount acco = new BankAccount();
    acco.deposit(10000);
    acco.withdraw(4500);
    System.out.printf("Current Balance: Rs %.2f\n", acco.getBalance());
  }
}
