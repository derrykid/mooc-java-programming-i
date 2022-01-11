
import java.util.ArrayList;

public class GradeRegister {

	private ArrayList<Integer> grades;
	private ArrayList<Integer> examPoints;

	public GradeRegister() {
		this.grades = new ArrayList<>();
		this.examPoints = new ArrayList<>();
	}

	public void addGradeBasedOnPoints(int points) {
		this.grades.add(pointsToGrade(points));
		this.examPoints.add(points);
	}

	public int numberOfGrades(int grade) {
		int count = 0;
		for (int received : this.grades) {
			if (received == grade) {
				count++;
			}
		}

		return count;
	}

	public double averageOfPoints() {

		if (this.examPoints.size() > 0) {
			int sum = 0;
			for (int perPoint: examPoints) {
				sum += perPoint;
			}
			return 1.0 * sum / examPoints.size();
		}
		return -1;
	}

	public static int pointsToGrade(int points) {

		int grade = 0;
		if (points < 50) {
			grade = 0;
		} else if (points < 60) {
			grade = 1;
		} else if (points < 70) {
			grade = 2;
		} else if (points < 80) {
			grade = 3;
		} else if (points < 90) {
			grade = 4;
		} else {
			grade = 5;
		}

		return grade;
	}

	public double averageOfGrades() {
		if (grades.size() > 0) {
			// numberOfGrades(5) + 4 + 3 .... + 0 divided by total number
			int sum = 0;
			int grade = 5;
			while (grade >= 0) {
				sum = sum + grade * numberOfGrades(grade);
				grade--;
			}
			return 1.0 * sum / grades.size();
		}

		return -1;
	}
}
