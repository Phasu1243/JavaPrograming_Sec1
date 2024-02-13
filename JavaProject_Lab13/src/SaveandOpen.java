import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		//create object for input data from keyboard(console)
		Scanner input =new Scanner(System.in);
		//create object for while data to file use PrintWriter class
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		String answer;
		do {
			header(); //call header method data from keyboard(console)
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept = input.next();
			//save all data to file employee.txt
			writeFile.println(name+"\t"+dept);
			
			System.out.print("Enter data again?: ");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
		
		writeFile.close();
	}
	
	public void read() {
		try {
			Scanner readFile = new Scanner((new File("d://txtFile//employee.txt")));
			boolean check = false;
			header(); //call header() method from Employee class
			int i = 0;
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(name);
					check = true;
					i++;
				}
			}
			System.out.print("Employee in dept "+super.getDept()+" irs "+i+" person.");
			if(check==false) {
				header();
				System.out.print("Sorry,no department: "+super.getDept()+"in file.");
			}
		}catch(IOException e) {
			System.out.println("sorry, file not found");
		}	
	}
}
