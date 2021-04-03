import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		boolean done = false;
		
		while (!done)
		{
			
			System.out.println("Enter a Creditr Card number or -99 to end: ");
			String number = in.nextLine();
			
			if (number.compareTo("-99") == 0)
			{
			
				System.out.println("No number entered. Goodbye.");
				done = true;
				
			}
			
			else
			{
				
				String result = number.replace(" ", "");
				number = result.replace("-", "");
				System.out.println(number);
				
			}
		
			/* If I was to do it with characters:
			for (int i = 0; i <= number.length(); i++)
			{
			
				char num = number.charAt(i);
			
				if (num == '-' || num == ' ')
				{
				
					String before = number.substring(0, i);
					String after = number.substring(i + 1);
					number = before + after;
				
				}
			
			}
			*/
			
		}

	}
}