
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ask for file name
		System.out.println("File:");
		String file = scan.nextLine();

		// ask for team
		System.out.println("Team:");
		String team = scan.nextLine();

		ArrayList<String> list = new ArrayList<>();
		int count = 0;
		int win = 0;
		int lost = 0;
		// read file then parse the content.
		try ( Scanner read = new Scanner(Paths.get(file))) {
			// use arraylist - contains method
			// save every row/entries into arraylist - then check the team name if it contains in the arraylist
			// use counter to count how many times it shows up

			while (read.hasNextLine()) {
				String line = read.nextLine();
				String[] parts = line.split(",");

				// count games the $team played
				if (parts[0].equals(team) | parts[1].equals(team)) {
					count++;
				}

				// if the front team is $team
				if (parts[0].equals(team)) {
					if ((Integer.valueOf(parts[2]) > Integer.valueOf(parts[3]))) {
						win++;
					} else {
						lost++;
					}
					// if the rear team is $team	
				} else if (parts[1].equals(team)) {
					if ((Integer.valueOf(parts[2]) < Integer.valueOf(parts[3]))) {
						win++;
					} else {
						lost++;
					}
				} else {
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Games: " + count);
		System.out.println("Wins: " + win);
		System.out.println("Losses: " + lost);
	}

}
