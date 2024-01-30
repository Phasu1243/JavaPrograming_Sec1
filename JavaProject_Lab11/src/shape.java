
public abstract class shape {
 private String color;
 
  shape(String color){
	  this.color = color ;
  }
  
  shape(){
	  this.color = "";
  }
  
  //abstract method
  public abstract double getArea();
  
  public String toString() {
	  return "Color= " + this.color ;
  }
}
