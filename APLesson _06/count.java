import java.util.Scanner;
public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num1 = kb.nextInt();
		System.out.println("Please enter the interval number: ");
		int num2 = kb.nextInt();
		for(int i=num2; i <= num1; i+= num2)
		{
			System.out.printf(i + "\t");
		}
	}
}