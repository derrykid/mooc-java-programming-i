
import java.util.Scanner;

public class LineByLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String input = scanner.nextLine();

			String[] pieces = input.split(" ");

			for (String part : pieces) {
				System.out.println(part);
			}
			if (input.equals("")) {
				break;
			}
		}
	}
}
