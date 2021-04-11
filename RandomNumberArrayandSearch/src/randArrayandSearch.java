import java.util.Arrays;
import java.util.Random;

public class randArrayandSearch 
{

	public static void main(String[] args) 
	{
		
		Random random = new Random();
		
		int [] numbers = new int[50];
		
		int currentCount = 1;
		int maxCount = 0;
		int frequentNumber = numbers[0];
		
		System.out.println("Array:");
		for (int i = 0; i < numbers.length; i++)
		{
			
			numbers[i] = random.nextInt(26) + 1;
			System.out.print(numbers[i] + " ");
			
		}
		
		System.out.println();
		System.out.println();
		
		Arrays.sort(numbers);
		
		System.out.println("Sorted Array:");
		for (int i = 0; i < numbers.length; i++)
		{
			
			System.out.print(numbers[i] + " ");
			
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Smallest Number in Array = " + numbers[0]);
		System.out.println("Greatest Number in Array = " + numbers[49]);
		System.out.println("Product of Greatest and Smallest Number = " + numbers[0]*numbers[49]);
		
		System.out.println();
		
		for (int i = 1; i < numbers.length; i++)
		{
			if (numbers[i] == numbers[i - 1])
			{
				
				currentCount++;
				
			}
			
			else
			{
				
				if (currentCount > maxCount)
				{
				
					maxCount = currentCount;
					frequentNumber = numbers[i-1];
				
				}
				
				currentCount = 1;
				
			}

		}
		
		System.out.println("The most frequent number that appears is " + frequentNumber + ". It appears " + maxCount + " times.");
		
	}

}
