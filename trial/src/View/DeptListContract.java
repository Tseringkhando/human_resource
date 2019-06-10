package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controller.*;
import Model.*;

public class DeptListContract extends JPanel {
	ListContractLecturerModel model = new ListContractLecturerModel();
	//table
	private JTable j = new JTable();
	//scrollpane
	private JScrollPane sp;
	//two panels
	private JPanel modPanel, delPanel;
	//tfs
	private JComboBox dept;
	private JTextField reg,firstname,lastname,contact, email, employedDate, expiry, salary;
	private JLabel jreg,jname, jtype, juser,jpass,jweb,jExpiry, jSalary;

	//to get the index of the selected table row
	private int indexArray;
	public void setIndex(int i) {indexArray= i;}

	//constuctor
	public DeptListContract()
	{
		setBounds(0, 20, 940, 750);
		setLayout(null);
		modPanel= new JPanel();
		modPanel.setBackground(Color.WHITE);
		modPanel.setBounds(10, 309, 904, 376);
		add(modPanel);
		modPanel.setLayout(null);

		ListContractController c= new ListContractController(this);
		c.details();
		add(getPane());
		getPane().setBounds(10, 30, 900, 255);
		modifyInfoPanel();
		setVisible(true); 
		rowSelected();
		
	}

	public void setScrollPane(JScrollPane js) {
		sp = js;
	}

	public void setTable(JTable t) {
		this.j = t;
	}
	public JTable getDeptTable()
	{
		return j;
	}
	public JScrollPane getPane()
	{	
		return sp;
	}

	public void rowSelected()
	{
		//getting current table 
		j.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				int rowNum;
				// getting all values from selected row, store them and send those values to fill the form
				String reg ,firstname,lastname,contact,email,employed,expiry,salary,dname;
				DefaultTableModel m = (DefaultTableModel)j.getModel();
				rowNum=j.getSelectedRow();
				reg= m.getValueAt(rowNum, 0).toString();
				dname= m.getValueAt(rowNum,1).toString();
				firstname= m.getValueAt(rowNum,2).toString();
				lastname= m.getValueAt(rowNum,3).toString();
				contact= m.getValueAt(rowNum,4).toString();
				email= m.getValueAt(rowNum,5).toString();
				employed= m.getValueAt(rowNum,6).toString();
				expiry= m.getValueAt(rowNum,7).toString();
				salary= m.getValueAt(rowNum,8).toString();
				setters(reg, firstname, lastname, contact, email, employed,expiry,salary,dname);
				setIndex(j.getSelectedRow());
			}
		});
	}

//this sets the text of text fields in  modify section when a row in the table is clicked
	public void setters(String reg, String firstname, String lastname, String contact,String email,String employed,String expiry,String salary,String dept)
	{
		this.reg.setText(reg);;
		this.firstname.setText(firstname);
		this.lastname.setText(lastname);
		this.contact.setText(contact);
		this.email.setText(email);
		this.employedDate.setText(employed);
		this.expiry.setText(expiry);
		this.salary.setText(salary);
		this.dept.setSelectedItem(dept);

	}

//modify sections
	public void modifyInfoPanel()
	{		
		JLabel lblModifyInformation = new JLabel("DETAILS");
		lblModifyInformation.setForeground(new Color(255, 140, 0));
		lblModifyInformation.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblModifyInformation.setBounds(338, 10, 237, 21);
		modPanel.add(lblModifyInformation);

		reg= new JTextField();
		reg.setForeground(new Color(0, 0, 128));
		reg.setBounds(200, 50, 200, 30);
		modPanel.add(reg);

		firstname = new JTextField();
		firstname.setForeground(new Color(0, 0, 128));
		firstname.setBounds(200, 110, 200, 30);
		modPanel.add(firstname);
		firstname.setColumns(10);

		lastname = new JTextField();
		lastname.setForeground(new Color(0, 0, 128));
		lastname.setBounds(200, 170, 200, 30);
		modPanel.add(lastname);
		lastname.setColumns(10);

		contact = new JTextField();
		contact.setForeground(new Color(0, 0, 128));
		contact.setBounds(200, 240, 200, 30);
		modPanel.add(contact);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(600, 110, 200, 30);
		modPanel.add(email);

		employedDate = new JTextField();
		employedDate.setColumns(10);
		employedDate.setBounds(600, 170, 200,30);
		modPanel.add(employedDate);

		expiry = new JTextField();
		expiry.setColumns(10);
		expiry.setBounds(600, 240, 200, 30);
		modPanel.add(expiry);

		salary = new JTextField();
		salary.setBounds(600, 50, 200, 30);
		modPanel.add(salary);
		
		JLabel jdept= new JLabel("Department");
		jdept.setBounds(470, 290, 150, 20);
		modPanel.add(jdept);
		
		dept=new JComboBox ();
		dept.setBackground(SystemColor.text);
		dept.setModel(new DefaultComboBoxModel(new String[] {"SCIENCE", "MATH", "ART", "DANCE", "MUSIC"}));
		dept.setBounds(600, 290, 200, 30);
		modPanel.add(dept);
		
		jreg= new JLabel("Registration Id");
		jreg.setBounds(70, 50, 150, 20);
		modPanel.add(jreg);

		jname = new JLabel("First Name");
		jname.setBounds(70, 110, 150, 20);
		modPanel.add(jname);

		jtype = new JLabel("Last Name");
		jtype.setBounds(70, 170, 150, 20);
		modPanel.add(jtype);

		juser = new JLabel("Contact");
		juser.setBounds(70, 240, 150, 20);
		modPanel.add(juser);

		jpass = new JLabel("Email");
		jpass.setBounds(470, 110, 150, 20);
		modPanel.add(jpass);

		jweb = new JLabel("Employed Date");
		jweb.setBounds(470, 170, 150, 20);
		modPanel.add(jweb);


		jExpiry= new JLabel("Expiry Date");
		jExpiry.setBounds(470, 240, 150, 20);
		modPanel.add(jExpiry);

		jSalary = new JLabel("Salary");
		jSalary.setBounds(470, 50, 150, 20);
		modPanel.add(jSalary);
		
		reg.setEditable(false);
		firstname.setEditable(false);
		lastname.setEditable(false);
		contact.setEditable(false);
		email.setEditable(false);
		salary.setEditable(false);
		employedDate.setEditable(false);
		expiry.setEditable(false);
		

	}
	


}
