import java.util.Scanner;

public class AuthorDemo2 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			System.out.println("information Author");
			System.out.println("-----------------------------------------");
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name         : ");
		String name = scan.nextLine();
		System.out.print("Input author email        : ");
		String email = scan.nextLine();
		System.out.print("Input author gender       : ");
		char gender = scan.next().charAt(0);
		Author author = new Author(name , email , gender);
		System.out.println();
		System.out.println(author);

	}

}
