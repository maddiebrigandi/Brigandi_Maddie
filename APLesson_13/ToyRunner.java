public class ToyRunner
{
	public static void main(String[]args)
	{
		String toy = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		ToyStore runner = new ToyStore(toy);
		System.out.println(runner);
		System.out.println("The most frequent toy is: " + runner.getMostFrequentToy());
		System.out.println("the most frequent type of toy is: " + runner.getMostFrequentType());
	}
}