import java.util.Scanner;

public class BankThreshhold {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter amount to start the account: ");
		double startBal = in.nextDouble();
		System.out.println("Enter the interest rate for this account: ");
		double interestPct = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal, interestPct);
		
		System.out.println("Enter a threshold or 'End': ");
		
		while (in.hasNextDouble())
		{
			
			double threshold = in.nextDouble();
			int months = 0;
			
			System.out.println("You entered " + threshold);
			
			while (myBankAccount.getBalance() < threshold)
			{
				
				myBankAccount.calcInterest();
				months++;
				
			}
			
			System.out.println("It will take " + months + " months to reach $" + threshold + ".");
			
			myBankAccount.resetBal(startBal, interestPct);
			
			System.out.println("Enter a threshhold or 'End': ");
		}
		
		System.out.println("No threshold entered. Goodbye.");

	}

}
