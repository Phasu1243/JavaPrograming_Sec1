import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = {78,36,58,41,25,92,75};
		System.out.print("Input index of Array : ");
		int inputnumber = scan.nextInt();
		while(inputnumber<0||inputnumber>=number.length) {
			System.out.print("Input index of Array, again : ");
			inputnumber = scan.nextInt();
		}
		System.out.println();
		System.out.println("value is current index is " + number[inputnumber]);
		if(inputnumber==(number.length-1)) {
			System.out.println("Sorry, "+inputnumber+" is the last index in array.");
		}else System.out.println("Value in next    index is "+number[inputnumber+1]);
	}
}
