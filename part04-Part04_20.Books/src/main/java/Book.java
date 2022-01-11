/**
 *
 * @author derry
 */
public class Book {
	private String title;
	private int page;
	private int publicationYear;
	
	public Book(String title, int page, int publicationYear){
		this.title = title;
		this.page = page;
		this.publicationYear = publicationYear;
	
	}

	public String getName(){
		return this.title;
	}

	public int getPage() {
		return this.page;
	}

	public int getPublicationYear(){
		return this.publicationYear;
	}
}
