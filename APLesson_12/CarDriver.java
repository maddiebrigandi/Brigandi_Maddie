import java.util.Scanner; 
 public class CarDriver 
 { 
 	public static void main (String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
		 
 		System.out.println("Paint: "); 
 		String p = kb.next(); 
 		System.out.println("Interior: "); 
 		String i = kb.next(); 
 		System.out.println("Engine: "); 
 		String e = kb.next(); 
 		System.out.println("Tires: "); 
 		String t = kb.next(); 
 		
		Car object = new Car(p, i, e, t); 
 		 
 		System.out.println("\nYour vehicle is ready......\nPaint: " + object.getPaint() + "\nInterior: " + object.getInterior() + "\nEngine: " + object.getEngine() + "\nTires: " + object.getTires()); 
 	} 
 } 