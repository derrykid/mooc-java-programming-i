
public class YourFirstAccount {

    public static void main(String[] args) {
		Account myFirstAccount = new Account("myAccount", 100);
		myFirstAccount.deposit(20);
		System.out.println(myFirstAccount);
    }
}
