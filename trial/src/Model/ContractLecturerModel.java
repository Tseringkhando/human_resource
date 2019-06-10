package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ContractLecturerModel implements Serializable {
	private String regId,firstname,lastname, contact, email, employedDate, expiry, type,dept;
	private double monthlyPay;

	public ContractLecturerModel(String regId, String firstname, String lastname, String contact, String email, String employedDate, String expiry, double monthlyPay, String type,String dept)
	{
		this.regId=regId;
		this.firstname=firstname;
		this.lastname= lastname;
		this.contact=contact;
		this.email= email;
		this.employedDate=employedDate;
		this.monthlyPay= monthlyPay;
		this.expiry = expiry;
		this.type= type;
		this.dept=dept;
	}


	public ContractLecturerModel() {}



	//accessorss
	public String getId() { return regId;}

	public String getFirstName() { return firstname;}

	public String getLastName() { return lastname;}

	public String getContact() { return contact;}

	public String getEmail() { return email;}

	public String getEmpDate() { return employedDate;}

	public double getmonthlyPay() {return monthlyPay;}
	
	public String getExpiry() {return expiry;}
	
	public String getType() {return type;}

	public String getDpmnt() {return dept;}

	//writing the object to the file

	

}
