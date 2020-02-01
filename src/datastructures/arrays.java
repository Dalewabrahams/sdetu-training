package datastructures;

public class arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a","b","c","d","e", "f", "g"};
		
		System.out.println("The old fashioned way");
		for(int i=0; i<4;i++) {
			System.out.print(alphabet[i] + " ");
		}

		
		System.out.println("\n\nUsing the length variable");
		int size = alphabet.length;
		for(int n=0;n<size;n++) {
			System.out.print(alphabet[n] + " ");
		}
		
		System.out.println("\n\nUsing FOR EACH");
		for(String letter : alphabet) {
		
				System.out.print(letter + " ");
		}
		
		System.out.println("\n\n");
		
		String[][] users = {
							 {"Dale", "Abrahams", "Dwa@gmail.com","084585545","8875"},
						     {"Tabitha", "Abrahams", "TA@gmail.com","0785452"},
						  	 {"Luke", "Abrahams", "Luke@gmail.com","54868542"},
							
							};
									
			
		for (String[] singleUserArray : users) {
			System.out.print("[");
			for(String perUser : singleUserArray) {
				System.out.print(perUser +  ", ");
			}
			System.out.print("] ");
		}
			
		
		System.out.println("\n\n");
		
		int NoOfElementsInArray = users.length;
		System.out.println("NoOfElementsInArray : " + NoOfElementsInArray);
		
		
		for(int i=0;i<NoOfElementsInArray;i++) {
			int NoOfFieldsPerElement = users[i].length;
			System.out.println("NoOfFieldsPerElement : " + NoOfFieldsPerElement);
			for(int j=0;j<NoOfFieldsPerElement;j++) {
				System.out.print(users[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		
		
		String[][] matrix = { {"a","b","c"},
                {"e","f","g"},
                {"h","i","j"} };

		for (String[] list : matrix) {
		for (int i=list.length-1;i>=0;i--) {
		System.out.print(list[i]);
		}
		}
		
		}
	
	

	
}
