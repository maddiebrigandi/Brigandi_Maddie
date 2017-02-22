public class GameSystem
{
	String platform;
	int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = 1 + (int)(Math.random()*9999999);
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = 1 + (int)(Math.random()*9999999);
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNumber()
	{
		return serialNo;
	}
}