
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	String[] username = {"alex", "emma"};
	String[] password = {"sunshine", "haskell"};

	    System.out.println("Enter your username:");
	    String inputName = scanner.nextLine();
	    System.out.println("Enter your password:");
	    String inputPassword = scanner.nextLine();
		
	    int i = 0;
	    while (i<username.length){
	    	if (inputName.equals(username[i])) {
			if (inputPassword.equals(password[i])) {
				System.out.println("You have successfully logged in!");
				break;
			} else {
				System.out.println("Incorrect username or password!");
				break;
			}
		} 
		i++;	
	    }
	    if ( i == username.length) {
	     System.out.println("Incorrect username or password!");
	    }
    }
}
