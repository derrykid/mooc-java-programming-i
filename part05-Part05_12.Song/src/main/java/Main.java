
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
		Object anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

		if (jackSparrow.equals(anotherSparrow)) {
			System.out.println("Songs are equal.");
		} else {
			System.out.println("Nope the same");
		}

    }
}
