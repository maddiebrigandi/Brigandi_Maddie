public class APLesson_04
{
	public static void main(String[]args)
	{
		APLesson_04 form = new APLesson_04();
		
		String word1 = "blaah";
		double number1 = 44446444564.3453;
		
		form.format(word1, number1);
		
		String word2 = "yesssss";
		double number2 = 123456.789;
		form.format(word2, number2);
		
	}
	public void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
}