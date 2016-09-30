import java.util.Scanner;

public class APlabSubwoofer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		APlabSubwoofer volume = new APlabSubwoofer();
		
		//user inputs
		System.out.println("What is the length of the subwoofer? ");
		double length = kb.nextDouble();
		System.out.println("What is the height of the subwoofer? ");
		double height = kb.nextDouble();
		System.out.println("What is the width of the subwoofer? ");
		double width = kb.nextDouble();
		
		//method call
		System.out.println("The volume of your subwoofer is " + volume.calcVol(length, height, width) + " cubic feet.");
	}
	
	public double calcVol(double l, double h, double w)
	{
		return (l*h*w)/1728;
	}
}