
import java.util.Random;
import java.util.ArrayList;

public class JokeManager {

	private ArrayList<String> jokes;

	public JokeManager() {
		this.jokes = new ArrayList<>();
	}

	public void addJoke(String joke) {
		this.jokes.add(joke);
	}

	public String drawJoke() {
		if (jokes.isEmpty()) {
			return "Jokes are in short supply.";
		} else {
			Random draw = new Random();
			int index = draw.nextInt(jokes.size());
			return jokes.get(index);
		}
	}

	public void printJokes() {
		for (String per: jokes) {
			System.out.println(per);
		}
	}
}
