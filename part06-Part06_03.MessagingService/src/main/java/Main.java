import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		Message dirk = new Message("Me", "Hello");
		
		MessagingService whatsApp = new MessagingService();
		whatsApp.add(dirk);
		System.out.println(whatsApp.getMessages());
    }
}
