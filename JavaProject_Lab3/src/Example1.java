import javax.swing. *; //input data from Dialog box
import java.text. *; //จัดรูปแบบตัวเลข
import java.text.DecimalFormat;
public class Example1 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		//รับข้อมูลทาง Dialog box แปลงข้อมูลให้เป็นเลขจำนวนเต็ม
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("HOW many customer per bill"));
		double discount,totalPrice=0;
		//calculate total price of buffet
		totalPrice = BUFFET * numberofCustomer;
		//using confirm
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null,
					"Total price is " +frm.format(totalPrice)+ " baht."+"\nDo you have a member card?");
		}while(member==JOptionPane.CANCEL_OPTION);
		
		if(member == JOptionPane.YES_OPTION) {
			//discount = totalPrice - (totalPrice*10/100);
			discount = totalPrice * 90/100 ;
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+frm.format(discount)+ "baht.");
		}//end if
		else if(member == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+frm.format(totalPrice)+ "baht.");
		}
	}
 
}
