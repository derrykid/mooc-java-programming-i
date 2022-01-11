import java.util.Scanner;
import java.util.ArrayList;

public class RecipeSearch {

    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		ArrayList<Recipe> recipe = new ArrayList<>();
		UserInterface ui = new UserInterface(scanner, recipe);

		ui.start();
		
    }

}
