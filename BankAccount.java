public class BankAccount
{
    double balance;
    public BankAccount() 
    {
        balance = 100;
    }
    
    public BankAccount(double x) 
    {
        balance = x;
    }

    public void withdraw(double x)
    {
        balance = balance - x;
    }

    public void deposit(double x)
    {
        balance = balance + x;
    }

    public String toString()
    {
        return ("The balance is " + balance);
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double x)
    {
        balance = x;
    }
}