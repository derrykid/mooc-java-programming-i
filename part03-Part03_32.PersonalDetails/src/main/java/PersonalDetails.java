
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Longest name and average age
		// name - stores in variable - longestName; set a counter for age, and sum for all age
		String longestName = "";
		int sum = 0;
		int counter = 0;

		while (true) {
			String input = scanner.nextLine();
			String[] nameAndYear = input.split(",");

			if (input.equals("")) {
				break;
			}
			// store the longest name of all
			if (longestName.length() < nameAndYear[0].length()) {
				longestName = nameAndYear[0];
			}
			// add up age
			sum = sum + Integer.valueOf(nameAndYear[1]);
			counter++;
		}
		System.out.println("Longest name: " + longestName);
		System.out.println("Average of the birth years: " + ( 1.0 * sum / counter ));

	}
}
