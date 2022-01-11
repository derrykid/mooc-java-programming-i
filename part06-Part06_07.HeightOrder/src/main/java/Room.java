
import java.util.ArrayList;

public class Room {

	private ArrayList<Person> persons;

	public Room() {
		this.persons = new ArrayList<>();
	}

	public void add(Person person) {
		this.persons.add(person);
	}

	public boolean isEmpty() {
		return this.persons.isEmpty();
	}

	public ArrayList<Person> getPersons() {
		return this.persons;
	}

	public Person shortest() {

		if (this.persons.isEmpty()) {
			return null;
		}

		Person returnObj = this.persons.get(0);
		for (Person per : persons) {
			if (returnObj.getHeight() > per.getHeight()) {
				returnObj = per;
			}
		}
		return returnObj;
	}

	public Person take() {
		if (this.persons.isEmpty()) {
			return null;
		}

		Person shortest = this.shortest();
		this.persons.remove(this.shortest());
		return shortest;
	}

}
