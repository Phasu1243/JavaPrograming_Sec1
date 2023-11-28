import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 
		 while(true) {
			 System.out.print("Enter sales in dollars (or -1 to end): ");
			 sales = scan.nextInt();
			 if(sales==SENTINEL) {System.out.print("bye");break;}
			 salary=sales * COMMISSION_RATE+1000;
			 System.out.printf("salary is : $%.2f\n\n",salary);
			
		 }
	}

}
