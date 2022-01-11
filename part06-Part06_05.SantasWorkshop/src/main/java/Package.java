import java.util.ArrayList;

public class Package {
	
	private ArrayList<Gift> giftName;

	public Package() {
		this.giftName = new ArrayList<>();
	}

	public void addGift(Gift gift) {
		this.giftName.add(gift);
	
	}

	public int totalWeight() {
		int weight = 0;
		for (Gift per: giftName) {
			weight = weight + per.getWeight();
		}
		return weight;
	}
	
}
