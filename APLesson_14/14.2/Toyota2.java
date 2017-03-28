public class Toyota2 extends Car2
{
	private double[] location;
	
	public Toyota2()
	{
		location = new double[2];
	}
	
	public Toyota2(String L)
	{
		location = new double[2];
		String[] locations = L.split(", ");
		location[0] = Double.parseDouble(locations[0]);
		location[1] = Double.parseDouble(locations[1]);
	}
}