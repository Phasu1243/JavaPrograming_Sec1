import java.util.*;
public class TestPiggyBank {
    static Scanner scan = new Scanner(System.in);
    static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputcoin();
		 }
	public static void inputcoin() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("size of your PiggyBank:" + pb.getPiggyBank());
		MainMenu();
	}
	
	public static void MainMenu() {
		while(true) {
			System.out.println("==============================");
			System.out.println("Menu of  PiggyBank");
			System.out.println("==============================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("==============================");
			System.out.print("Please Select Menu[1-5] : ");
			int Select = scan.nextInt();
			if(Select == 1) {
				System.out.print("Insert 1 Baht Money : ");
				int number = scan.nextInt();
				pb.addOne(number);
				pb.getTotal();
				System.out.println("Money Total : " + pb.getTotal());
			}
			else if(Select == 2) {
				System.out.print("Insert 2 Baht Money : ");
				int number = scan.nextInt();
				pb.addTwo(number);
				pb.getTotal();
				System.out.println("Money Total : " + pb.getTotal());
			}
            else if(Select == 3) {
            	System.out.print("Insert 5 Baht Money : ");
				int number = scan.nextInt();
				pb.addFive(number);
				pb.getTotal();
				System.out.println("Money Total : " + pb.getTotal());
			}
            else if(Select == 4) {
            	System.out.print("Insert 10 Baht Money : ");
				int number = scan.nextInt();
				pb.addTen(number);
				pb.getTotal();
				System.out.println("Money Total : " + pb.getTotal());
            }
            else if(Select == 5) {
	            System.out.print("Bye Bye");
	            break;
            }
		}
	}
}
