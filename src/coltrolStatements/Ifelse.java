package coltrolStatements;

public class Ifelse {

	public static void main(String[] args) {
		String Gender="M";
		if(Gender=="Z")
		{
			System.out.println("You are Male");
		}
		else 
		{
			System.out.println("You are Female");
		}
		System.out.println("--------------------------------------------------------------------------------");
        int age=25;
        if(age>=60)
        {
        	System.out.println("You are eligible for Senior Citizen Scheme");
        }
        else
        {
        	System.out.println("You are not eligible for Senior Citizen Scheme");
        }
	}

}
