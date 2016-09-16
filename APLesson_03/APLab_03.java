import java.util.Scanner; //import Statement

public class APLab_03
{
	public static void main(String[]args)
	{
		//insantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		//search for the next word that the user enters
		String name = keyboard.next();
		
		//Print the results...
		System.out.println("Wow! " + name + " is a horrible name.");
		
		//Promt user for input
		System.out.println("How old are you? ");
		
		//search for the next integer that the user enters
		int age = keyboard.nextInt();
		
		//Print the results...
		System.out.println(age + ", You're pretty old.");
		
		//prompt for user for input
		System.out.println("What do you do for fun?");
		
		//search for the next word the user enters
		String activity = keyboard.next();
		
		//Print the results...
		System.out.println("Ew! " + activity + " is a stupid activiy.");
		
		//prompt user for input
		System.out.println("What kind of music interests you");
		
		//search for the next word the user enters
		String music1 = keyboard.next();
		
		//print the results...
		System.out.println("Booo! " + music1 + " music makes my ears bleed.");
		
		//prompt user for input
		System.out.println("How many siblings do you have?");
		
		//search for the next integer the user enters
		int sibling = keyboard.nextInt();
		
		//print the results...
		System.out.println(sibling + "? Wow, I feel sorry for them because they're related to you.");
		
		//prompt user for input
		System.out.println("What do you want to be when you grow up?");
		
		//search for the next word the user enters
		String career = keyboard.next();
		
		//print the results...
		System.out.println("I think you'll be a horrible " + career);
		
		//print the results...
		System.out.println("I'm just kidding! I think you're wonderful! Good luck becoming a " + career + ".");
	}
}