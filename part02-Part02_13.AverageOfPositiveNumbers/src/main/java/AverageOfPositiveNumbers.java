
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		float sum = 0;
		int count = 0;
		
		while (true) {
			int number = Integer.valueOf(scanner.nextLine());
			
			if (count == 0 && number == 0) {
				System.out.println("Cannot calculate the average");
				break;
			}
			
			if (number > 0) {
				sum = sum + number;
				count = count + 1;
				continue;
			}
			
			if (number == 0) {
				System.out.println( sum / count);
				break;
			}
			
			
		}
    }
}
