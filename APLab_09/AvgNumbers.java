public class AvgNumbers
{
	public static void main(String[]args)
	{
		int[]numbs = new int[10];
		for(int i = 0;i < numbs.length; i++)
		{
			numbs[i] = 1 + (int)((Math.random()*100));
		}
		
		System.out.println("The average of the numbers... ");
		for (int banana : numbs)
		{
			System.out.println(banana + " ");
		}
		System.out.println("");
		System.out.println("is " + average(numbs));
	}
	
	public static int average(int[]numbers)
	{
		int avg = 0;
		for (int numb : numbers)
		{
			avg += numb;
		}
		return avg/10;
	}
}