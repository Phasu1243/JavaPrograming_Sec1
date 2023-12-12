import javax.swing.*;
public class Example_503_1 {

	public static void main(String[] args) {
		
		//1.input sentence
		String sentence = JOptionPane.showInputDialog("Input your sentence: ");
		//2.check sentence end of . or not
		while(sentence.endsWith(",")) {
			sentence = JOptionPane.showInputDialog("Input your sentence,agin: ");
		}
		System.out.println();
		//3.loop for check space bar
		int spacebar = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar +=1;
			}
		}
		JOptionPane.showMessageDialog(null,"This sentence has " + spacebar + " spacebar." + "\nThis sentence has " + (spacebar+1) + " word.");
		
    }
}
