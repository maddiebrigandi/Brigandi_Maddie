import java.util.Scanner;
public class DigitAdder
{
	static int sum = 0;
	static int num = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num = kb.nextInt();
		sumDigits();
		System.out.println("The sum of the digits in " + num + " is " + sum + ".");
	}
	
	public static void sumDigits()
	{
		int number = num;
		while(number > 0)
		{
			sum = sum + (num % 10);
			number = number / 10;
		}
	}
}