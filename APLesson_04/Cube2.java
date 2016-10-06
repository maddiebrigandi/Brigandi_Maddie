import java.util.Scanner;
public class Cube2
{
	static int side;
	static int sa;
	
	public static void main(String[]Args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the side length:");
		side = kb.nextInt();
		
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = (side*side)*6;
	}
	public static void print()
	{
		System.out.println("The surface area is " + sa);
	}
}