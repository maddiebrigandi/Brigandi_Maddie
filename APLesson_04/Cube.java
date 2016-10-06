//import scanner
import java.util.Scanner;
public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of one side of the cube: ");
		int side = kb.nextInt();
		
		double surf = calcSurf(side);
		System.out.printf("The surface area of the cube is %10.5f\n", surf);
	}
	
	//returns surface area
	public static double calcSurf(int side)
	{
		return (side*side)*6;
	}
}