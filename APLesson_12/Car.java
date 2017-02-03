import java.util.Scanner;
public class Car
 { 
 	private String paint, interior, engine, tires; 
 	 
 	public Car() 
 	{ 
 		paint = ""; 
 		interior = ""; 
 		engine = ""; 
 		tires = ""; 
 	} 
 	 
 	public Car(String p, String i, String e, String t) 
 	{ 
 		paint = p; 
 		interior = i; 
 		engine = e; 
 		tires = t; 
 	} 
 	 
 	public void setCustom(String p, String i, String e, String t) 
 	{ 
 		paint = p; 
 		interior = i; 
 		engine = e; 
 		tires = t; 
 	} 
 	public String getPaint() 
 	{ 
 		return paint; 
 	} 
 	public String getInterior() 
 	{ 
 		return interior; 
 	} 
 	 
 	public String getEngine() 
 	{ 
 		return engine; 
 	} 
 	public String getTires() 
 	{ 
 		return tires; 
 	} 
	
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
