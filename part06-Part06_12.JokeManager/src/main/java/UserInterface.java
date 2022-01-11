
import java.util.Scanner;

public class UserInterface {

	private JokeManager joke;
	private Scanner scanner;

	public UserInterface(JokeManager joke, Scanner scanner) {
		this.joke = joke;
		this.scanner = scanner;
	}

	public void start() {
		commands();

	}

	public void options() {
		System.out.println("Commands:");
		System.out.println("1 - add a joke");
		System.out.println("2 - draw a joke");
		System.out.println("3 - list jokes");
		System.out.println("X - stop");
	}

	public void commands() {
		while (true) {
			options();
			String input = scanner.nextLine();
			if (input.equals("X")) {
				break;
			}

			int intInput = Integer.valueOf(input);

			if (intInput == 1) {
				System.out.println("Write the joke to be added:");
				String jokeInput = scanner.nextLine();
				joke.addJoke(jokeInput);
				continue;
			}

			if (intInput == 2) {
				System.out.println(joke.drawJoke());
				continue;
			}

			if (intInput == 3) {
				System.out.println("Print the jokes.");
				joke.printJokes();
				continue;
			}

		}

	}

}
