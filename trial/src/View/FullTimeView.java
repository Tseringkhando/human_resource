package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controller.AddFullTimeController;

public class FullTimeView extends JFrame{
	
	private JTextField jtRegistration, jtFirstName,  jtLastName , jtContact, jtEmail, jtEmployedDAte, jtMonthlyPay;
	JComboBox jdept;
	JButton jbAdd, jbReset, jbBack;
	public FullTimeView() {
		setBounds(100, 100, 1080, 642);
		getContentPane().setBackground(UIManager.getColor("Button.background"));
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Add Full Time Lecturer");
		label.setFont(new Font("Yu Gothic Light", Font.BOLD, 30));
		label.setBounds(363, 46, 387, 50);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Registration No.");
		label_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_1.setBounds(277, 134, 136, 28);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("First Name");
		label_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_2.setBounds(277, 194, 136, 28);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Last Name");
		label_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_3.setBounds(277, 244, 136, 28);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Contact No.");
		label_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_4.setBounds(277, 294, 136, 28);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Email");
		label_5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_5.setBounds(277, 344, 136, 28);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Date Employed");
		label_6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_6.setBounds(277, 394, 136, 28);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Monthly Pay (\u00A3)");
		label_7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_7.setBounds(277, 444, 136, 28);
		getContentPane().add(label_7);
		
		JLabel dept = new JLabel("Department");
		dept.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		dept.setBounds(277, 494, 136, 28);
		getContentPane().add(dept);
		
		
		jtRegistration = new JTextField();
		jtRegistration.setColumns(10);
		jtRegistration.setBounds(467, 133, 280, 28);
		getContentPane().add(jtRegistration);
		
		jtFirstName = new JTextField();
		jtFirstName.setColumns(10);
		jtFirstName.setBounds(467, 194, 280, 28);
		getContentPane().add(jtFirstName);
		
		jtLastName = new JTextField();
		jtLastName.setColumns(10);
		jtLastName.setBounds(467, 244, 280, 28);
		getContentPane().add(jtLastName);
		
		jtContact = new JTextField();
		jtContact.setColumns(10);
		jtContact.setBounds(467, 294, 280, 28);
		getContentPane().add(jtContact);
		
		jtEmail = new JTextField();
		jtEmail.setColumns(10);
		jtEmail.setBounds(467, 344, 280, 28);
		getContentPane().add(jtEmail);
		
		jtEmployedDAte = new JTextField();
		jtEmployedDAte.setColumns(10);
		jtEmployedDAte.setBounds(467, 394, 280, 28);
		getContentPane().add(jtEmployedDAte);
		
		jtMonthlyPay = new JTextField();
		jtMonthlyPay.setColumns(10);
		jtMonthlyPay.setBounds(467, 444, 280, 28);
		getContentPane().add(jtMonthlyPay);
		
		jdept = new JComboBox();
		jdept.setBackground(SystemColor.text);
		jdept.setModel(new DefaultComboBoxModel(new String[] {"SCIENCE", "MATH", "ART", "DANCE", "MUSIC"}));
		jdept.setBounds(467, 494, 292, 28);
		add(jdept);
		
		
		jbAdd = new JButton("ADD");
		jbAdd.setBackground(Color.LIGHT_GRAY);
		jbAdd.setBounds(400, 550, 150, 38);
		getContentPane().add(jbAdd);
	
		jbBack = new JButton("BACK");
		jbBack.setBackground(Color.LIGHT_GRAY);
		jbBack.setBounds(600, 550, 150, 38);
		getContentPane().add(jbBack);
		
		AddFullTimeController c= new AddFullTimeController(this);
		c.addFullTime();
	
	}
	
	//
	
	//accessors
		public JButton getAdd(){return jbAdd;}

		
		public JButton getBack(){return jbBack;}
		
		public JTextField getId() {return jtRegistration;}
		
		public JTextField getFirstName() {return jtFirstName;}
		
		public JTextField getLastName() {return jtLastName;}
		
		public JTextField getContact() {return jtContact;}
		
		public JTextField getEmail() {return jtEmail;}
		
		public JTextField getEmployedDate() {return jtEmployedDAte;}
		
		public JTextField getPay() {return jtMonthlyPay;}
		
		public String getDept() {return jdept.getSelectedItem().toString();}
}
