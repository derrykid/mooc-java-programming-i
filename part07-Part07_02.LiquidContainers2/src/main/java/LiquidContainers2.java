
import java.util.Scanner;

public class LiquidContainers2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Container first = new Container();
		Container second = new Container();

		while (true) {
			System.out.println("First: " + first.contains() + "/100");
			System.out.println("Second:" + second.contains() + "/100");
			String input = scan.nextLine();

			String[] parts = input.split(" ");

			if (parts[0].equals("quit")) {
				break;
			}

			String command = parts[0];
			int number = Integer.valueOf(parts[1]);

			if (command.equals("add")) {
				first.add(number);
			}

			if (command.equals("move")) {
				// first = 10, move 30
				int moveAmount = first.contains() - number;
				if (moveAmount < 0) {
					second.add(first.contains());
					first.remove(number);
				}
				// first = 30, move 20
				if (moveAmount >= 0) {
					first.remove(number);
					second.add(number);
				}
			}

			if (command.equals("remove")) {
				second.remove(number);
			}

		}

	}

}
