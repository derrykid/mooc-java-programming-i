import java.util.Arrays;

public class MainProgram {

	public static void main(String[] args) {
		int[] numbers = {8, 3, 7, 9, 1, 2, 4};
		MainProgram.sort(numbers);

	}

	public static void sort(int[] array) {
		// find the smallest start with Index 0
		// then swap the found index with index 0
		// then find the smallest start with index 1
		// then swap the found index with index 1
		// In short: find the samllest start with index i, then swap it with index i

		// initial state
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length -1; i ++) {
			int numberToBeSwap = 0;
			numberToBeSwap = MainProgram.indexOfSmallestFrom(array, i);
			MainProgram.swap(array, i, numberToBeSwap);
			System.out.println(Arrays.toString(array));
		}	
		
	}

	public static int smallest(int[] array) {
		int smallest = array[0];
		for (int per : array) {
			if (smallest > per) {
				smallest = per;
			}
		}
		return smallest;
	}

	public static int indexOfSmallest(int[] array) {
		int smallestIndex = 0;
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}

	public static int indexOfSmallestFrom(int[] array, int startIndex) {
		int smallestIndex = 0;
		int smallestNo = array[startIndex];

		// find the smallest number;
		for (int i = 0; i < array.length - startIndex; i++) {
			if (smallestNo > array[startIndex + i]) {
				smallestNo = array[startIndex + i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (smallestNo == array[i]) {
				smallestIndex = i;
			}
		}

		return smallestIndex;
	}

	public static void swap(int[] numbers, int swap1, int swap2) {
		int temp = 0;
		temp = numbers[swap1];
		numbers[swap1] = numbers[swap2];
		numbers[swap2] = temp;
	}

}
