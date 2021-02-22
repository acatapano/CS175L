import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your starting balance?");
		double startBal = in.nextDouble();
		
		BankAccount myBankAccount = new BankAccount(startBal);
		
		System.out.println("How much money would you like to withdraw?");
		double withDrawAmount = in.nextDouble();
		myBankAccount.withdraw(withDrawAmount);
		
		System.out.println("How much money would you like to deposit?");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		
		System.out.println("Current Ballance: $" + myBankAccount.getBalance());
		
	}

}
