import java.util.ArrayList;

public class Suitcase {
	private int maxWeight;
	private ArrayList<Item> item;

	public Suitcase(int maxWeight) {
		this.maxWeight = maxWeight;
		this.item = new ArrayList<>();
	}

	public void addItem (Item item) {
		int totalWeight = this.totalWeight();

		int remainingWeight = this.maxWeight - totalWeight;

		if (remainingWeight >= item.getWeight()) {
			this.item.add(item);
		}
	}

	public void printItems() {
		for (Item per: item) {
			System.out.println(per.getName() + " (" + per.getWeight() + " kg)");
		}
	}

	public Item heaviestItem() {
		if (this.item.isEmpty()) {
			return null;
		}

		Item heaviestItem = this.item.get(0);

		for (Item per: this.item) {
			if (heaviestItem.getWeight() < per.getWeight()) {
				heaviestItem = per;
			}
		}

		return heaviestItem;
	}

	
	public int totalWeight() {
		int totalWeight = 0;
		for (Item per: this.item) {
			totalWeight += per.getWeight();
		}
		return totalWeight;
	}

	public String toString() {
		
		if (this.item.isEmpty()) {
			return "no items (0 kg)";
		}

		if (this.item.size() == 1) {
			return "1 item (" + this.item.get(0).getWeight() + " kg)";
		}
		
		int totalWeight = 0;
		for (Item per: this.item) {
			totalWeight +=per.getWeight();
		}
		return this.item.size() + " items (" + totalWeight + " kg)";
	}
}
