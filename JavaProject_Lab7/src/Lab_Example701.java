
public class Lab_Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i=0;i<nums.length;i++) {
			System.out.println("num["+1+"]="+nums[i]);
		}
        System.out.println("using foreach to display value of array ");
        //using foreach
        int j=0;
        for(int _nums:nums) {
        	System.out.print("num["+j+"]="+nums);
        	j++;
        }
        printArrayNumber(nums); //method not return value
	}//end of main
    
	public static void printArrayNumber(int[] number) {
	System.out.println("using medhod to display value of array ");	
	for(int i=0;i<number.length;i++) {
		System.out.println("num["+1+"]="+number[i]);
	}
  }//end of printArrayNumber
	
	
}	
