/**
 * This is a class that tests the Card class.
 */
public class CardTester 
{

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card rabbit1 = new Card("King" , "Hearts" , 10);
		Card rabbit2 = new Card("8" , "Spades" , 8);
		Card rabbit3 = new Card("2" , "Clubs" , 2);
		
		System.out.println(rabbit1);
		System.out.println(rabbit2);
		System.out.println(rabbit3);
		
		System.out.println(rabbit1.matches(rabbit3));
		System.out.println(rabbit2.matches(rabbit1));
		System.out.println(rabbit3.matches(rabbit2));
		System.out.println(rabbit1.matches(rabbit1));
	}
	
	
}