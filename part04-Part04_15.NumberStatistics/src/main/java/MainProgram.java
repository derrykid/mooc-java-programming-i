
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// for all sum
		Statistics statistics = new Statistics();

		// for even number sum
		Statistics evenStatistics = new Statistics();

		// for odd number sum
		Statistics oddStatistics = new Statistics();

		System.out.println("Enter numbers: ");
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == -1) {
				break;
			}
			if (input % 2 == 1) {
				oddStatistics.addNumber(input);
			} else {
				evenStatistics.addNumber(input);
			}
			statistics.addNumber(input);
		}
		System.out.println("Sum: " + statistics.sum());
		System.out.println("Sum of even numbers: " + evenStatistics.sum());
		System.out.println("Sum of odd numbers: " + oddStatistics.sum());
	}
}
