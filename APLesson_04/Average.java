//import scanner
import java.util.Scanner;
public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Please enter number 1: ");
		n1 = kb.nextInt();
		System.out.println("Please enter number 2: ");
		n2 = kb.nextInt();
		System.out.println("Please enter number 3: ");
		n3 = kb.nextInt();
		
		double avg = calcAvg(n1, n2, n3);
		System.out.printf("The average of your numbers is %10.5f\n", avg);
	}
	
	//returns average of the numbers
	public static double calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3.0;
	}
}
