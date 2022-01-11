import java.util.ArrayList;

public class Stack {
	private ArrayList<String> stack;
	
	public Stack() {
		this.stack = new ArrayList<>();
	}

	public void add(String value) {
		this.stack.add(value);
	
	}

	public boolean isEmpty(){
		return this.stack.isEmpty();
	}

	public ArrayList<String> values() {
		return this.stack;
	}

	public String take() {
		int length = this.stack.size();
		String output = this.stack.get(length - 1);
		this.stack.remove(length - 1);
		return output;
	}
}
