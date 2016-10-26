import java.util.Scanner;
public class Adventure
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Welcome to Disneyland! Today you get to decide what we do at Disneyland.");
		choice();
	}
	
	public static void choice()
	{
		System.out.println("What would you like to do first? " + 
		"\n1. Ride a rollercoaster" +
		"\n2. See a show ");
		int activity = kb.nextInt();
		
		if(activity == 1)
		{
			System.out.println("Great! Which rollercoaster would you like to ride? " +
			"\n1. Space Mountain " +
			"\n2. Splash Mountain ");
			int ride = kb.nextInt();
				
			if (ride == 1)
			{
				System.out.println("Oh no! It's a 2 hour wait time. Would you like to fast pass or ride now? " + 
				"\n1. Fast pass " +
				"\n2. Ride now ");
				int time = kb.nextInt();
		
				if (time == 1)
				{
					System.out.println("Yay! We just rode our first ride of the day!");
				}			
				else
				{
					System.out.println("OK, we will come back and ride it later.");
				}
			}
			else 
			{
				System.out.println("Good choice! Would you like to wear a poncho to protect yourself from the splashes? " +
				"\n1. Wear poncho " +
				"\n2. Get spalshed ");
				int splash = kb.nextInt();
		
				if (splash == 1)
				{
					System.out.println("Smart thinking, now you'll be dry for the day ahead of you! ");
				}
				else
				{
					System.out.println("Good choice, getting splashed is part of the thrill. ");
				}
			}
		}
		else
		{
			System.out.println("Would you like to get foor before or after the show? " +
			"\n1. before" +
			"\n2. after");
			int timing = kb.nextInt();
			
			if (timing == 1)
			{
				System.out.println("What are you hungry for? " + 
				"\n1. popcorn" +
				"\n2. pizza");
				int food = kb.nextInt();
				
				if (food == 1)
				{
					System.out.println("Yum! Popcorn will be perfect to snack on during the show. ");
				}
				else
				{
					System.out.println("Great let's go sit down and eat!");
				}
			}
			else
			{
				System.out.println("Cool. WHat show would you like to see?" +
				"\n1. Aladin " +
				"\n2. A Bug's Life");
				int show = kb.nextInt();
				
				if (show == 1)
				{
					System.out.println("Great let's head over!");
				}
				else
				{
					System.out.println("I love that show, let's head over!");
				}
			}
		}
	}
}