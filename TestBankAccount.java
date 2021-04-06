public class TestBankAccount
{
   public static void main(String [] args)
   {
      BankAccount account = new BankAccount(); // This uses the default constructor.

      account.setBalance(650.00);
      System.out.println(account.getBalance());
      account.withdraw(25);

      System.out.println(account.getBalance());
   }
}
