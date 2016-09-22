import java.util.Scanner;

public class APLab_04
{
	public static void main(String[]args)
	{
		//new APLab_04 object
		APLab_04 receipt = new APLab_04();
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		
	 	//3 sets of variables - 1 or each item
		System.out.println("Please enter item1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item2: ");
		String item2 = kb.next();
		System.out.println("Please enter price2: ");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item3: ");
		String item3 = kb.next();
		System.out.println("Please enter price3: ");
		double price3 = kb.nextDouble();
		
		
		
		System.out.println("<<<<<<_receipt_>>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		double subtotal = 17;
		receipt.format("Subtotal: ", subtotal);
		double tax = 1.36;
		receipt.format("tax: ", tax);
		double total = 18.36;
		receipt.format("total: ", total);
		
	}
	public void format(String item1, double price1)
	{
		System.out.printf("\n%2s........     %2.2f", item1, price1);
	}
}