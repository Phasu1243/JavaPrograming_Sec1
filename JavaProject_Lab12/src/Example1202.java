import java.util.Scanner;
import java.io.*;
public class Example1202 {
	public static void main(String[] args) throws IOException {
	     Scanner input = new Scanner(System.in); //input data from Keyboard(console)
	     System.out.print("Input Section:");
	     int section = input.nextInt();
	     Header();
	     showListStudent(section);
	}
	
	public static void showListStudent(int sectioninput) throws IOException {
		//Read data from file using BufferedRader class
		BufferedReader readFile = new BufferedReader(new FileReader("d//txtFile//List107.txt"));
		String tmp = "";
		while((tmp = readFile.readLine()) !=null) {
			String[] data = tmp.split("\t");
			//read midtem and final score from file to display
			double midtemScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			
			if(sectionFile == sectioninput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScore+"\t"+finalScore+findResult(midtemScore,finalScore));
			}
		}
		readFile.close();
	}
	
	public static String findResult(double midtemscore,double finalscore) {
		double totalScore = midtemscore+finalscore;
	/*	if(totalScore<=40) {return "Fail" ;
		}else return "Pass"; */
		return totalScore<40?"Fail":"Pass";
	}
	
	public static void Header() {
		System.out.println("*********************************************************************************");
		System.out.println("\t\t\tList of Data for Section");
		System.out.println("*********************************************************************************");
	}
	//end class

}
