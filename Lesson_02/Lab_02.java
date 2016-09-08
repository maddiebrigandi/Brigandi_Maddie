public class Lab_02
{
	public static void main(String[]args)
	{
		int num1 = 3;
		int num2 = 5;
		int amswer = num1*num2;
		System.out.println("2 multiplied by 4 is " + amswer);
		String first = "Torrey Pines High School ";
		String second = "12345 ";
		String third = "Del Mar Heights Rd ";
		String fourth = "Del Mar, CA 92014";
		System.out.println(first + second + third + fourth);
		int l = 2;
		int h = 3;
		int w = 4;
		int area1 = l*h;
		int area2 = l*w;
		int area3 = w*h;
		int surfacearea = area1 + area1 + area2 + area2 + area3 + area3;
		System.out.println("The surface area of the rectangle is " + surfacearea);
		
	}
}