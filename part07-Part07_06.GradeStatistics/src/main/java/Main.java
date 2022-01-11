
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Point point = new Point();

		System.out.println("Enter point totals, -1 stops: ");
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == -1) {
				break;
			}
			point.add(input);
		}
		double avg = point.average();
		double avgPass = point.passingAverage();
		double passingPercentage = point.passingPercentage();
		System.out.println("Point average (all): " + avg);
		if (avgPass == -1.0) {
			System.out.println("Point average(passing): -");
		} else {
			System.out.println("Point average(passing): " + avgPass);
		}
		System.out.println("Pass percentage: " + passingPercentage);
		point.printGradeStar();
	}
}
