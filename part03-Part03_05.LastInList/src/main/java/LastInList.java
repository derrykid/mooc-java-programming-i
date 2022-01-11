import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		// array index starts at 0
		int index = 0;

		// loop for storing data
		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
			break;
			}
			list.add(input);
			index++;
		}
		// the last one in the array. Use method .size();
		System.out.println(list.get(list.size() - 1));
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class LastInList {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<String> list = new ArrayList<>();
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.equals("")) {
//                break;
//            }
//
//            list.add(input);
//        }
//
//    }
//}
