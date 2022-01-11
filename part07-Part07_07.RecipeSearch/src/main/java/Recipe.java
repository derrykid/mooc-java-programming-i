import java.util.ArrayList;

public class Recipe {

	private String name;
	private int makeTime;
	private ArrayList<String> ingredient;
	
	public Recipe(String name, int time, ArrayList list) {
		this.name = name;
		this.makeTime = time;
		this.ingredient = list;
	}

	public String getName() {
		return this.name;
	}

	public int getTime() {
		return this.makeTime;
	}

	public ArrayList<String> getIngredient() {
		return this.ingredient;
	}

	@Override
	public String toString() {
		return this.name + ", cooking time: " + this.makeTime;
	}
}
