
import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = 0;
		int second = 0;

		while (true) {
			int containerAddLiquid = 0; // sum of first or second + liquid
			int containerMinusLiquid = 0; // it's used to calculate if first container has enough liquid move to second containner
			System.out.println("First: " + first + "/100");
			System.out.println("Second: " + second + "/100");

			String input = scan.nextLine();

			// exit the program
			if (input.equals("quit")) {
				break;
			}

			String[] parts = input.split(" ");

			if (parts[0].equals("add")) {
				if (Integer.valueOf(parts[1]) < 0) {
					continue;
				}
				containerAddLiquid = first + Integer.valueOf(parts[1]);
				if (containerAddLiquid >= 100) {
					first = 100;
				} else {
					first = containerAddLiquid;
				}
			}

			if (parts[0].equals("move")) {
				int moveAmount = Integer.valueOf(parts[1]);

				if (moveAmount >= 100) {
					second = second + first;
					first = 0;

				}

				if (moveAmount < 0) {
					continue;
				}

				containerMinusLiquid = first - moveAmount;
				// if it's minus, it means moveAmount > first.
				if (containerMinusLiquid < 0) {
					second = second + first;
					first = 0;
				}

				// this means fist > moveAmount. first has enough liquid to pour over
				if (containerMinusLiquid >= 0) {
					second = second + moveAmount;
					first = first - moveAmount;
				}

				if (second >= 100) {
					second = 100;
				}

			}
			
			if (parts[0].equals("remove")) {
				int removeAmount = Integer.valueOf(parts[1]);
				if (removeAmount < 0) {
					continue;
				}
				if (removeAmount > second) {
					second = 0;
				} else {
					second = second - removeAmount;
				}
			}
		}
	}

}
