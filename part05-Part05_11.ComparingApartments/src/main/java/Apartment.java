
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

	public boolean largerThan(Apartment compared) {
		return	this.squares > compared.squares;
	}

	public int priceDifference(Apartment compared) {
		int compareOrigin = this.squares * this.princePerSquare;
		int comparedObject = compared.squares * compared.princePerSquare;
		boolean ifLarger = compareOrigin > comparedObject;
		if (ifLarger) {
			return compareOrigin - comparedObject;
		}
		return comparedObject - compareOrigin;
	}

	public boolean moreExpensiveThan (Apartment compared) {
		int compareOrigin = this.squares * this.princePerSquare;
		int comparedObject = compared.squares * compared.princePerSquare;
		return compareOrigin > comparedObject;
		
	}
}
