import java.util.Scanner;
public class Rectangle2
{
	static int l,w;
	static int perimeter;
	
	public static void main(String[]Args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length:");
		l = kb.nextInt();
		System.out.println("Please enter the width:");
		w = kb.nextInt();
		
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = 2*(l+w);
	}
	public static void print()
	{
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}