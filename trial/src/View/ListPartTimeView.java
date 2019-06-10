package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controller.*;
import Model.*;

public class ListPartTimeView extends JPanel {
	ListPartTimeLecturerModel model = new ListPartTimeLecturerModel();
	//table
	private JTable j = new JTable();
	//scrollpane
	private JScrollPane sp;
	//two panels
	private JPanel modPanel;
	//tfs
	private JTextField reg,firstname,lastname,contact, email, employedDate, salary;
	private JComboBox dept;
	private JLabel jreg,jname, jtype, juser,jpass,jweb, jSalary,jdept;
	private JButton btnModify,btnDel ;

	//to get the index of the selected table row
	private int indexArray;
	public void setIndex(int i) {indexArray= i;}

	//constuctor
	public ListPartTimeView()
	{
		setBounds(0, 20, 940, 750);
		setLayout(null);
		
		ListPartTimeController c= new ListPartTimeController(this);
		c.viewLists();
		add(getPane());
		getPane().setBounds(10, 30, 900, 255);
		modifyInfoPanel();

		setVisible(true); 

		rowSelected();
		addModify(this);
		delete(this);
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
				String reg ,firstname,lastname,contact,email,employed,salary,dept;
				DefaultTableModel m = (DefaultTableModel)j.getModel();
				rowNum=j.getSelectedRow();
				reg= m.getValueAt(rowNum, 0).toString();
				dept= m.getValueAt(rowNum,1).toString();
				firstname= m.getValueAt(rowNum,2).toString();
				lastname= m.getValueAt(rowNum,3).toString();
				contact= m.getValueAt(rowNum,4).toString();
				email= m.getValueAt(rowNum,5).toString();
				employed= m.getValueAt(rowNum,6).toString();
				salary= m.getValueAt(rowNum,7).toString();
				setters(reg, firstname, lastname, contact, email, employed,salary,dept);
				setIndex(j.getSelectedRow());
			}
		});
	}

//this sets the text of text fields in  modify section when a row in the table is clicked
	public void setters(String reg, String firstname, String lastname, String contact,String email,String employed,String salary,String dept)
	{
		this.reg.setText(reg);;
		this.firstname.setText(firstname);
		this.lastname.setText(lastname);
		this.contact.setText(contact);
		this.email.setText(email);
		this.employedDate.setText(employed);
		this.salary.setText(salary);
		this.dept.setSelectedItem(dept);

	}

//modify sections
	public void modifyInfoPanel()
	{		
		modPanel= new JPanel();
		modPanel.setBackground(Color.WHITE);
		modPanel.setBounds(10, 309, 904, 376);
		add(modPanel);
		modPanel.setLayout(null);
		
		JLabel lblModifyInformation = new JLabel("MODIFY INFORMATION");
		lblModifyInformation.setForeground(new Color(255, 140, 0));
		lblModifyInformation.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblModifyInformation.setBounds(338, 10, 237, 21);
		modPanel.add(lblModifyInformation);

		reg= new JTextField();
		reg.setEditable(false);
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

		dept=new JComboBox ();
		dept.setBackground(SystemColor.text);
		dept.setModel(new DefaultComboBoxModel(new String[] {"SCIENCE", "MATH", "ART", "DANCE", "MUSIC"}));
		dept.setBounds(600, 50, 200, 30);
		modPanel.add(dept);
		
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(600, 110, 200, 30);
		modPanel.add(email);

		employedDate = new JTextField();
		employedDate.setColumns(10);
		employedDate.setBounds(600, 170, 200,30);
		modPanel.add(employedDate);

		salary = new JTextField();
		salary.setBounds(600, 240, 200, 30);
		modPanel.add(salary);

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

		jdept= new JLabel("Department");
		jdept.setBounds(470, 50, 150, 20);
		modPanel.add(jdept);
		
		jpass = new JLabel("Email");
		jpass.setBounds(470, 110, 150, 20);
		modPanel.add(jpass);

		jweb = new JLabel("Employed Date");
		jweb.setBounds(470, 170, 150, 20);
		modPanel.add(jweb);


		jSalary = new JLabel("Salary");
		jSalary.setBounds(470, 240, 150, 20);
		modPanel.add(jSalary);

		btnModify= new JButton("Modify");
		btnModify.setForeground(Color.WHITE);
		btnModify.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnModify.setBorderPainted(false);
		btnModify.setBackground(new Color(30, 144, 255));
		btnModify.setBounds(330, 320, 100, 31);
		modPanel.add(btnModify);

		btnDel = new JButton("Delete");
		btnDel.setForeground(Color.WHITE);
		btnDel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnDel.setBorderPainted(false);
		btnDel.setBackground(new Color(220, 20, 60));
		btnDel.setBounds(470, 320, 100, 31);
		modPanel.add(btnDel);	

	}
	
	//accessors for the modified information
	public int getIndex() { return indexArray;}
	public String getReg() {return reg.getText();}
	public String getfName() { return firstname.getText();}
	public String getlName() { return lastname.getText();}
	public String getContact() { return contact.getText();}
	public String getEmail() { return email.getText();}
	public String getEmp() { return employedDate.getText();}
	public String getSalary() { return salary.getText();}
	public String getDept() {return dept.getSelectedItem().toString();}
	
	public void addModify(ListPartTimeView v)
	{
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPartTimeModel n = new AddPartTimeModel();
				try {
					n.editInfo(v, getIndex());
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}		
			}
		});
	}
	
	//delete
	public void delete(ListPartTimeView v)
	{
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPartTimeModel n = new AddPartTimeModel();
					n.deleteInfo(v, getIndex());
				}
		});
	}
}
