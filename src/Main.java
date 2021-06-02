import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// A while-loop repeats as long as the Boolean
		// expression evaluates TRUE
		Scanner input = new Scanner(System.in);
		int random = (int) (Math.random() * 10 + 1);
		int guess = 0;
		int tries = 0;

		while (guess != random && tries < 5) {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();
			tries++;
		}
		
		if(tries == 5) {
			System.out.println("You failed.");
		}
		else {
			System.out.println("Correct! It took you " + tries + " tries");
		}
		

		// A break statement is another option for writing a while
		// loop. In this example, we intentionally write an infinite loop
		// and use an if-statement to exit the loop 
		random = (int) (Math.random() * 10 + 1);
		guess = 0;
		tries = 0;

		while (true) {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();
			tries++;
			if(guess == random || tries == 5) {
				break; //Leave the loop
			}
		}

		if(tries == 5) {
			System.out.println("You failed.");
		}
		else {
			System.out.println("Correct! It took you " + tries + " tries");
		}
	}

}
