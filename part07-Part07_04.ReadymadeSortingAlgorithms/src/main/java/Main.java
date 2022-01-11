import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
		String[] stringArray = {"H", "z", "e", "l", "o"};
        int[] array = {3, 1, 5, 99, 3, 12};
		Main.sort(stringArray);
		Main.sort(array);
		System.out.println(Arrays.toString(stringArray));
		System.out.println(Arrays.toString(array));

		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<Integer> ageList = new ArrayList<>();

		nameList.add("Ada");
		nameList.add("Bella");
		nameList.add("Zed");
		nameList.add("Olaf");

		ageList.add(32);
		ageList.add(18);
		ageList.add(92);
		ageList.add(23);

		Main.sortStrings(nameList);
		Main.sortIntegers(ageList);
		
		System.out.println(nameList);
		System.out.println(ageList);
    }

	public static void sort(int[] array) {
		Arrays.sort(array);
	}

	public static void sort(String[] array) {
		Arrays.sort(array);
	
	}

	public static void sortIntegers(ArrayList<Integer> integers){
		Collections.sort(integers);
	}

	public static void sortStrings(ArrayList<String> strings){
		Collections.sort(strings);
	}

}
