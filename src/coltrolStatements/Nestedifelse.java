package coltrolStatements;

public class Nestedifelse {

	public static void main(String[] args) {
		String UN="Pratik123";
		String PW="1345";
		if(UN=="Pratik123")
		{
			if(PW=="12345")
			{
				System.out.println("You have succesully loggedIn");
			}
			else
			{
				System.out.println("Password is Incorrect");
			}
		}
		else 
			{
			System.out.println("Username is Incorrect");
			}
		
	}
}
