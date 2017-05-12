public class Magpie
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
	}
	
	public String toLowerCase()
	{
		if (statement.length() ==0)
		{
			return "Say something, please.";
		}
		
		if(statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		
		else if(statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >=0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	private int findKeyword(String statement, String goal, String startPos)
	{
		statement = statement.trim.toLowercase();
		int psn = statement.indexOf(" " + startPos() + " ", startPost);
		while(psn >= 0)
			
		return -1;
	}
	
	private int findKeyword(String statment, String goal)
	{
		return findkeyword(statement, goal, 0);
	}
	
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r*NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
				response = "Interesting, tell me more.";
		else if (whichResponse == 1)
				response = "hmm.";
		else if (whichResponse == 2)
				response = "Do you really think so?";
		else if (whichResponse == 3)
				response = "You don't say.";
		
		return response;
	}
}

