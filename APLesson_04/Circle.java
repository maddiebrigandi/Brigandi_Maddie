//import scanner
import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius:");
		int r = kb.nextInt();
		
		double area = calcArea(r);
		System.out.printf("The area of the circle is %10.5f\n", area);
	}
	
	//returns area
	public static double calcArea(int r)
	{
		return (r*r)*3.14;
	}
}