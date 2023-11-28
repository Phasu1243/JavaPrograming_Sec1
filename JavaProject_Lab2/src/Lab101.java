import java.text.DecimalFormat;
public class Lab101 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("input product Name : ");
		String productName = input.nextLine();
		System.out.print("input product Unit : ");
		int productUnit = input.nextInt();
		System.out.print("input price per Unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println("-----------------------------------");
		double totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is : "+frm.format(totalPrice) + " baht.");
		System.out.println("-----------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		System.out.println("-----------------------------------");
		double amountToPay  = totalPrice * (discount / 100.0);
		double totaldiscount = totalPrice - amountToPay;
		System.out.println("Discount from 15%       "+frm.format(amountToPay) + " baht.");
		System.out.println("Amount to be paid       "+frm.format(totaldiscount) + " baht.");

	}

}
