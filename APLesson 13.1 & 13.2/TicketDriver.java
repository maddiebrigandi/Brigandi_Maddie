public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket x = new Walkup();
		Ticket y = new Advance(9);
		Ticket z = new Advance(14);
		Ticket ab = new StudentAdvance(5);
		Ticket xy = new StudentAdvance(11);
		System.out.println(ab);
		System.out.println(xy);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}