package MockPractice;

public class Nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Username="Pratik";
String Password="12345";
if(Username=="Pratik")
{
	System.out.println("Username is Correct");	
	if(Password=="12345")
	{
		System.out.println("Password is correct, You have logged In");
	}
	else
	{
		System.out.println("Please enter correct password");
	}
}
else
{
System.out.println("Please enter correct username");	
}
	}

}
