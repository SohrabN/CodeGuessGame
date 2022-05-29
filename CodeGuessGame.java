import java.util.Random;
import java.util.Scanner;


public class CodeGuessGame {
	Scanner input=new Scanner(System.in);

	private String code=new String();//randomly generated code
	private String guess;//player guess
	private boolean done=false;//
	private Random zzz=new Random();
	private int guessCount;
	int correctGuesses=0;
	//char cc=String.toCharacter(guess);




	public CodeGuessGame() {
		char a = ((char)(zzz.nextInt(3)+65));
		char b = ((char)(zzz.nextInt(3)+'A'));
		char c = ((char)(zzz.nextInt(3)+'A'));

		code=Character.toString(a)+Character.toString(b)+Character.toString(c);
		System.out.println("\n"+code);
		



	}

	//if(done()==true){
	//}
	public void getGuess() {
		//char cc=String.toCharacter(guess);
		final int numberOfGuesses=7;
		//done();


		for(guessCount=1;guessCount<numberOfGuesses &&  done == false ;guessCount++){
			System.out.print("\nEnter guess #"+guessCount+": ");
			guess=input.next();
//			if(guess=="quit"||guess=="QUIT") {
//				done=true;
//			}
			isValid();
			if(isValid()==true) {
				while (guess.length()<3) {
					System.out.println("Guess is too Short");
					System.out.println("\nEnter guess #"+guessCount+": ");
					guess=input.nextLine();
				}

			

				while(guess.length()>3) {

					System.out.println("Guess is too long");
					System.out.print("\nEnter guess #"+guessCount+": ");
					guess=input.next();
					while (guess.length()<3) {
						System.out.println("Guess is too Short");
						System.out.println("\nEnter guess #"+guessCount+": ");
						guess=input.nextLine();
					}
				}
				checkGuess();
				
			}else {
				
			}
		}


		}




	private boolean isValid() {

		
		//char c= (char) (guess.charAt(0)+guess.charAt(1)+guess.charAt(2));
//		int cValue=(guess.charAt(0)+guess.charAt(1)+guess.charAt(2));
		while(!(guess.charAt(0)=='A'||guess.charAt(0)=='B'||guess.charAt(0)=='C'||guess.charAt(0)=='a'||guess.charAt(0)=='b'||guess.charAt(0)=='c')) {
			System.out.println(guess.charAt(0)+" is not a valid first letter");
			System.out.println("\nEnter guess #"+guessCount+": ");
			guess=input.next();
		}
		while(!(guess.charAt(1)=='A'||guess.charAt(1)=='B'||guess.charAt(1)=='C'||guess.charAt(1)=='a'||guess.charAt(1)=='b'||guess.charAt(1)=='c')) {
			System.out.println(guess.charAt(1)+" is not a valid second letter");
			System.out.println("\nEnter guess #"+guessCount+": ");
			guess=input.next();
		}
		while(!(guess.charAt(2)=='A'||guess.charAt(2)=='B'||guess.charAt(2)=='C'||guess.charAt(2)=='a'||guess.charAt(2)=='b'||guess.charAt(2)=='c')) {
			System.out.println(guess.charAt(2)+" is not a valid third letter");
			System.out.println("\nEnter guess #"+guessCount+": ");
			guess=input.next();
}
	
							
							
			return true;
		}

	public boolean done() {//is this correct?
		if(correctGuesses==3||input.next()=="quit"||input.next()=="QUIT") {
			System.out.println("YOU WIN!");
			return done = true;
		}
		else {
			System.out.println("YOU LOSE");
			return done = false;
		}


	}
	public void checkGuess() {
		char c=guess.charAt(2);
		char b=guess.charAt(1);
		char a=guess.charAt(0);

		if(c==code.charAt(2)){
			correctGuesses++;

		}
		if(b==code.charAt(1)){
			correctGuesses++;

		}
		if(a==code.charAt(0)){
			correctGuesses++;

		}
		System.out.println(correctGuesses+" correct letters in the correct space");

	}

	public String display() {
		if(correctGuesses==3) {
			//System.out.println("The correct code was "+code);


		}
		return "The correct code was "+code;
	}
}


//}


