
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		TodoList list = new TodoList();
		Scanner scanner = new Scanner(System.in);

		UserInterface UI = new UserInterface(list, scanner);
		UI.start();		

		
        // Here you can try out the combined functionality of your classes
//        TodoList list = new TodoList();
//        Scanner scanner = new Scanner(System.in);

//        UserInterface ui = new UserInterface(list, scanner);
//        ui.start();

    }
}
