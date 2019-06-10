package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

//the department class
public class Departments  implements Serializable{
	private static final long serialVersionUID = 1L;
	String deptID, deptName, deptType, deptUsername, deptWeb;
	char[]  deptPassword;

	ArrayList<Departments> d = new ArrayList<Departments>();
	public Departments(String deptID, String deptName, String deptType, String deptUsername, char[] deptPassword, String deptWeb)
	{
		this.deptID= deptID;
		this.deptName= deptName;
		this.deptType = deptType;
		this.deptUsername= deptUsername;
		this.deptPassword= deptPassword;
		this.deptWeb= deptWeb;
	}
	public Departments() {}
	public String getDeptID()
	{
		return deptID;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public String getDeptType() 
	{
		return deptType;
	}
	
	public String getUserName() 
	{
		return deptUsername;
	}
	
	
	public char[] getPassword() 
	{
		return deptPassword;
	}
	
	public String getWebAdd() 
	{
		return deptWeb;
	}
	
	public void setuser(String n)
	{
		this.deptName=n;
	}


	
}
