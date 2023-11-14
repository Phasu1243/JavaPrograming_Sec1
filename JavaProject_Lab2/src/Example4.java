import java.text.DecimalFormat;
import javax.swing.*; //import library fot input data from dialog box
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2. input data from dialogbox
		String productName = JOptionPane.showInputDialog("input product name : ");
		
		//input unit price from dialog box
		String strUnit = JOptionPane.showInputDialog("input product Unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);
		
		//input price per unit from dialog Box
		String strPrice = JOptionPane.showInputDialog("input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		
		//calculate total price
		float totalPrice = productUnit * pricePerUnit;
		
		//display data to dialog box
		float vat = totalPrice + (totalPrice*7/100);
		JOptionPane.showMessageDialog(null, "Total Price is "+frm.format(totalPrice) + " baht. "
				+ "\nAdd VAT 7%  is "+frm.format(vat) + " baht.");
		
	}

}
