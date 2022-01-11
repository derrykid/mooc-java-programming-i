import java.util.Scanner;
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> numbers = new ArrayList<>();

	while (true) {
		int input = Integer.valueOf(scan.nextLine());
		if (input == -1) {
			break;
		}
		numbers.add(input);
	}
	    System.out.println("The number in the range 1~10");
	    printNumbersInRange(numbers, 1, 10) ;
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
    	for (Integer check: numbers) {
		if (check >= lowerLimit && check <= upperLimit) {
			System.out.println(check);
		}
	}
    }
    
}
