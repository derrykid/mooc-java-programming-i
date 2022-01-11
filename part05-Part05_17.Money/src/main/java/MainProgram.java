
public class MainProgram {

	public static void main(String[] args) {
		Money a = new Money(10, 0);
		Money b = new Money(3, 5);
		

		Money c = a.minus(b);	// 6.85e
		System.out.println(c);
		
	}
}
