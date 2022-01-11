
public class Money {

	private final int euros;
	private final int cents;

	public Money(int euros, int cents) {

		if (cents > 99) {
			euros = euros + cents / 100;
			cents = cents % 100;
		}

		this.euros = euros;
		this.cents = cents;
	}

	// a.plus(b)
	public Money plus(Money addition) {
		int newEuros = this.euros + addition.euros;
		int newCents = this.cents + addition.cents;
		if (newCents >= 100) {
			// always in range 0 ~ 99
			newCents = newCents - 100;
			newEuros = newEuros + 1;
		}

		Money newMoney = new Money(newEuros, newCents);
		return newMoney;
	}

	// a(1,0) b(1,50)
	public boolean lessThan(Money compared) {
		if (this.euros < compared.euros) {
			return true;
		} else if (this.euros == compared.euros) {
			if (this.cents < compared.cents) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public Money minus(Money decrease) {

		// if a (10. 3); b (2.7); output will be c (7.6)
		if (!this.lessThan(decrease)) {
			// if a.cent > b.cent
			if (this.cents > decrease.cents) {
				Money minus = new Money(this.euros - decrease.euros, this.cents - decrease.cents);
				return minus;
				// if a.cent =< b.cent
			} else {
				// borrow one for cents subtraction
				int newEuros = this.euros - decrease.euros - 1;
				int newCents = 100 + this.cents - decrease.cents;
				Money minus = new Money(newEuros, newCents);
				return minus;
			}
		// if a is lessthan b
		} else {
			Money minus = new Money(0, 0);
			{
				return minus;
			}
		}

	}

	public int euros() {
		return this.euros;
	}

	public int cents() {
		return this.cents;
	}

	public String toString() {
		String zero = "";
		if (this.cents < 10) {
			zero = "0";
		}

		return this.euros + "." + zero + this.cents + "e";
	}

}
