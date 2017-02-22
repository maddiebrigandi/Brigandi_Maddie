public abstract class Ticket 
{
	int serialNo;
	
	public Ticket()
	{
		serialNo = 1 + (int)(Math.random()*9999999);
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: $" + getPrice();
	}
}
