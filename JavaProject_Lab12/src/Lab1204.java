import java.util.Scanner;
import java.io.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d//txtFile//BookData.txt"));
		String tmp = "";
		Scanner input = new Scanner(System.in); 
	    System.out.print("Enter rating of books: ");
	    double ratingbook = input.nextDouble();
	    int i = 1 , count=0 ;
	    System.out.println("-----------------------------------------------------------");
		while((tmp = readFile.readLine()) !=null ) {
			String [] data = tmp.split("\t");
			double rating = Double.parseDouble(data[2]);
			if(rating>=ratingbook) {
			System.out.print("Book"+i+":"+data[0]+"Write by" + data[1]+data[2]+"("+data[3]+") reviews");
			count ++ ;
			}
		    i++;
	   }
	 readFile.close();
	 System.out.println("-----------------------------------------------------------");
	 System.out.println("There are "+count+" book get rating more than "+ratingbook);
	}
}
