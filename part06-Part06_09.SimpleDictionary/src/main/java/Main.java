
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDictionary list = new SimpleDictionary();

		TextUI ui = new TextUI(scanner, list);

		ui.start();


		
    }
}
