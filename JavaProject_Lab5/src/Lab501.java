import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fullname,fristname,lastname;
		System.out.print("Full Name: ");
	    fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name");
		}else {
			fristname = fullname.substring(0,space).toUpperCase();;
			lastname =  fullname.substring(space+1).toLowerCase();
			System.out.print("Frist Name: "  + fristname);
			System.out.print("\nLast Name: " + lastname);
		}
	}
}
