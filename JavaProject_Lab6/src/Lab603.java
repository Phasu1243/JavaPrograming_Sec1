import java.util.*;
public class Lab603 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = input.nextLine();
		System.out.println(abbreviatName(fullname));
		
		}//end of main method
	
	public static  String abbreviatName (String fname) {
		String fristname  = fname.substring(0, fname.indexOf(' '));
		String middlename = fname.substring(fname.indexOf(' ') + 1 , fname.indexOf(' ') + 2);
		String lastname   = fname.substring(fname.lastIndexOf(' ') + 1 , fname.lastIndexOf(' ') + 2);
		return middlename + "." +lastname + "." +fristname;
	}
}

