import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		// create object for while data to file
		PrintStream WriteFile = new PrintStream((new File ("d://txtFile//sentence.txt")));
		
		//create object for input data from keyboard(console)
		Scanner input =new Scanner(System.in);
		int i = 1 ;
		while(true) {
			System.out.print("Sentence: ");
			String word = input.next();
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			
			//save data to file(write file)
			WriteFile.println(i+":"+word);
			i++;
		}
		
		System.out.println("File is save!!");
		WriteFile.close();

	}

}
