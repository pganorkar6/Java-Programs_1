package coltrolStatements;

public class Elseif {

	public static void main(String[] args) {
		String SignalColour="Green";
		if(SignalColour=="Red")
		{
			System.out.println("STOP STOP STOP");
		}
		else if(SignalColour=="Green")
		{
			System.out.println("GO GO GO GO");
		}
		else if(SignalColour=="Orange")
		{
			System.out.println("SLOW DOWN & STOP");
		}
	}

}
