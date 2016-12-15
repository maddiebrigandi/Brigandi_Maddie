import java.util.Scanner;
public class FirstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		String [] words = new String[5];
		for(int i= 0;i < words.length; i++)
		{
			words[i] = kb.next();
		}
		first(words);
	}
	
	public static void first(String[]word)
	{
		for (String banana : word)
		{
			System.out.println(banana.substring(0,1));
		}
	}
}