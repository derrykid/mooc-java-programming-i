
import java.util.ArrayList;

public class SimpleCollection {

	private String name;
	private ArrayList<String> elements;

	public SimpleCollection(String name) {
		this.name = name;
		this.elements = new ArrayList<>();
	}

	public void add(String element) {
		this.elements.add(element);
	}

	public ArrayList<String> getElements() {
		return this.elements;
	}

	public String toString() {

		if (elements.isEmpty()) {
			return "The collection " + this.name + " is empty.";
		}

		String elementOfList = "";

		if (elements.size() == 1) {
			return "The collection " + this.name + " has " + this.elements.size() + " element:\n" + this.elements.get(0);

		}
		for (String element : elements) {
			elementOfList = elementOfList + element + "\n";
		}

		return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + elementOfList;
	}

}
