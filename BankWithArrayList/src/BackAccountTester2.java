import java.util.ArrayList;

public class BackAccountTester2 {

	public static void main(String[] args) 
	{
		
		BankAccount gil = new BankAccount("Gil", 500);
		BankAccount joe = new BankAccount("Joe", 1000);
		BankAccount fred = new BankAccount("Fred", 2000);
		BankAccount sally = new BankAccount("Sally", 2500);
		double largestB = 0;
		
		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		BankAccount largestA = accountList.get(0);
		
		for(BankAccount employee: accountList)
		{
			
			System.out.println(employee.getAccount());
			
		}
		
		accountList.add(sally);
		
		for (int i = 0; i < accountList.size(); i++)
		{
			
			if (accountList.get(i).getBalance() > largestB)
			{
				
				largestA = accountList.get(i);
				largestB = accountList.get(i).getBalance();
				
			}
			
		}
		
		System.out.println();
		System.out.println("Highest Balance: " + largestA.getAccount());
		
		largestA = accountList.get(0);
		largestB = 0;
		
		accountList.remove(sally);
		
		for (int i = 0; i < accountList.size(); i++)
		{
			
			if (accountList.get(i).getBalance() > largestB)
			{
				
				largestA = accountList.get(i);
				largestB = accountList.get(i).getBalance();
				
			}
			
		}
		
		System.out.println();
		System.out.println("Highest Balance: " + largestA.getAccount());
		
	}

}
