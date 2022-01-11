
public class SimpleDate {

	private int day;
	private int month;
	private int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public SimpleDate afterNumberOfDays (int days) {
		SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
		newDate.advance(days);
		return newDate;
	}

	public void advance() {
		this.advance(1);
	}

	public void advance(int howManyDays) {
		// addMonth 1 ~ 12; addDay 1 ~ 30;
		int addYear = howManyDays / 360;
		int addMonth = (howManyDays - addYear * 360) / 30;
		int addDay = (howManyDays - addYear * 360 - addMonth * 30);

		// advance Day
		if (this.day + addDay > 30) {
			this.day = this.day + addDay - 30;
			this.month = this.month + 1;
			if (this.month + 1 > 12) {
				this.year = this.year + 1;
				this.month = 1;
			}
		} else {
			this.day = this.day + addDay;
		}
		
		// advance Month
		if (this.month + addMonth > 12) {
			this.year = this.year + 1;
			this.month = this.month + addMonth - 12;
		} else {
			this.month = this.month + addMonth;
		}
		this.year = this.year + addYear;

	}

	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean before(SimpleDate compared) {
		if (this.year < compared.year) {
			return true;
		}

		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		if (this.year == compared.year && this.month == compared.month
				&& this.day < compared.day) {
			return true;
		}

		return false;
	}

}
