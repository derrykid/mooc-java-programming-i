import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
	private TodoList todo;
	private Scanner scanner;

	public UserInterface(TodoList todoInput, Scanner scan) {
		this.todo = todoInput;
		this.scanner = scan;
	}

	public void start() {
		while(true) {
			System.out.println("Command: ");
			String input = scanner.nextLine();

			if (input.equals("stop")) {
				break;
			}

			if (input.equals("add")) {
				System.out.println("To add:");
				String toAdd = scanner.nextLine();
				todo.add(toAdd);
			}

			if (input.equals("list")) {
				todo.print();
			}

			if (input.equals("remove")) {
				System.out.println("Which one is removed?");
				int toRemove = Integer.valueOf(scanner.nextLine());
				todo.remove(toRemove);
			}
		}
	}
	
}
