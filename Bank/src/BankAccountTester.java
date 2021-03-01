import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Bank Account Set Up:
		System.out.println("Enter amount to start the account: ");
		double startBal = in.nextDouble();
		System.out.println("Enter the interest rate for this account: ");
		double interestPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		//Deposit:
		System.out.println("Enter amount to deposit in the account: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		
		//Withdraw:
		double accountBal = myBankAccount.getBalance();
		
		System.out.println("Enter amount to withdraw from the account: ");
		double withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		
		double withdrawBalance = myBankAccount.getBalance();
		
		if(withdrawBalance == accountBal) 
		{
			
			System.out.println("Enter amount to withdraw from the account: ");
			withDrawAmount = in.nextDouble();
			myBankAccount.withdraw(withDrawAmount);
			
		}
		
		//Interest:
		System.out.println("If you want me to generate interest, enter 'Yes': ");
		String answer = in.next();
		
		if(answer.compareTo("Yes") == 0) 
		{
			
			myBankAccount.calcInterest();
			System.out.println("The account balance is: $" + myBankAccount.getBalance());
			
		}
		
		else 
		{
			
			System.out.println("The account balance is: $" + myBankAccount.getBalance());
			
		}
		
	}

}
