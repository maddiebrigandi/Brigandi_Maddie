public abstract class Console extends GameSystem
{
	String Controller;
	public Console()
	{
		super();
	}
	
	public Console(String system)
	{
		super(system);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNumber() + "\nController: " + getController();
	}
	
}