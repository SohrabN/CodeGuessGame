
public class TestCodeGuessGame {

	public static void main(String[] args) {
		
		System.out.printf("***Welcome to the Code Guessing Game***\n\nYou have 6 tries to find the secret 3 letter code\nThe letters range from A to C\n\nThe code can have repeat letters" );

		CodeGuessGame obj1 = new CodeGuessGame();
		
		obj1.getGuess();
		//obj1.checkGuess();
		//obj1.display();
		
	}

}
