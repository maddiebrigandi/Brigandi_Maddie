public abstract class Car2 implements Location
{
	int ID;
	double x, y;
	double[]location;
	public Car2()
	{
		ID = 1 + (int)(Math.random()*999999);
	}
	
	public void move(double r, double t)
	{
		x += r;
		y += t;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
}