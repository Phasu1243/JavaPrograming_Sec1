public class Ractangle2 implements Shape2{
	
	private double width,length;
	
	Ractangle2(double width,double length){
		this.width = width;
		this.length = length;
	}
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	public double getwidth() {
		return this.width;
	}
	public double getlength() {
		return this.length;
	}
	public String toString() {
		return "Ractangle[width = "+this.width+" ,length = "+this.length+"]";
	}

}
