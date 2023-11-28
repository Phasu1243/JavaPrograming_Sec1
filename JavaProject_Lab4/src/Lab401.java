import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberX,numberY ;
		System.out.print("Input value of X : ");
		numberX= scan.nextInt();
		int sum = numberX;
		System.out.print("Input value of Y : ");
		numberY= scan.nextInt();
		while(numberY<numberX) {
			System.out.print("Input value of Y, again : ");
			numberY= scan.nextInt();
		}
		System.out.println();
		while(numberX<numberY) {
			numberX++;
		    int total = sum+numberX;
		System.out.println(sum+"+"+numberX+" = "+total);
		 sum=total;
		}
		

	}

}
