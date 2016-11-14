import java.util.Scanner;
public class AverageDigits
{
	
	static int average = 0;
	static int digits = 0;
	static int sum = 0;
	static int number;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		aveDigits();
		System.out.println("The average of the digits in " + number + " is " + average + ".");
	}
	
	public static void aveDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			sum += num %10;
			num /= 10;
			average = sum/digits;
		}
	}
}