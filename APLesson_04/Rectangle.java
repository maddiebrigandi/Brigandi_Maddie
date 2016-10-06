//import scanner
import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length: ");
		int l = kb.nextInt();
		System.out.println("Please enter the width: ");
		int w = kb.nextInt();
		calcPerim(l,w);
		print(calcPerim(l,w));
	}
	
	public static int calcPerim(int l, int w)
	{
		return 2*(l+w);
	}	
	
	public static void print(int perimeter)
	{
		System.out.println("The perimeter of the rectangle is " + perimeter);
	}
}