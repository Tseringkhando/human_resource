package Model;

import java.io.Serializable;

public class PartTimeLecturerModel implements Serializable{
	private String regId,firstname,lastname, contact, email, employedDate, type,dept;
	private double hourlyPay;

	public PartTimeLecturerModel(String regId, String firstname, String lastname, String contact, String email, String employedDate,double hourlyPay, String type, String dept)
	{
		this.regId=regId;
		this.firstname=firstname;
		this.lastname= lastname;
		this.contact=contact;
		this.email= email;
		this.employedDate=employedDate;
		this.hourlyPay= hourlyPay;
		this.type= type;
		this.dept=dept;
	}

	public PartTimeLecturerModel() {
		// TODO Auto-generated constructor stub
	}

	//accessors
	public String getId() { return regId;}

	public String getFirstName() { return firstname;}

	public String getLastName() { return lastname;}

	public String getContact() { return contact;}

	public String getEmail() { return email;}

	public String getEmpDate() { return employedDate;}

	public double getHourlyPay() {return hourlyPay;}
	
	public String getType() {return type;}
	public String getDpmnt() {return dept;}
}
