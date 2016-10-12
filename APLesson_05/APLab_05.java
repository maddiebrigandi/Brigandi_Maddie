public class APLab_05
{
	public static void main(String[]args)
	{
		int player = (Math.random()*6)+1;
		int computer = (Math.random()*6)+1;
		
		String Winner = diceRoll(player, computer);//output from diceRoll
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is " + Winner);
	}
	
	public static double diceRoll(int player, int computer)
	{
		String winner = "";
		//if player is greater
		if(player>computer)
			winner = "player";
		//if computer is greater
		else if(computer>player)
			winner = "computer";
		else winnter = "tie";
		return winner;
		
	}
}
