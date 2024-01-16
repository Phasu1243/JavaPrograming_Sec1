
public class Date {
	//The private attribute
	private int year;
	private int month;
	private int day;
	
	//Constructor with parameter
	Date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	public int getyear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	//toString() method
	public String toString() {
		//buit-in function String.format() to form a formatted string
		//specifier "0" to print leading zeros
		return String.format("%02d/%02d/%4d", month, day , year);
	}
	
	public void setData(int year ,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	

}
