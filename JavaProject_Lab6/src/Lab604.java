import java.util.Scanner;
public class Lab604 {
    static Scanner input = new Scanner(System.in);
    static String studenId,subId;
	static int subjectId;
    boolean stdIT,subIT;
	public static void main(String[] args) {
		inputStudent();

	}//end of main()
    
	public static void inputStudent() {
		do {
		System.out.print("Enter Student Id : ");
		studenId = input.next();
		System.out.print("Enter Student Id : ");
		subjectId = input.nextInt();
		subId = subjectId + " ";//convert subjectID integer to string
		}while(!isLength(studenId,subId));
		System.out.println();
		displayData(isITStudent(studenId),isITSubject(subId));
	}//end of inputStudent
	
	public static boolean isLength(String sid, String subId ) {
		if(sid.length()==10 && subId.length()==7) {
			return true;
	}
		return false;
  }//end of isLength
	
	public static boolean isITStudent(String sid) {
		if(sid.substring(0,3).equals("221")&&sid.substring(3,6).equals("311")) {
			return true;
		}
		else return false;
	}//end of isITStudent
	
	
	public static boolean isITSubject(String subId) {
		if(subId.substring(0,2).equals("21")&&subId.substring(4,5).equals("1")) {
			return true;
		}
		else return false;
	}//end of isITSubject
	
	public static void displayData (boolean stdIT ,boolean subIT ) {
		if(stdIT==true) {
			System.out.println("student id: "+ studenId + "1st year student in IT");
	    } else {
	    	System.out.println("student id: "+ studenId + "is not 1st year student in IT");
	    }  
		if(subIT==true) {
			System.out.print("Enroll in corse for Year 1");
		}else {
			System.out.print("not Enroll in corse for Year 1");
		}
  }
}