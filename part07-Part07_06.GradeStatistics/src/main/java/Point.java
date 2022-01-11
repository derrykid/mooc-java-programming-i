
import java.util.ArrayList;

public class Point {

	private ArrayList<Integer> points;

	public Point() {
		this.points = new ArrayList<>();
	}

	public void add(int number) {
		if (number >= 0 && number <= 100) {
			this.points.add(number);
		}
	}

	public double average() {
		int sum = 0;
		for (Integer per : points) {
			sum = sum + per;
		}
		return 1.0 * sum / this.points.size();
	}

	public double passingAverage() {
		int sum = 0;
		int count = 0;
		for (Integer per : points) {
			if (per >= 50) {
				sum = sum + per;
				count++;
			}
		}
		if (count == 0) {
			return -1.0;
		}
		return 1.0 * sum / count;
	}

	public double passingPercentage() {
		int passing = 0;
		for (Integer per: points) {
			if (per >= 50) {
				passing++;
			}
		}
		return 100.0 * passing / points.size();

	}

	public void printGradeStar() {
		// pseudocode
		// repeat: check points list, which grade is = 5 star/4 star/...
		// and add each one to grade5, grade4, grade3...
		// print grade5 ... etc respectively
		int grade5 = 0; // 90~100
		int grade4 = 0;	// 80~89
		int grade3 = 0;	// 70~79
		int grade2 = 0; // 60~69
		int grade1 = 0; // 50~59

		for (Integer per : points) {
			if (per >= 90) {
				grade5++;
				continue;
			}
			if (per >= 80) {
				grade4++;
				continue;
			}
			if (per >= 70) {
				grade3++;
				continue;
			}
			if (per >= 60) {
				grade2++;
				continue;
			}
			if (per >= 50) {
				grade1++;
			}
		}
		for (int i = 5; i > 0; i--) {
			System.out.print(i +": ");
			if (i == 5) {
				for (int j = 0; j < grade5; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			if (i == 4) {
				for (int j = 0; j < grade4; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			if (i == 3) {
				for (int j = 0; j < grade3; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			if (i == 2) {
				for (int j = 0; j < grade2; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			if (i == 1) {
				for (int j = 0; j < grade1; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
