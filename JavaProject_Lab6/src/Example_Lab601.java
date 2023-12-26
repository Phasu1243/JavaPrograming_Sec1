import javax.swing.*;
public class Example_Lab601 {

	public static void main(String[] args) {
		 inputEmail();
		 
	}//ends of method	
	public static void inputEmail( ) {	
		//1.input email from dialog box
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		//2.ส่งตัวแปร inputEmail ไปยังเมธอด checkEmail และ return
		while(inputEmail.startsWith("@")||inputEmail.startsWith("")) {
			 inputEmail = JOptionPane.showInputDialog("Input your e-mail,agin :");
	}
		//3.ส่งตัวแปร inputEmail ไปยังเมธอด checkEmail และ return ค่ากลับ
		boolean validataEmail = checkEmail(inputEmail);
		if(validataEmail == true) {
			JOptionPane.showMessageDialog(null,"Your e-mail is " + inputEmail.toLowerCase());
	}	
	else {
		JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail.com dot com");
	}
 }//ends of main() method	
	
     public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return false;
		}
		else return false;
	}
  }
