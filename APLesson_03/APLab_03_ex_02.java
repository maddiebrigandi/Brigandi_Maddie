import java.util.Scanner; //import Statement

public class APLab_03_ex_02
{
	public static void main(String[]args)
	{
		//insantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Please enter your height.");
		
		//search for the next integer the user enters
		double height = keyboard.nextDouble();
		
		//prompt or user input
		System.out.println("Please enter your weight.");
		
		//search for the next integer the user enters
		double weight = keyboard.nextDouble();
		
		//print the results
		System.out.println("Your BMI is " + weight/(height*height)*703);
	}
}
