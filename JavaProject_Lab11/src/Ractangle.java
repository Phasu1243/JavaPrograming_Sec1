
public class Ractangle extends shape {
	
	private double width;
	private double length;
	
	Ractangle(double width,double length,String color){
		this.width = width;
		this.length = length;

	}
	@Override
	public double getArea() {//method getArea() --> abstract method from super class
		return this.width * this.length;
	}
	@Override
	public String toString() {
		return "Rectangle[width= "+this.width+ ",length= "+this.length+","+super.toString()+"]";
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}

}
