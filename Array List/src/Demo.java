import java.util.*;

public class Demo {
	
	
	static ArrayList<Book> books = new ArrayList<Book>();
	
	public static void main(String[] args) {
	
		String title;
		String author;
		long isbn;
		double price;
		boolean isBorrowed;
		
		Scanner input = new Scanner(System.in);
		
		try {
			
		while (true) {
		
		System.out.println("Enter book title (or done to exit)");
		title = input.next();
		if (title.equalsIgnoreCase("done")) {
			break;
		} else
	    input.nextLine();
		System.out.println("Enter book author");
		author = input.next();
		input.nextLine();
		System.out.println("Enter book isbn");
		isbn = input.nextLong();
		System.out.println("Enter book price");
		price = input.nextDouble();
		System.out.println("Is the book borrowed? (true/false)");
		isBorrowed = input.nextBoolean();
		input.nextLine();
		
		books.add(new Book(title, author, isbn, price, isBorrowed));
		
		}
		}
		
		catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
		
		input.close();
		
		System.out.println("----");
		System.out.println("The books you entered are:");
		
		for (Book list : books) {
			System.out.println(list);
		}
	}

}
