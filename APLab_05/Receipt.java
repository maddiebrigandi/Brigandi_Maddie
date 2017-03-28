import java.util.Scanner;
public class Receipt
{ 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		Receipt receipt = new Receipt(); 
 		System.out.println("Please enter item 1:"); 
 		String item1 = kb.next(); 
 		System.out.println("Please enter the price:"); 
 		double price1 = kb.nextDouble(); 
 		System.out.println("Please enter item 2:"); 
 		String item2 = kb.next(); 
 		System.out.println("Please enter the price:"); 
 		double price2 = kb.nextDouble(); 
 		System.out.println("Please enter item 3:"); 
 		String item3 = kb.next(); 
 		System.out.println("Please enter the price:"); 
 		double price3 = kb.nextDouble(); 
 		System.out.println("Please enter item 4:"); 
 		String item4 = kb.next(); 
 		System.out.println("Please enter the price:"); 
 		double price4 = kb.nextDouble(); 
 		String item5 = "Subtotal:"; 
 		double price5 = price1 + price2 + price3 + price4; 
 		String item6 = "Discount:"; 
 		double price6 = price5 * disc(price5); 
 		String item7 = "Tax:"; 
 		double price7 = .08 * (price5 - price6); 
 		String item8 = "Total:"; 
 		double price8 = price5 - price6 + price7;  
 		 
 		 
 		System.out.println("<<<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>>"); 
 		receipt.format(item1, price1); 
 		receipt.format(item2, price2); 
		receipt.format(item3, price3); 
 		receipt.format(item4, price4); 
 		receipt.format(item5, price5); 
 		receipt.format(item6, price6); 
 		receipt.format(item7, price7); 
 		receipt.format(item8, price8); 
 	 
 		System.out.println(); 
 		 
 		System.out.println("___________________________________________________"); 
 		 
 		System.out.println("* Thank you!"); 
 		 
 	} 
 	 
 	public static double disc(double price5) 
 	{ 
 		double disc = 0; 
 		if (price5 >= 2000) 
 		{ 
 			disc = .15; 
 		} 
 		 
 		if (price5 <= 2000) 
 		{ 
 			disc = 0; 
 		} 
 		return disc; 
 	} 
 	 
 	public void format(String item, double price) 
 	{ 
 		System.out.printf("\n*  %20s          %10.2f", item, price); 
 	} 
}