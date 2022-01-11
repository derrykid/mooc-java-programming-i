
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
		int greatest = number1;
		while (true) {
			if (number2 > greatest) {
				greatest = number2;
			} else if (number3 > greatest) {
				greatest = number3;
			} else {
				break;
			}
		}
		return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
