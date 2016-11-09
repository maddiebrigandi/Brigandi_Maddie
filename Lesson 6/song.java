public class song
{
	public static void main(String[]args)
	{
		String w1 = "Na";
		String w2 = "Hey";
		String w3 = "Goodbye!";
		int num1 = 4;
		int num2 = 3;
		int num3 = 1;
		sing(w1, num1);
		sing(w1, num1);
		sing(w2, num2);
		sing(w3, num3);
	}
	public static void sing(String word, int num)
	{
		for (int i = 1; i <= num; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println( );
	}
}