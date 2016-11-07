import java.util.Scanner;
public class graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		double num = kb.nextDouble();
		System.out.println("Please enter the size of the table: ");
		double size = kb.nextDouble();
		for(int i=1; i <= size; i++)
		{
			double output = i*num;
			System.out.printf("%10d | %10.3f\n", i,output);
		}
	}
}