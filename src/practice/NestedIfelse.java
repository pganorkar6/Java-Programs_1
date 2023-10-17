package practice;

public class NestedIfelse {

	public static void main(String[] args) {
		 String Username= "pganorkar";
		 String Password= "pratik123";
		 if(Username=="pganorkar")
		 {
			 System.out.println("Please enter Password");
			 if (Password=="pratik123")
			 {
				 System.out.println("Login Succesfull");
			 }
			 else 
			 {
				 System.out.println("Please enter correct password");
			 }
		 }
		else
			 {
				 System.out.println("Incorrect Username");
			 }
		 }	 
	}

