import java.util.Scanner;

public class APLab_04_ex2
{
	public static void main(String[]args)
	{
		//new APLab_04_ex2 object
		APLab_04_ex2 idcard = new APLab_04_ex2();
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstname = kb.nextLine();
		System.out.println("Enter your last name: ");
		String lastname = kb.nextLine();
		System.out.println("Enter your title: ");
		String title = kb.nextLine();
		System.out.println("Enter the school site: ");
		String school = kb.nextLine();
		System.out.println("Enter the school year: ");
		String year = kb.nextLine();
		System.out.println("What is your favorite subject? ");
		String subject = kb.nextLine();
		
		System.out.println("***************************");
		idcard.format (school, year);
		idcard.format(firstname, lastname);
		idcard.format(title, subject);
	}
	public void format(String firstname, String lastname)
	{
		System.out.printf("\n%20s \t%20s", firstname, lastname);
	}
}
		