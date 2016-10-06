import java.util.Scanner;
public class Circle2
{
	static double r;
	static double area;
	
	public static void main(String[]Args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius:");
		r = kb.nextDouble();
		
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = (r*r)*3.14;
	}
	public static void print()
	{
		System.out.println("The area is " + area);
	}
}