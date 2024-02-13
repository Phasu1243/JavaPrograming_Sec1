import java.util.*;
import java.io.*;
public class ATMBanking {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner((new File("d://ATMBookBank.txt ")));
		Scanner input =new Scanner(System.in);
		System.out.print("Enter account number :");
		String accountNumber = input.next();
		while(!(accountNumber.substring(0).equals())){
			System.out.print("Input worng type, Enter account number : ");
			accountNumber = input.next();
			
	}
		System.out.print("Enter account password :");
		String password = input.next();
		while() {
			
		}

   }
}