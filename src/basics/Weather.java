package basics;

public class Weather {
	
	public static void main(String[] args) {
		// This program will advise us on what to wear based on the weather (temperature)
		
		int temperature = 20; 
		String sunCondition = "Sunny";
		
		if(temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt.");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler outside, perhaps wear a longer t-shirt and jeans.");
			System.out.println("Wear a cap to keep the sun out of your eyes");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cooler day, make sure to wear something warmer" );
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		System.out.println("Program is ending");
		
	}

}
