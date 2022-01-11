import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

		ArrayList<Book> list = new ArrayList<>();

		while (true) {
			System.out.println("Title: ");
			String title = scanner.nextLine();
			if (title.equals("")) {
				break;
			}
			System.out.println("Pages: ");
			int page = Integer.valueOf(scanner.nextLine());
			System.out.println("Publication Year: ");
			int publicationYear = Integer.valueOf(scanner.nextLine());

			list.add(new Book(title, page, publicationYear));
			
		}
		


		System.out.println("What information will be printed?");
		String quest = scanner.nextLine();

		if (quest.equals("everything")) {
			for (Book entity: list) {
				System.out.println(entity.getName() + ", " + entity.getPage() + " pages, " + entity.getPublicationYear());	
			}
		}

		if (quest.equals("name")) {
			for (Book entity: list) {
				System.out.println(entity.getName());
			}
		}



    }
}
