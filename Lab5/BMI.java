import java.util.Scanner; 
 public class BMI 
 { 
	static double bmi = 0; 
	static String condition = ""; 
 	static double height; 
 	static double weight;  
 	 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please enter you height in inches:"); 
 		height = kb.nextDouble(); 
 		System.out.println("Please enter your weight in pounds:"); 
 		weight = kb.nextDouble(); 
 		BMI(); 
 		System.out.printf("Your BMI is %3.3f", bmi); 
 		System.out.println("\nYou are " + condition); 
 	} 
 	 
 	public static void BMI() 
 	{ 
 		bmi = ( weight / (height * height) ) * 703; 
 		if (bmi <= 18.5) 
 		{ 
 			condition = "underweight"; 
 		} 
 		else if (bmi<=24.9) 
 		{ 
 			condition = "normal"; 
 		} 
 		else if (bmi<=29.9) 
 		{ 
 			condition = "overweight"; 
 		} 
 		else if (bmi<=34.9) 
 		{ 
 			condition = "obese"; 
 		} 
 		else if (bmi<=39.9) 
 		{ 
 			condition = "very obese"; 
 		} 
 		else condition = "morbidly obese"; 
 	} 
 } 
