
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
		
		int negativeCount = 0;
		
        Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Give a number: ");
			int number = Integer.valueOf(scanner.nextLine());
			
			if (number < 0) {
				negativeCount = negativeCount + 1;
				continue;
			}
			
			if (number == 0) {
				break;
			}
		}
		System.out.println("Number of negative numbers: " + negativeCount);
    }
}
