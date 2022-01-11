import java.util.ArrayList;

public class Hold {
	private int maxWeight;
	private ArrayList<Suitcase> suitcaseList;
	
	public Hold(int weight) {
		this.suitcaseList = new ArrayList<>();
		this.maxWeight = weight;
	}

	public void addSuitcase(Suitcase suitcase) {
		int remainning = this.maxWeight - this.getWeight();

		if(remainning >= suitcase.totalWeight()) {
			suitcaseList.add(suitcase);
		}
	
	}

	public int getWeight() {
		int totalWeight = 0;

		for (Suitcase per: this.suitcaseList) {
			totalWeight += per.totalWeight();
		}
		return totalWeight;
		
	}

	public void printItems() {
		if (this.suitcaseList.isEmpty()) {
			System.out.println("No suitcase");
		}
		for (Suitcase perSuit: suitcaseList) {
			perSuit.printItems();
		}

	}

	public String toString() {
		return this.suitcaseList.size() + " suitcases (" + this.getWeight() + " kg)";
	}
	
}
