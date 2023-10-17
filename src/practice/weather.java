package practice;

public class weather {

	public static void main(String[] args) {
		String season ="rainy";
		switch (season) {
		case "summer":
		{
			System.out.println("Its too hot");
			break;
		}
		case "winter": 
		{
		System.out.println("Its too cold");
		break;
		}
		case "rainy":
		{
			System.out.println("Its raining");
			break;
		}
		default:
		{
		System.out.println("Please enter valid season");
		}
		}
	}
	}
