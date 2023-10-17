package MockPractice;

public class SwtichPract {

	public static void main(String[] args){
		String Season="Summer";
		switch(Season)
		{
		case"Summer":
		{
			System.out.println("Its too hot");
		break;
		}
		case"Winter":
		{
			System.out.println("Its too cold");
			break;
		}
		case"Rainy":
		{
			System.out.println("Its raining");
			break;
		}
		default:
		{
			System.out.println("Please enter correct season");
		}
		}
	}

}
