import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title        : ");
		String title = scan.nextLine();
		System.out.print("Input book price        : ");
		float price = scan.nextFloat();
		System.out.print("Input book publish year : ");
		int publishyear = scan.nextInt();
		book.setTitle(title);
		book.setPrice(price);
		book.setPublishyear(publishyear);
		System.out.println();
		System.out.println(book);

	}

}
