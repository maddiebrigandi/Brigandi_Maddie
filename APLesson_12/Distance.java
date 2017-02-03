import java.util.Scanner;
import java.lang.Math.*; 
public class Distance 
 { 
 	private int xOne, yOne, xTwo, yTwo; 
 	private double Dis; 
 	 
 	public Distance() 
 	{ 
 		xOne = 0; 
 		yOne = 0; 
 		xTwo = 0; 
 		yTwo = 0; 
 		 
 	} 
 	 
 	public Distance(int x1, int y1, int x2, int y2) 
 	{ 
 		xOne = x1; 
 		yOne = y1; 
 		xTwo = x2; 
 		yTwo = y2; 
 		 
 	} 
 	 
 	public void setValues(int x1, int y1, int x2, int y2) 
 	{ 
 		xOne = x1; 
 		yOne = y1; 
 		xTwo = x2; 
 		yTwo = y2; 
 		
 	} 
 	 
 	public double getDistance() 
 	{ 
 		Dis = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne)); 
 		return Dis; 
 	} 
	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("x1: "); 
 		int x1 = kb.nextInt(); 
 		System.out.println("y1: "); 
 		int y1 = kb.nextInt(); 
 		System.out.println("x2: "); 
 		int x2 = kb.nextInt(); 
 		System.out.println("y2: "); 
 		int y2 = kb.nextInt(); 
 		 
 		Distance object = new Distance(x1, y1, x2, y2); 
 		System.out.println("Distance: " + object.getDistance()); 
	} 
 } 