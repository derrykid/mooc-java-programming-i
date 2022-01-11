
import java.util.Scanner;

public class AVClub {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();
			String[] avpieces = input.split(" ");

			for (int i = 0; i < avpieces.length; i++) {
				if (avpieces[i].contains("av")) {
					System.out.println(avpieces[i]);
				}
			}

			if (input.equals("")) {
				break;
			}
		}

	}
}
