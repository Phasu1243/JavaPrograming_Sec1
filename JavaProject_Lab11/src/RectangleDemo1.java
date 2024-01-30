import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		//Input all data from dialog box
	/*	double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		//send 3-argument to constructor
		Ractangle obj1 = new Ractangle(widthInput,lengthInput,colorInput);
		
		//show the width, length,and color
		JOptionPane.showMessageDialog(null, obj1.toString()+"\nArea of Rantangle = "+ obj1.getArea());   */
       
		//Input data using interface class
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		Ractangle2 obj2 = new Ractangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2.toString()+"\nArea of Rantangle = "+ obj2.getArea()); 
	}

}
