package AdditionProblem;

import java.util.Scanner;


/*
 * This program asks the user to respond, then reads the response from the user and determines
 * whether the user's response matches the proper response returned by the getAnswer() method.
 */


public class AdditionProblem {

	public static void main(String[] args) {
		// Creating the scanner to ask the user for an input.
		try (Scanner stdin = new Scanner(System.in)) {
			System.out.print("Please, input an answer to the problem: ");
			int b = stdin.nextInt();

			AdditionProblem an = new AdditionProblem(); // Create a new AdditionProblem object.

			System.out.println("The problem: " + an.getProblem());

			System.out.println("The calculated answer: " + an.getAnswer());

			if (b == an.getAnswer()) {
				System .out.println("Your guess was right.");
			}

			else
				System.out.println("Your guess was incorrect, sorry.");
		}

		catch (IllegalArgumentException e) {
			System.out.println("Something went wrong!");
		}

	}

	private int x,y,answer;
	// Constructor
	public AdditionProblem() {
		x = (int)(10 + 40*Math.random());
		y = (int)(30 * Math.random());
		answer = x + y;
	}
	// Getter
	public String getProblem() {
		return "Compute the sum: " + x + " + " + y;
	}
	// Getter
	public int getAnswer() {
		return answer;
	}

}
