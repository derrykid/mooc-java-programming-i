import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
		printUntilNumber(5);
    }
	public static void printUntilNumber(int number) {
		// Scanner scanner = new Scanner(System.in);
		// number = Integer.valueOf(scanner.nextLine());
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
	}
}
