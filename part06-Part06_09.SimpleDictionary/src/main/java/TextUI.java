import java.util.Scanner;

public class TextUI {

	private SimpleDictionary dict;
	private Scanner scan;

	public TextUI(Scanner scanner, SimpleDictionary dictionary) {
		this.dict = dictionary;
		this.scan = scanner;
	}

	public void start() {
		while (true) {
			System.out.println("Command: ");
			String input = scan.nextLine();

			if (input.equals("add")) {
				System.out.println("Word: ");
				String word = scan.nextLine();
				System.out.println("Translation: ");
				String translation = scan.nextLine();
				this.dict.add(word, translation);
				continue;
				
			}

			if (input.equals("search")) {
				System.out.println("To be translated:");
				String toBeTranslated = scan.nextLine();
				String translation = dict.translate(toBeTranslated);
				if (translation == null) {
					System.out.println("Word " + toBeTranslated + " was not found");
					continue;
				} 

				System.out.println("Translation: " + translation);
				continue;
				
			}

			if (input.equals("end")) {
				System.out.println("Bye bye!");
				break;
			}

			System.out.println("Unknown command");
			
		}
	}

}
