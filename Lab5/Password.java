import java.util.Scanner;
public class Password
{
	static Scanner kb;
	public static void main(String[]args)
	{
		String password = "volleyball";
		String username = "madbrig12";
		passCheck();
	}
	
	public static void passCheck()
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter your username:");
		String name = kb.next();
		System.out.println("Please enter your password:");
		String pass = kb.next();
		if (name.equals("madbrig12")&&pass.equals("volleyball"))
		{
			System.out.println("You are granted access!");
		}
		if (!(name.equals("madbrig12"))&&pass.equals("volleyball"))
		{
			System.out.println("Username is incorrect.");
			passCheck();
		}
		else if (name.equals("madbrig12")&&!pass.equals("volleyball"))
		{
			System.out.println("Password is incorrect.");
			passCheck();
		}
		else if (!(name.equals("madbrig12"))&&!pass.equals("volleyball"))
		{
			System.out.println("Both are incorrect.");
			passCheck();
		}
	}
}