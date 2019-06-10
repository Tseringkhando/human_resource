package Model;
import java.io.Serializable; 
public class Users implements Serializable {
	private String username, type;
	private char[] password; 
	 
	public Users(String username, char[] password, String type) { 
		this.username = username; 
		this.password = password;
		this.type=type;
	} 
	 
	public String getUsername() {  return username; } 
	 
	public void setName(String username) {  this.username = username; } 
	 
	public char[] getPassword() {  return password; } 
	 
	public void setAddress(char[] password) {  this.password = password; } 
	
	public String getType() {return type;}
	public void setType(String type) {this.type=type;}
	
}
