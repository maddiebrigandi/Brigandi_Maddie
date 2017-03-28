import java.util.Scanner;
public class Logical
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);	
		System.out.println("Pick a number between one and ten: ");
		int guess = kb.nextInt();
		if(guess >= 1)
		{
			if(guess <= 10)
			{
				System.out.println("The number is right!");
			}
		}
		else
		{
			System.out.println("Wrong!");
		}
	}
}