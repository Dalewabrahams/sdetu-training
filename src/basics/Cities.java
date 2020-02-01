package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = { "New York", "San Francisco", "Miami", "Dallas" };
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
//		// Declare the array and define (size only)
//		String[] states = new String[5];
//		states[0] = "California";
//		states[1] = "Ohio";
//		states[2] = "New Jersey";
//		states[3] = "Texas";
//		states[4] = "Utah";
//		System.out.println(states[0]);

		// Declare an array
		String[] countries; // = new String[2];

		// Define the array
		countries = new String[2]; // that's 2 elements. index 0 and index 1.

		countries[1] = "South Africa";
		// System.out.println(countries[0]);

		System.out.println("************************");

		// Declare the array and define (size only)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";

		// do loop --> enters the loop first and then tests the condition
		int i = 0;
		do {
			System.out.println("STATES " + states[i]);
			// i = i + 1;
			i++;
		} while (i < 5);

		// while loop --> tests the condition first and then only can enter the loop
		int n = 0;
		while (n <= 4) {
			System.out.println("STATE at " + n + " is " + states[n]);
			n++;
		}

		System.out.println(">>>>>>>>>>>>>>>>>>");

		// while loop --> tests the condition first and then only can enter the loop
		int n1 = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String vState = states[n1];
			System.out.println(vState);
			if (vState == "Texas") {
				System.out.println("STATE FOUND, setting stateFound = true and existing loop");
				stateFound = true;
			}
			n1++;
		}

		System.out.println("\nPRINTING USING A FOR LOOP\n");
		// testing a for loop --> best loop for an array

		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);

		}

	}

}
