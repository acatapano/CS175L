
public class RoachPopulation 
{
	
	private double population;
	
	public RoachPopulation(double startingPopulation)
	{
		
		population = startingPopulation;
		
	}
	
	public void breed()
	{
		
		population = population * 2;
		
	}
	
	public void spray(double sprayPercentage)
	{
		
		population = population - (population * sprayPercentage);
		
	}
	
	public double getRoaches()
	{
		
		return population;
		
	}

}
