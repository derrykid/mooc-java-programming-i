
public class Main {

    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(30, 9, 2000);
		System.out.println(date1);
		date1.advance(3);
		// 3, 10
		System.out.println("After 3 days: " + date1);
		// 13.10
		SimpleDate date2 = date1.afterNumberOfDays(10);
		System.out.println("Object date2 is: " + date2);
		
		
    }
}
