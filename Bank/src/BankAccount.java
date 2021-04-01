/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double interestRate;
   private double deposit;
   private double withdraw;
   private double interest;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double startBal, double interestPct)
   {
	  
      balance = startBal;
      interestRate = interestPct;
       
      System.out.println("Created new account with $" + balance + " balance and interest rate " + interestRate + ".");
      
   }
   
   public void resetBal(double startBal, double interestPct)
   {
	   
	   balance = startBal;
	   interestRate = interestPct;
	   
   }
   
   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
	   
      balance = balance + amount;
      deposit = amount;
      
      System.out.println("Deposited: $" + deposit);
      System.out.println("Current Balance: $" + balance);
      
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
	   
      withdraw = amount;
      
      if(withdraw > balance) 
      {
    	  
    	  System.out.println("Insufficient Funds to support withdrawal. Please try again.");
    	  
      }
      
      else 
      {
    	  
    	  balance = balance - amount;
    	  System.out.println("Withdrew: $" + withdraw);
    	  System.out.println("Current Balance: $" + balance);
    	  
      }
      
   }
   
   public void calcInterest() 
   {
	   
	   interest = balance * interestRate;
	   balance = interest + balance;
	   
   }
   
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */

   public double getBalance()
   {
      return balance;
   }

}
