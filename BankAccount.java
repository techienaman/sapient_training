public class BankAccount{
    static int accountBalance=0;
    public void displayBalance(){
        System.out.println("Available balance in your account is=:"+accountBalance);

    }


    public int deposit(int value ){
        accountBalance=accountBalance+value;
        return accountBalance;
    }


    public void withdraw(int value){
        if(accountBalance < value){
            System.out.println("insufficient Balance in your account");
        } else{
          accountBalance=accountBalance-value;
        }
    }

}