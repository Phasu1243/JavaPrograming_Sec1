import javax.swing.*;
public class Lab_Example702_1 {

	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	static double itemPrice = 0.0; //get price
	static boolean validItem = false; //check found or not
	
	public static void main(String[] args) {
		
		inputItem();

	}//end of method
	
	public static void inputItem() {
		int itemOder = Integer.parseInt(JOptionPane.showInputDialog("" + "Enter item number to order"));
		//display data
		if(checkItem(itemOder)) {
			System.out.print("Item " + itemOder +" is " + itemPrice);
		}
		else {
			System.out.print("Invalid Item");
        }
    }//end of inputItem()
	
	public static boolean checkItem(int item) {
		//for of search data
		for(int i=0;i<validValues.length;i++) {
			if(item == validValues[1]) { // ถ้าข้อมูลที่กรอกเท่ากับค่าใน array validValues[i]
				validItem = true; // ให้ validItem = true
				itemPrice = price[i]; //itemPrice = ราคาสินค้าใน array price[1]
			}
		}// end of for	
		return validItem;
	}//end of checkItem
}