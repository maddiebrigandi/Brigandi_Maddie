import java.util.Scanner;
public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your math grade: ");
		String math = kb.next();
		System.out.println("Please enter your english grade: ");
		String english = kb.next();
		System.out.println("Please enter your science grade: ");
		String science = kb.next();
		System.out.println("Please enter your spanish grade: ");
		String spanish = kb.next();
		System.out.println("Please enter your history grade: ");
		String history = kb.next();
		System.out.println("Please enter your psychology grade: ");
		String psych = kb.next();
		System.out.println("Please enter your computer science grade: ");
		String compsci = kb.next();
		
		double gPoints = calcPoints(science) + calcPoints(math) + calcPoints(english) + calcPoints(spanish) + calcPoints(history) + calcPoints(psych) + calcPoints(compsci);
		double gpa = gPoints / 7.0;
		System.out.println("Your GPA is " + gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		
		return 0.0;
	}
}