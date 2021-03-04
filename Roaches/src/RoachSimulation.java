import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RoachSimulation {

	public static void main(String[] args) 
	{
		
		DecimalFormat decFormat = new DecimalFormat("00");
		
		String input = JOptionPane.showInputDialog("Enter starting roach population:");
		double startingPopulation = Double.parseDouble(input);
		
		RoachPopulation Roaches = new RoachPopulation(startingPopulation);
		
		JOptionPane.showMessageDialog(null, "The initial roach population is " + decFormat.format(startingPopulation));
		
		//Cycle 1
		Roaches.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1 breeding is " + decFormat.format(Math.round(Roaches.getRoaches())));
		
		input = JOptionPane.showInputDialog("Enter spray percentage for cycle 1:");
		double sprayPercentage = Double.parseDouble(input);
		Roaches.spray(sprayPercentage);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1 " + decFormat.format(sprayPercentage* 100) + "% spraying is " + Math.round(Roaches.getRoaches()));
		
		//Cycle 2
		Roaches.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2 breeding is " + decFormat.format(Math.round(Roaches.getRoaches())));
		
		input = JOptionPane.showInputDialog("Enter spray percentage for cycle 2:");
		sprayPercentage = Double.parseDouble(input);
		Roaches.spray(sprayPercentage);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2 " + decFormat.format(sprayPercentage* 100) + "% spraying is " + Math.round(Roaches.getRoaches()));
		
		//Cycle 3
		Roaches.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3 breeding is " + decFormat.format(Math.round(Roaches.getRoaches())));
		
		input = JOptionPane.showInputDialog("Enter spray percentage for cycle 3:");
		sprayPercentage = Double.parseDouble(input);
		Roaches.spray(sprayPercentage);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3 " + decFormat.format(sprayPercentage* 100) + "% spraying is " + Math.round(Roaches.getRoaches()));
		
		//Cycle 4
		Roaches.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4 breeding is " + decFormat.format(Math.round(Roaches.getRoaches())));
		
		input = JOptionPane.showInputDialog("Enter spray percentage for cycle 4:");
		sprayPercentage = Double.parseDouble(input);
		Roaches.spray(sprayPercentage);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4 " + decFormat.format(sprayPercentage* 100) + "% spraying is " + Math.round(Roaches.getRoaches()));
		
	}

}
