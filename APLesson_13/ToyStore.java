import java.util.*;

public class ToyStore
{
	ArrayList<Toy> toysList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		toysList = new ArrayList<>();
	}
	
	public ToyStore(String toy1)
	{
		loadToys(toy1);
	}
	
	public void loadToys(String toy1)
	{
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(toy1.split(", ")));
		toysList = new ArrayList<>();
		for(int i=0; i< toysList.size(); i+= 2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getThatToy(name);
			if (t == null)
			{
				if(type.equalsIgnoreCase("Car"))
					toysList.add(new Car2(name));
				if(type.equalsIgnoreCase("AF"))
					toysList.add(new AFigure(name));
			}
			else
			{
				t.setCount(t.getCount() + 1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for (Toy t : toysList)
		{
			if (t.getName().equalsIgnoreCase(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = " ";
		int max = Integer.MIN_VALUE;
		for(Toy t: toysList)
		{
			if(max< t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy t : toysList)
		{
			if(t.getType().equalsIgnoreCase("Car"))
			{
				cars++;
			}
			
			if(t.getType().equalsIgnoreCase("AF"))
			{
				figures++;
			}
		}
		
		if(cars > figures)
		{
			return "Cars";
		}
		
		if(figures > cars)
		{
			return "Action Figures";
		}
		
		else
		{
			return "Equal amount of cars and action figures.";
		}
	}
	
	public String toString()
	{
		return " " + toysList;
	}
}
