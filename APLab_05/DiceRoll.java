public class APLab_05
{
	public static void main(String[]args)
	{
		int player = 1 + (int)((Math.random())*6);
		int computer = 1 + (int)((Math.random())*6);
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		String win = winner(player, computer);
		System.out.println("And the winner is " + win);
	}
	
	public static String winner(int player, int computer)
	{
		String winner = "";
		//if player is greater
		if(player>computer)
		{
			winner = "you!";
		}
		//if computer is greater
		if(computer>player)
		{
			winner = "the computer";
		}
		return winner;
	}
}