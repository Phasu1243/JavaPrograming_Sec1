import java.util.Scanner;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		 Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
	     Header();
	     int i = 1 ;
	     while(readFile.hasNext()){
	     String id = readFile.next();
	     readFile.next();
	     String fname = readFile.next().substring(0,1).toUpperCase(); 
	     String lname = readFile.next();
	     double grade = readFile.nextDouble();	
     	 readFile.next(); 
     	 System.out.println(i+"."+ "\t\t"+id+"\t\t"+ Level(id) +"\t"+ fname +"."+ lname + "\t\t"+ grade + "\t\t" + Status(grade));
     	 i++;
	     }
	     readFile.close();
	}
	
	public static String Level(String id) {
		int stulevel = Integer.parseInt(id.substring(0,2));
		int stuYear=22-stulevel;
		return stuYear+"th";
	}
	
	public static String Status(double grade) {
		if(grade>2.00) {
			return "Pass" ;
		}else if (grade<2.00&&grade>=1.00 ) {
			return "Critical"; 
		}else return "Retired";
	}
	
	public static void Header() {
		System.out.println("No.\t\tID\t\t\tLevel\tName\t\t\tGrade\t\tStatus");
		System.out.println("***************************************************************************************************");
	
	}


}
