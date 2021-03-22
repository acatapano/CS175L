import java.util.Scanner;

public class romanNumeral {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a year: ");
		int year = in.nextInt();
		
		int millenia = year/1000 % 10;
		int centuries = year/100 % 10;
		int decades = year/10 % 10;
		int years = year % 10;

		String romanNumeral = "";
		String again = "y";
		
		while (again == "y")
		{
			
			if (year > 3999 || year < 1)
			{
			
				System.out.println("Invalid year. Please try again.");
			
			}
		
			else
			{
			
				while (millenia >= 1)
				{
					
					millenia--;
					romanNumeral = romanNumeral + "M";
					
				}
				
				while (centuries >= 1)
				{
					
					if (centuries == 9)
					{
						
						centuries = centuries - 9;
						romanNumeral = romanNumeral + "CM";
						
					}
					
					else if (centuries >= 5)
					{
						
						centuries = centuries - 5;
						romanNumeral = romanNumeral + "D";
						
					}
					
					else if (centuries >= 5)
					{
						
						centuries = centuries - 4;
						romanNumeral = romanNumeral + "CD";
						
					}
					
					else
					{
						
						centuries--;
						romanNumeral = romanNumeral + "C";
						
					}
				}
				
				while (decades >= 1)
				{
					
					if (decades == 9)
					{
						
						decades = decades - 9;
						romanNumeral = romanNumeral + "XC";
						
					}
					
					else if (decades >= 5)
					{
						
						decades = decades - 5;
						romanNumeral = romanNumeral + "L";
						
					}
					
					else if (centuries >= 5)
					{
						
						decades = decades - 4;
						romanNumeral = romanNumeral + "XL";
						
					}
					
					else
					{
						
						decades--;
						romanNumeral = romanNumeral + "X";
						
					}
					
				}
				
				while (years >= 1)
				{
					
					if (years == 9)
					{
						
						years = years - 9;
						romanNumeral = romanNumeral + "IX";
						
					}
					
					else if (years >= 5)
					{
						
						years = years - 5;
						romanNumeral = romanNumeral + "V";
						
					}
					
					else if (years >= 5)
					{
						
						years = years - 4;
						romanNumeral = romanNumeral + "IV";
						
					}
					
					else
					{
						
						years--;
						romanNumeral = romanNumeral + "I";
						
					}
					
				}
				
				again = "n";
			
			}
		
		}
		
		System.out.println("The year " + year + " in roman numerals is " + romanNumeral + ".");
	}

}
