public class APLab_05
{
	public static void main(String[]args)
	{
		int player = (Math.random()*7)+1;
		int computer = (Math.random()*7)+1;
		
		String Winner = //output from diceRoll
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
	}
	
	public static double diceRoll(int player, int computer)
	{
		String winner = "";
		//if player is greater
		if(player>computer)
			winner = player;
		//if computer is greater
		if(computer>player)
			winner = computer;
		return winner;
		
	}
}