import java.util.Scanner; 
public class userNames 
 { 

 	private String userName, firstName, lastName; 

	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("First Name: "); 
 		String fN = kb.next(); 
 		System.out.println("Last Name: "); 
 		String lN = kb.next(); 
 		 
 		User user1; 
 		 
 		System.out.println("Would you like a public avatar?"); 
 		String pubAv = kb.next(); 
 		 
 		if (pubAv.equals("n")) 
 		{ 
 			user1 = new User(fN, lN); 
 		} 
 		else 
 		{ 
 			System.out.println("Avatar: "); 
 			String av = kb.next(); 
 			user1 = new User(fN, lN, av); 
 		} 
 		System.out.println(user1); 
 	} 
	
 	public userNames() 
 	{ 

 		userName = ""; 
 		firstName = ""; 
 		lastName = ""; 
 	} 
 	 
 	public userNames(String uName, String fName, String lName) 
 	{ 
 		userName = uName; 
 		firstName = fName; 
 		lastName = lName; 
 	} 

 	public void setUserName(String uName) 
 	{ 
 		userName = uName; 
 	} 
 	 

 	public String getUserName() 
 	{ 
 		return userName; 
 	} 
 	public String getFirstName() 
 	{ 
 		return firstName; 
 	} 
 	public String getLastName() 
 	{ 
 		return lastName; 
 	} 
 } 
