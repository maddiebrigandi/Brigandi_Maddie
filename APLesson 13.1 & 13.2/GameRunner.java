public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem box = new XBox("XBox");
		GameSystem station = new PlayStation("PlayStayion");
		GameSystem comp = new PC("PC");
		System.out.println(box);
		System.out.println(station);
		System.out.println(comp);
	}
}