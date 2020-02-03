public class BankAccountClient{
    public static void main(String[] args){
    BankAccount account= new BankAccount();
    account.deposit(100);
    account.withdraw(25);
    account.displayBalance();
    }
}