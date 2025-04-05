class BankAccount{
  private double balance;
  public void deposit(double amount){
    if (amount > 0)
      balance += amount;
  }
  public void withdraw(double amount){
    if (amount > 0 && amount <= balance)
      balance -= amount;
    else
      System.out.println("Insufficient balance or invalid amount.");
  }
  public double getBalance(){
    return balance;
  }
}
class Abstract3{
  public static void main(String[] args){
    BankAccount Acc = new BankAccount();
    Acc.deposit(1000);
    Acc.withdraw(300);
    Acc.withdraw(800); 
    System.out.println("Final Balance: Rs." + Acc.getBalance());
  }
}
