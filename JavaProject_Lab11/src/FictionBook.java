import java.time.Year;
import java.time.Year.*;
public class FictionBook implements Author,Book{
	private String author_name ;
	private String email ;
	private String title ;
	private int publicYear ;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
	    this.author_name = name;
	}
	public void setEmail(String email) {
		this.email =email;
	}
	public boolean checkFormatName() {
		int space = this.author_name.trim().indexOf(" ");
		if(space == 1) 
			return false;
		else
			return true;
	}
	@Override
	public String getTitle() {
		
		return this.title;
	}
	@Override
	public int totalPublicYear() {
		return Year.now().getValue()-publicYear;
	}
	@Override
	public String getLastName() {
		int space = this.author_name.trim().indexOf(" ");
		return this.author_name.substring(space+1).toUpperCase();
	}
	@Override
	public String getFristName() {
		int space = this.author_name.trim().indexOf(" ");
		return this.author_name.substring(0,space).toUpperCase();
	}
	@Override
	public boolean checkEmail() {
		this.email = email.toLowerCase();
				if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
					return true;
				}
				else return false;
	}
	public String toString() {
		return title +" write by "+ getLastName().substring(0,1)+"."+getFristName()+"("+email+")"+"\nPublshed for "+totalPublicYear()+" years" ;
	}
	

}
