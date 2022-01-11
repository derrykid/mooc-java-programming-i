
public class AdvancedAstrology {

    public static void printStars(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
		System.out.println("");
    }
	
    public static void printSpaces(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print(" ");
		}
		
    }
	
    public static void printTriangle(int size) {
		int i = 1;
		while (i <= size) {
			printSpaces(size - i);
			printStars(i);
			i++;
			//System.out.println("");
		}
    }

    public static void christmasTree(int height) {
		// line number
		int i = 1;
		
		while (i <= height) {
			int starNumber = i * 2 - 1;
			printSpaces(height - i);
			printStars(starNumber);
			//printSpaces(height - i);
			i++;
			//System.out.println("");
		}

		for (int j = 0; j < 2; j++) {
			int bottomNoOfStars = height * 2 - 1;
			int spaceAside = (bottomNoOfStars - 3) / 2;
			printSpaces(spaceAside);
			printStars(3);
			//printSpaces(spaceAside);
			//System.out.println("");
		}
		// base is at centre; where every + 1 height, 2 more stars aside.
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
	
		printTriangle(5);
		System.out.println("---");
		christmasTree(4);
		System.out.println("---");
		christmasTree(10);

    }
}
