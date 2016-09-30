import java.util.Scanner;

public class APLab_041
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		APLab_041 loan = new APLab_041();
		
		//user inputs
		System.out.println("What is your interest rate?");
		double rate = kb.nextDouble();
		System.out.println("What is your principal amount?");
		double principal = kb.nextDouble();
		System.out.println("How many years is the loan?");
		double time = kb.nextDouble();
		System.out.println("How many times will the loan be compounded per year?");
		double number = kb.nextDouble();
		//method call
		System.out.println("Your monthly payment will be " + loan.payment(rate, principal, number, time));
	}
	
	public double payment(double r, double p, double n, double t)
	{
		//retun total monthly payment
		return p*(Math.pow(1+r/n, n*t))/(t*12);
		
	}
}