
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	private Scanner scanner;
	private ArrayList<Bird> birdList;

	public UserInterface(Scanner scanner) {

		this.scanner = scanner;
		this.birdList = new ArrayList<Bird>();

	}

	public void start() {

		while (true) {
			System.out.println("?");
			String input = scanner.nextLine();
			if (input.equals("Quit")) {
				break;
			}
			if (input.equals("Add")) {
				add();
				continue;
			}
			if (input.equals("Observation")) {
				observation();
				continue;
			}
			if (input.equals("All")) {
				all();
				continue;
			}
			if (input.equals("One")) {
				one();
				continue;
			}
		}
	}

	public void add() {
		System.out.println("Name:");
		String input = scanner.nextLine();
		String name = input;
		System.out.println("Name in Latin:");
		input = scanner.nextLine();
		String latinName = input;
		birdList.add(new Bird(name, latinName));
	}

	public void one() {
		System.out.println("Bird?");
		String input = scanner.nextLine();
		for (Bird per : birdList) {
			if (input.equals(per.getName())) {
				System.out.println(per);
			}
		}

	}

	public void all() {

		for (Bird per : birdList) {
			System.out.println(per);
		}

	}

	public void observation() {

		System.out.println("Bird?");
		String input = scanner.nextLine();

		for (Bird per : birdList) {
			if (input.equals(per.getName())) {
				per.addObservationTime();
			} 
		}
		// ask for true value
		if (!hasBird(input)) {
			System.out.println("Not a bird!");
		}

	}

	public boolean hasBird(String bird) {
		for (Bird per: birdList) {
			if (per.getName().equals(bird)) {
				return true;
			}
		}
		return false;
	}
}
