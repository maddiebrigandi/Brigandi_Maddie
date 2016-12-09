public class GetOdds
{
	static int[] Array = new int[10];
	
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("\nThe odd numbers are...");
		getOdds();
	}
	
	public static void fillArray()
	{
		for(int i = 0;i < 10; i++)
		{
			Array[i] = 1 + (int)((Math.random()*100));
		}
	}
	
	public static void printArray()
	{
		for(int banana : Array)
		{
			System.out.println(banana + " ");
		}
	}
	
	public static void getOdds()
	{
		for (int numb : Array)
		{
			if(numb%2 == 1)
			{
				System.out.println(numb + " ");
			}
		}
	}
}