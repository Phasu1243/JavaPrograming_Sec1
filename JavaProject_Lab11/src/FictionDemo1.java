import javax.swing.*;
import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.print("input title :");
		String title = scan.nextLine();
		System.out.print("input Year :");
		int Year = scan.nextInt();
		
		FictionBook book = new FictionBook(title,Year);
		scan.nextLine();
		System.out.print("input name :");
		String name = scan.nextLine();
		System.out.print("input email :");
		String email = scan.nextLine();
		
		book.setAuthorName(name);
		book.setEmail(email);
		
		while(!book.checkFormatName()){
			System.out.print("input name :");
			name = scan.nextLine(); 
			book.setAuthorName(name);
		}
		while(!book.checkEmail()){
			System.out.print("input email :");
			name = scan.nextLine(); 
			book.setEmail(email);;
		}
		System.out.println(book);
		
		
		
	    

	}

}
