import java.util.Scanner; 
public class DistanceRunner 
 { 
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
 		System.out.println("Distance: " + Object.getDistance()); 
 		  
 		Object.setValues(0, 0, 3, 4); 
 		System.out.println("Distance: " + Object.getDistance()); 
	} 
 } 
