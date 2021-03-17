import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AgeCalculation {

	public static void main(String[] args) 
	{
		String again = "y";
		
		while (again == "y")
		{
			
			String bDate = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");
			String birthDate = bDate;
		
			String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
			JOptionPane.showMessageDialog(null, "Today's date is " + currentDate + ".");
			
			String [] split1 = birthDate.split("/");
			String bYear = split1[2];
			String bMonth = split1[0];
			String bDay = split1[1];
		
			String [] split2 = currentDate.split("/");
			String cYear = split2[2];
			String cMonth = split2[0];
			String cDay = split2[1];
		
			int birthYear = Integer.parseInt(bYear);
			int currentYear = Integer.parseInt(cYear);
			int birthMonth = Integer.parseInt(bMonth);
			int currentMonth = Integer.parseInt(cMonth);
			int birthDay = Integer.parseInt(bDay);
			int currentDay = Integer.parseInt(cDay);
			int yearsOld;
			int monthsOld;
			int daysOld;
		
			if (birthMonth == 2 || currentMonth == 2)
			{
				
				if (birthMonth == 2)
				{
				
					if (birthDay == 29)
					{
					
						birthMonth = 3;
						birthDay = 1;
					
					}
			
				}
				
				if (currentMonth == 2)
				{
				
					if (currentDay == 29)
					{
					
						currentMonth = 3;
						currentDay = 1;
					
					}
					
				}
			} 
			
			if (birthYear == currentYear)
			{
			
				if (birthMonth == currentMonth) 
				{
				
					if (birthDay == currentDay)
					{
					
						JOptionPane.showMessageDialog(null, "You are 1 day old.");
						again = "n";
				
					}
				
					else if (birthDay < currentDay)
					{
							
						daysOld = currentDay - birthDay;
						JOptionPane.showMessageDialog(null, "You are " + daysOld + " days old.");
						again = "n";
					
					}
				
					else if (birthDay > currentDay)
					{
					
						JOptionPane.showMessageDialog(null, "Invalid date(s). Please try again.");
					
					}
				
				}
			
				else if (birthMonth < currentMonth)
				{
				
					if (currentDay >= birthDay)
					{
				
						monthsOld = currentMonth - birthMonth;							
						JOptionPane.showMessageDialog(null, "You are " + monthsOld + " month(s) old.");
						again = "n";
					
					}
						
					if (currentDay < birthDay)
					{
					
						monthsOld = (currentMonth - birthMonth) - 1;
						JOptionPane.showMessageDialog(null, "You are " + monthsOld + " month(s) old.");
						again = "n";
					
					}
				
				}
			
				else if (birthMonth > currentMonth)
				{
				
					JOptionPane.showMessageDialog(null, "Invalid date(s). Please try again.");
				
				}
			
			}
		
			else if (birthYear < currentYear)
			{
			
				if (birthMonth == currentMonth) 
				{
				
					if (birthDay <= currentDay)
					{
					
						yearsOld = currentYear - birthYear;
						JOptionPane.showMessageDialog(null, "You are " + yearsOld + " year(s) old.");
						again = "n";
					
					}
				
					else if (birthDay > currentDay)
					{
					
						yearsOld = (currentYear - birthYear) - 1;
						monthsOld = 11;
						JOptionPane.showMessageDialog(null, "You are " + yearsOld + " year(s) and " + monthsOld + " month(s) old.");
						again = "n";
					
					}
				
				}
			
				else if (birthMonth > currentMonth)
				{
			
					if (birthDay <= currentDay)
					{
					
						yearsOld = (currentYear - birthYear) - 1;
						monthsOld = (12 - birthMonth) + currentMonth;
						JOptionPane.showMessageDialog(null, "You are " + yearsOld + " year(s) and " + monthsOld + " month(s) old.");
						again = "n";
					
					}
				
					else if (birthDay > currentDay)
					{
							
						yearsOld = (currentYear - birthYear) - 1;
						monthsOld = (12 - birthMonth) + currentMonth;
						JOptionPane.showMessageDialog(null, "You are " + yearsOld + " year(s) and " + monthsOld + " month(s) old.");
						again = "n";
					
					}
			
				}
					
				else if (birthMonth < currentMonth)
				{
					if (birthDay <= currentDay)
					{
					
						yearsOld = currentYear - birthYear;
						monthsOld = currentMonth - birthMonth;
						JOptionPane.showMessageDialog(null, "You are " + yearsOld + " year(s) and " + monthsOld + " month(s) old.");
						again = "n";
							
					}
				
					else if (birthDay > currentDay)
					{
					
						yearsOld = currentYear - birthYear;
						monthsOld = (currentMonth - birthMonth) - 1;
						JOptionPane.showMessageDialog(null, "You are " + yearsOld + " year(s) and " + monthsOld + " month(s) old.");
						again = "n";
					
					}
				
				}
	
			}
		
			else
			{
			
				JOptionPane.showMessageDialog(null, "Invalid date(s). Please try again.");
			
			}
		
		}
		
	}

}
