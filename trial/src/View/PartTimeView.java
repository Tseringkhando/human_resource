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

import Controller.AddPartTimeController;


	public class PartTimeView  extends JFrame{
		JPanel panelWorkArea ;
		private JTextField jtRegistration, jtFirstName,  jtLastName , jtContact, jtEmail, jtEmployedDAte, jtHourlyPay;
		private JComboBox jdept;
		private JLabel lblAddPartTime, lblRegistrationNo, lblFirstName, lblLastName,  lblContactNo, lblEmail,lblDateEmployed,lblHourlyPay,lbldept;
		private JButton jbAdd,jbReset, jbBack;
		public PartTimeView()
		{
			setBackground(UIManager.getColor("Button.background"));
			setBounds(100, 100, 1080, 642);
			setLayout(null);
			
			panelWorkArea = new JPanel();
			panelWorkArea.setBackground(UIManager.getColor("Button.background"));
			panelWorkArea.setBounds(10, 10, 865, 585);
			getContentPane().add(panelWorkArea);
			panelWorkArea.setLayout(null);
			
			lblAddPartTime = new JLabel("Add Part Time Lecturer");
			lblAddPartTime.setFont(new Font("Yu Gothic Light", Font.BOLD, 30));
			lblAddPartTime.setBounds(272, 41, 387, 50);
			panelWorkArea.add(lblAddPartTime);
			
			lblRegistrationNo = new JLabel("Registration No.");
			lblRegistrationNo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			lblRegistrationNo.setBounds(177, 109, 136, 28);
			panelWorkArea.add(lblRegistrationNo);
			
			lblFirstName = new JLabel("First Name");
			lblFirstName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			lblFirstName.setBounds(177, 169, 136, 28);
			panelWorkArea.add(lblFirstName);
			
			lblLastName = new JLabel("Last Name");
			lblLastName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			lblLastName.setBounds(177, 219, 136, 28);
			panelWorkArea.add(lblLastName);
			
			lblContactNo = new JLabel("Contact No.");
			lblContactNo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			lblContactNo.setBounds(177, 269, 136, 28);
			panelWorkArea.add(lblContactNo);
			
			 lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			lblEmail.setBounds(177, 319, 136, 28);
			panelWorkArea.add(lblEmail);
			
			 lblDateEmployed = new JLabel("Date Employed");
			lblDateEmployed.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			lblDateEmployed.setBounds(177, 369, 136, 28);
			panelWorkArea.add(lblDateEmployed);
			
			 lblHourlyPay = new JLabel("Hourly Pay (\u00A3)");
			lblHourlyPay.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			lblHourlyPay.setBounds(177, 419, 136, 28);
			panelWorkArea.add(lblHourlyPay);
			
			lbldept = new JLabel("Department");
			lbldept.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			lbldept.setBounds(177, 469, 136, 28);
			panelWorkArea.add(lbldept);
			
			jtRegistration = new JTextField();
			jtRegistration.setBounds(323, 109, 280, 28);
			panelWorkArea.add(jtRegistration);
			jtRegistration.setColumns(10);
			
			jtFirstName = new JTextField();
			jtFirstName.setColumns(10);
			jtFirstName.setBounds(323, 170, 280, 28);
			panelWorkArea.add(jtFirstName);
			
			jtLastName = new JTextField();
			jtLastName.setColumns(10);
			jtLastName.setBounds(323, 220, 280, 28);
			panelWorkArea.add(jtLastName);
			
			jtContact = new JTextField();
			jtContact.setColumns(10);
			jtContact.setBounds(323, 270, 280, 28);
			panelWorkArea.add(jtContact);
			
			jtEmail = new JTextField();
			jtEmail.setColumns(10);
			jtEmail.setBounds(323, 320, 280, 28);
			panelWorkArea.add(jtEmail);
			
			jtEmployedDAte = new JTextField();
			jtEmployedDAte.setColumns(10);
			jtEmployedDAte.setBounds(323, 370, 280, 28);
			panelWorkArea.add(jtEmployedDAte);
			
			jtHourlyPay = new JTextField();
			jtHourlyPay.setColumns(10);
			jtHourlyPay.setBounds(323, 420, 280, 28);
			panelWorkArea.add(jtHourlyPay);
			
			
			jdept = new JComboBox();
			jdept.setBackground(SystemColor.text);
			jdept.setModel(new DefaultComboBoxModel(new String[] {"SCIENCE", "MATH", "ART", "DANCE", "MUSIC"}));
			jdept.setBounds(323, 470, 292, 28);
			panelWorkArea.add(jdept);
			
			jbAdd = new JButton("ADD");
			jbAdd.setBackground(Color.LIGHT_GRAY);
			jbAdd.setBounds(400, 520, 150, 38);
			panelWorkArea.add(jbAdd);
		
			jbBack = new JButton("BACK");
			jbBack.setBackground(Color.LIGHT_GRAY);
			jbBack.setBounds(600, 520, 150, 38);
			panelWorkArea.add(jbBack);
			
			AddPartTimeController c= new AddPartTimeController(this);
			c.checkPartButton();
		}
	
	
	//accessors
	public JButton getAdd(){return jbAdd;}
	
	public JButton getReset(){return jbReset;}
	
	public JButton getBack(){return jbBack;}
	
	public JTextField getId() {return jtRegistration;}
	
	public JTextField getFirstName() {return jtFirstName;}
	
	public JTextField getLastName() {return jtLastName;}
	
	public JTextField getContact() {return jtContact;}
	
	public JTextField getEmail() {return jtEmail;}
	
	public JTextField getEmployedDate() {return jtEmployedDAte;}
	
	public JTextField getPay() {return jtHourlyPay;}
	public String getDept() {return jdept.getSelectedItem().toString();}
	
}

