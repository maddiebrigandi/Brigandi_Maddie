public class Toyota1 extends Car
{
	private double[] location;
	
	public Toyota1()
	{
		location = new double[2];
	}
	
	public Toyota1(String L)
	{
		location = new double[2];
		String[] locations = L.split(", ");
		location[0] = Double.parseDouble(locations[0]);
		location[1] = Double.parseDouble(locations[1]);
	}
}