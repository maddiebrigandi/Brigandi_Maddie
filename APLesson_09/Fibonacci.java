import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int numb = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int size = kb.nextInt();
		int[] seq = new int[size];
		for(int i= 0;i < size; i++)
		{
			if (i == 1 || i == 0)
			{
				seq[i] = numb;
			}
			
			else
			{
			seq[i] = (seq[i-1] + seq[i-2] );
			}
			
			System.out.println(seq[i]);
		}
	}
}