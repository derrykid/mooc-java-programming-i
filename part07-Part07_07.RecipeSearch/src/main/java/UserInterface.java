
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {

	private Scanner scanner;
	private ArrayList<Recipe> recipeMenu;

	public UserInterface(Scanner scanner, ArrayList list) {
		this.scanner = scanner;
		this.recipeMenu = list;
	}

	public void start() {
		System.out.println("File to read:");
		String file = scanner.nextLine();
		// read the input file and create recipe objects
		createList(file);
		commandList();
		while (true) {
			System.out.println("Enter command: ");
			String command = scanner.nextLine();
			if (command.equals("stop")) {
				break;
			}
			if (command.equals("list")) {
				list();
			}
			if (command.equals("find name")) {
				System.out.println("Search word: ");
				searchName();
			}
			if (command.equals("find cooking time")) {
				System.out.println("Max cooking time:");
				searchByTime();
			}
			if (command.equals("find ingredient")) {
				System.out.println("Ingredient: ");
				searchByIngredient();
			}
			System.out.println("");

		}
	}

	public void createList(String fileName) {
		try ( Scanner scanner = new Scanner(Paths.get(fileName))) {
			ArrayList<String> recipeParts = new ArrayList<>();
			while (scanner.hasNextLine()) {
				// scan the file, create the object arraylists - the name as the list name
				// create an arraylist, array.0 - name, array.1 cooktime, array.rest ingredients

				String row = scanner.nextLine();
				if (row.isEmpty() | !scanner.hasNextLine()) {
					String recipeName = recipeParts.get(0);
					int recipeTime = Integer.valueOf(recipeParts.get(1));
					ArrayList<String> ingredients = new ArrayList<>();
					for (int i = 2; i < recipeParts.size(); i++) {
						ingredients.add(recipeParts.get(i));
					}
					recipeMenu.add(new Recipe(recipeName, recipeTime, ingredients));
					recipeParts.clear();
					continue;
				}
				recipeParts.add(row);
			}
		} catch (Exception e) {
			System.out.println("Errors: " + e.getMessage());
		}
	}

	public void commandList() {
		System.out.println("Commands: ");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
		System.out.println("find name - searches recipes by name");
		System.out.println("find cooking time - searches recipes by cooking time");
		System.out.println("find ingredient - searches recipes by ingredient");
		System.out.println("");
	}

	public void list() {
		System.out.println("Recipes: ");
		for (Recipe per : this.recipeMenu) {
			System.out.println(per.getName() + ", cooking time: " + per.getTime());
		}
	}

	public void searchName() {
		String searched = scanner.nextLine();
		// String test = "Yohoo";
		// test.contains("ho");    this is true
		System.out.println("Recipes:");
		for (Recipe per : recipeMenu) {
			if (per.getName().contains(searched)) {
				System.out.println(per.toString());
			}
		}
	}

	public void searchByTime() {
		int searched = Integer.valueOf(scanner.nextLine());
		// if searched > getTime(each element) , then print the recipe
		System.out.println("Recipes:");
		for (Recipe per : recipeMenu) {
			if (searched >= per.getTime()) {
				System.out.println(per);
			}
		}

	}

	public void searchByIngredient() {
		String searched = scanner.nextLine();
		// loop through arraylist<Recipe> elements
		// if match, use toString;
		System.out.println("Recipes:");
		for (Recipe per: recipeMenu) {
			if (per.getIngredient().contains(searched)) {
				System.out.println(per);
			}
		}

	}

}
