package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import Controller.AddDepartmentController;

public class AddDepartmentView extends JPanel {
	private JLabel jlDeptID,jlAddNewDepartment, jlDepartmentName, jlDepartmentType, jlUsername, jlPassword, jlWebAddress;
	private JTextField jtDeptID, jtDepartmentName, jtUsername, jtPassword, jtWebAddress;
	private JComboBox jcDepartmentType;
	private JButton jbAdd, jbReset;
	
	public AddDepartmentView()
	{
		setBackground(UIManager.getColor("Button.background"));
		setBounds(0, 20, 940, 750);
		
		setLayout(null);
				
		jlAddNewDepartment = new JLabel("Add New Department");
		jlAddNewDepartment.setFont(new Font("Yu Gothic Light", Font.BOLD, 30));
		jlAddNewDepartment.setBounds(289, 10, 387, 50);
		add(jlAddNewDepartment);
		
		jlDeptID = new JLabel("Department ID");
		jlDeptID.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		jlDeptID.setBounds(115, 60, 136, 28);
		add(jlDeptID);
		
		jtDeptID = new JTextField();
		jtDeptID.setBounds(334, 60, 400, 28);
		add(jtDeptID);
		jtDeptID.setColumns(10);
		
		
		jlDepartmentName = new JLabel("Department Name");
		jlDepartmentName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		jlDepartmentName.setBounds(115, 114, 136, 28);
		add(jlDepartmentName);
		
		jtDepartmentName = new JTextField();
		jtDepartmentName.setBounds(334, 113, 400, 28);
		add(jtDepartmentName);
		jtDepartmentName.setColumns(10);
		
		jlDepartmentType = new JLabel("Department Type");
		jlDepartmentType.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		jlDepartmentType.setBounds(113, 181, 136, 28);
		add(jlDepartmentType);
		
		jcDepartmentType = new JComboBox();
		jcDepartmentType.setBackground(SystemColor.text);
		jcDepartmentType.setModel(new DefaultComboBoxModel(new String[] {"SCIENCE", "MATH", "ART", "DANCE", "MUSIC"}));
		jcDepartmentType.setBounds(334, 181, 292, 28);
		add(jcDepartmentType);
		
		jlUsername = new JLabel("Username");
		jlUsername.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		jlUsername.setBounds(113, 241, 136, 28);
		add(jlUsername);
		
		jtUsername = new JTextField();
		jtUsername.setColumns(10);
		jtUsername.setBounds(334, 240, 400, 28);
		add(jtUsername);
		
		jlPassword = new JLabel("Password");
		jlPassword.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		jlPassword.setBounds(113, 306, 136, 28);
		add(jlPassword);
					
		jtPassword = new JTextField();
		jtPassword.setColumns(10);
		jtPassword.setBounds(334, 305, 400, 28);
		add(jtPassword);
		
		jlWebAddress = new JLabel("Web Address");
		jlWebAddress.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		jlWebAddress.setBounds(113, 370, 136, 28);
		add(jlWebAddress);
					
		jtWebAddress = new JTextField();
		jtWebAddress.setColumns(10);
		jtWebAddress.setBounds(334, 370, 400, 28);
		add(jtWebAddress);
		
		jbAdd = new JButton("ADD");
		jbAdd.setBackground(new Color(192, 192, 192));
		jbAdd.setBounds(369, 550, 103, 34);
		add(jbAdd);
		
		jbReset = new JButton("RESET");
		jbReset.setBackground(Color.LIGHT_GRAY);
		jbReset.setBounds(515, 550, 103, 34);
		add(jbReset);
		
		setVisible(true);
		AddDepartmentController deptControl = new AddDepartmentController(this);
		deptControl.deptCheckButton();
		
	}
	
	public void deptAddBtn(ActionListener a)
	{
		jbAdd.addActionListener(a);
	}
	

	public JButton getResetButton() {return jbReset;}

	//accessors 
//	public String getDeptID()
//	{
//		return jtDeptID.getText();
//	}
//	
//	public String getDeptName() {
//		return jtDepartmentName.getText();
//	}
//	
//	public String getDeptType() 
//	{
//		return jcDepartmentType.getActionCommand();
//	}
//	
//	public String getUserName() 
//	{
//		return jtUsername.getText();
//	}
//	
//	
//	public char[] getPassword() 
//	{
//		return (jtPassword.getText()).toCharArray();
//	}
//	
//	public String getWebAdd() 
//	{
//		return jtWebAddress.getText();
//	}
//	
	//
	
	public JTextField getDeptID()
	{
		return jtDeptID;
	}
	
	public JTextField getDeptName() {
		return jtDepartmentName;
	}
	
	public JComboBox getDeptType() 
	{
		return jcDepartmentType;
	}
	
	public JTextField getUserName() 
	{
		return jtUsername;
	}
	
	
	public JTextField getPassword() 
	{
		return jtPassword;
	}
	public JTextField getWebAdd() 
	{
		return jtWebAddress;
	}
	
	
	
	
}
