package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Controller.AddContractController;

public class ContractLecturerView extends JFrame {
	private JTextField jtRegistration, jtFirstName,  jtLastName , jtContact, jtEmail, jtEmployedDAte,jtExpiryDate, jtMonthlyPay;
	private JButton jbAdd, jbReset,jbBack;
	private JComboBox jdept;
	
	public ContractLecturerView() {
		setBounds(100, 100, 1080, 642);
		getContentPane().setBackground(UIManager.getColor("Button.background"));
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Add Contract Lecturer");
		label.setFont(new Font("Yu Gothic Light", Font.BOLD, 30));
		label.setBounds(356, 34, 387, 50);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Registration No.");
		label_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_1.setBounds(272, 106, 136, 28);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("First Name");
		label_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_2.setBounds(272, 156, 136, 28);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Last Name");
		label_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_3.setBounds(272, 206, 136, 28);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Contact No.");
		label_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_4.setBounds(272, 256, 136, 28);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Email");
		label_5.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_5.setBounds(272, 306, 136, 28);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Date Employed");
		label_6.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_6.setBounds(272, 356, 136, 28);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Contract Expiry Date");
		label_7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_7.setBounds(272, 406, 154, 28);
		getContentPane().add(label_7);
		

		JLabel label_8 = new JLabel("Monthly Pay (\u00A3)");
		label_8.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		label_8.setBounds(272, 456, 136, 28);
		getContentPane().add(label_8);
		
		JLabel dept= new JLabel("Department");
		dept.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		dept.setBounds(272, 506, 136, 28);
		getContentPane().add(dept);
		
		
		
		jtRegistration = new JTextField();
		jtRegistration.setColumns(10);
		jtRegistration.setBounds(452, 106, 280, 28);
		getContentPane().add(jtRegistration);
		
		
		jtFirstName = new JTextField();
		jtFirstName.setColumns(10);
		jtFirstName.setBounds(452, 156, 280, 28);
		getContentPane().add(jtFirstName);
		
		jtLastName = new JTextField();
		jtLastName.setColumns(10);
		jtLastName.setBounds(452, 206, 280, 28);
		getContentPane().add(jtLastName);
		
		jtContact = new JTextField();
		jtContact.setColumns(10);
		jtContact.setBounds(452, 256, 280, 28);
		getContentPane().add(jtContact);
		
		jtEmail = new JTextField();
		jtEmail.setColumns(10);
		jtEmail.setBounds(452, 306, 280, 28);
		getContentPane().add(jtEmail);
		
		jtEmployedDAte = new JTextField();
		jtEmployedDAte.setColumns(10);
		jtEmployedDAte.setBounds(452, 356, 280, 28);
		getContentPane().add(jtEmployedDAte);
		
		jtExpiryDate = new JTextField();
		jtExpiryDate.setColumns(10);
		jtExpiryDate.setBounds(454, 406, 280, 28);
		getContentPane().add(jtExpiryDate);
		
		jtMonthlyPay = new JTextField();
		jtMonthlyPay.setColumns(10);
		jtMonthlyPay.setBounds(454, 456, 280, 28);
		getContentPane().add(jtMonthlyPay);
		
		jdept = new JComboBox();
		jdept.setBackground(SystemColor.text);
		jdept.setModel(new DefaultComboBoxModel(new String[] {"SCIENCE", "MATH", "ART", "DANCE", "MUSIC"}));
		jdept.setBounds(454, 506, 280, 28);
		add(jdept);
		
		jbAdd = new JButton("ADD");
		jbAdd.setBackground(Color.LIGHT_GRAY);
		jbAdd.setBounds(400, 550, 150, 38);
		getContentPane().add(jbAdd);
	
		jbBack = new JButton("BACK");
		jbBack.setBackground(Color.LIGHT_GRAY);
		jbBack.setBounds(600, 550, 150, 38);
		getContentPane().add(jbBack);
		
		
		AddContractController c= new AddContractController(this);
		c.addContract();
	}
	
	
	
	//accessors
			public JButton getAdd(){return jbAdd;}
			
			public JButton getReset(){return jbReset;}
			
			public JButton getBack() {return jbBack;}
			
			public JTextField getId() {return jtRegistration;}
			
			public JTextField getFirstName() {return jtFirstName;}
			
			public JTextField getLastName() {return jtLastName;}
			
			public JTextField getContact() {return jtContact;}
			
			public JTextField getEmail() {return jtEmail;}
			
			public JTextField getEmployedDate() {return jtEmployedDAte;}
			
			public JTextField getExpiryDate() {return jtExpiryDate;}
			
			public JTextField getPay() {return jtMonthlyPay;}
			
			public String getDept() {return jdept.getSelectedItem().toString();}
	}


