package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import Controller.ListDepartmentController;
import Model.AddDepartmentModel;
import Model.ListDepartmentModel;

public class ListDepartmentView extends JPanel {
	JTable j = new JTable();
	JScrollPane sp;
	ListDepartmentModel model = new ListDepartmentModel();

	private JPanel modPanel, delPanel;
	JTextField name, username, password,web,reg;
	JComboBox type;
	JLabel jname, jtype, juser,jpass,jweb,jreg;
	JButton btnModify,btnDel ;
	private int indexArray;
	public void setIndex(int i) {
		indexArray= i;
	}
	public void setters(String reg, String n, String t, String u, String p, String w)
	{
		this.reg.setText(reg);;
		this.name.setText(n);
		this.type.setSelectedItem(t);
		this.username.setText(u);
		this.password.setText(p);
		this.web.setText(w);
	}

	public ListDepartmentView()
	{
		setBounds(0, 20, 940, 750);
		setLayout(null);		      
		ListDepartmentController c= new ListDepartmentController(this);
		c.viewLists();
		add(getPane());
		getPane().setBounds(10, 30, 900, 255);
		//modify section
		modifyInfoPanel();
		//delete the information section
		delInfoPanel();
		rowSelected();
		setVisible(true); 
		addModify(this);
		deleteD(this);
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
				String reg ,name,type,webAdd,username,password;
				DefaultTableModel m = (DefaultTableModel)j.getModel();
				rowNum=j.getSelectedRow();
				reg= m.getValueAt(rowNum, 0).toString();
				name= m.getValueAt(rowNum,1).toString();
				type= m.getValueAt(rowNum,2).toString();
				username= m.getValueAt(rowNum,3).toString();
				password= m.getValueAt(rowNum,5).toString();
				webAdd= m.getValueAt(rowNum,4).toString();
				setters(reg, name, type, username, password, webAdd);
				setIndex(j.getSelectedRow());
			}
		});


	}


	//details view panel

	public void modifyInfoPanel()
	{	
		modPanel= new JPanel();
		modPanel.setBackground(Color.WHITE);
		modPanel.setBounds(10, 309, 457, 350);
		add(modPanel);
		modPanel.setLayout(null);

		name = new JTextField();
		name.setForeground(new Color(0, 0, 128));
		name.setBounds(270, 50, 150, 30);
		modPanel.add(name);
		name.setColumns(10);

		type =  new JComboBox();
		type.setBackground(SystemColor.text);
		type.setModel(new DefaultComboBoxModel(new String[] {"SCIENCE", "MATH", "ART", "DANCE", "MUSIC"}));
		type.setBounds(270, 100, 150, 30);
		modPanel.add(type);

		username = new JTextField();
		username.setColumns(10);
		username.setBounds(270, 150, 150, 30);
		modPanel.add(username);

		password = new JTextField();
		password.setColumns(10);
		password.setBounds(270, 200, 150, 30);
		modPanel.add(password);

		web = new JTextField();
		web.setColumns(10);
		web.setBounds(270, 250, 150, 30);
		modPanel.add(web);


		jname = new JLabel("Department Name");
		jname.setBounds(90, 50, 150,30);
		modPanel.add(jname);

		jtype = new JLabel("Type");
		jtype.setBounds(90, 100, 150,30);
		modPanel.add(jtype);

		juser = new JLabel("Username");
		juser.setBounds(90, 150, 150, 30);
		modPanel.add(juser);

		jpass = new JLabel("Password");
		jpass.setBounds(90, 200, 150, 30);
		modPanel.add(jpass);

		jweb = new JLabel("Web Address");
		jweb.setBounds(90, 250, 150, 30);
		modPanel.add(jweb);

		JLabel lblModifyInformation = new JLabel("MODIFY INFORMATION");
		lblModifyInformation.setForeground(new Color(255, 140, 0));
		lblModifyInformation.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblModifyInformation.setBounds(120, 10, 237, 21);
		modPanel.add(lblModifyInformation);


		btnModify= new JButton("Modify");
		btnModify.setBounds(272, 300, 100, 35);
		btnModify.setForeground(Color.WHITE);
		btnModify.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnModify.setBorderPainted(false);
		btnModify.setBackground(new Color(30, 144, 255));
		modPanel.add(btnModify);

	}
	//delete panel
	public void delInfoPanel()
	{
		delPanel = new JPanel();
		delPanel.setBackground(Color.WHITE);
		delPanel.setBounds(500, 309, 414, 171);
		add(delPanel);
		delPanel.setLayout(null);

		btnDel = new JButton("Delete");
		btnDel.setBounds(246, 121, 100,35);
		btnDel.setForeground(Color.WHITE);
		btnDel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		btnDel.setBorderPainted(false);
		btnDel.setBackground(new Color(220, 20, 60));
		delPanel.add(btnDel);

		JLabel label_3 = new JLabel("DELETE INFORMATION");
		label_3.setForeground(new Color(255, 140, 0));
		label_3.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		label_3.setBounds(75, 10, 237, 21);
		delPanel.add(label_3);

		reg = new JTextField();
		reg.setEditable(false);
		reg.setBounds(175, 54, 171, 38);
		delPanel.add(reg);
		reg.setColumns(10);

		JLabel lblRegistration = new JLabel("REGISTRATION ID");
		lblRegistration.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegistration.setBounds(25, 57, 140, 26);
		delPanel.add(lblRegistration);
	}


	//accessors for the modified information
	public int getIndex() { return indexArray;}
	public String getReg() {return reg.getText();}
	public String getName() { return name.getText();}
	public String getUser() { return username.getText();}
	public String getPassword() { return password.getText();}
	public String getType() { return type.getSelectedItem().toString();}
	public String getWeb() { return web.getText();}

	public void addModify(ListDepartmentView v)
	{
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDepartmentModel n = new AddDepartmentModel();
				try {
					n.editDepartment(v, getIndex());
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	//delete
	public void deleteD(ListDepartmentView v)
	{
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDepartmentModel n = new AddDepartmentModel();
				n.deleteDept(v, getIndex());
			}
		});
	}
}
