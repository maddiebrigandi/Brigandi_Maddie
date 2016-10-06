import java.util.Scanner;
public class Average2
{
	static double n1,n2,n3;
	static double average;
	
	public static void main(String[]Args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter number 1:");
		n1 = kb.nextDouble();
		System.out.println("Please enter number 2:");
		n2 = kb.nextDouble();
		System.out.println("Please enter number 3:");
		n3 = kb.nextDouble();
		
		calcAvg();
		print();
	}
	public static void calcAvg()
	{
		average = (n1 + n2 + n3)/3.0;
	}
	public static void print()
	{
		System.out.println("The average of the numbers is " + average);
	}
}