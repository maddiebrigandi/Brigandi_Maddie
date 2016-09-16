import java.util.Scanner; //import Statement

public class APLab_03_ex_03
{
	public static void main(String[]args)
	{
		//insantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is the length of your kitchen?");
		
		//search for the next integer the user enters
		int length = keyboard.nextInt();
		
		//prompt user for input
		System.out.println("What is the width of your kitchen?");
		
		//search for the next integer the user enters
		int width = keyboard.nextInt();
		
		//print the results
		System.out.println("The are of your kitchen is " + length * width);
	}
}	