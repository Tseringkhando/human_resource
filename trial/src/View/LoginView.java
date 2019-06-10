
package View;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.*;

public class LoginView extends JFrame {
	ImageIcon icon = new ImageIcon("icon/i.png");
	private JPanel jp1,jp2;
	private JLabel jlTitle, jlSide, jlUsername, jlPassword;
	private JButton jbLogin;
	private JTextField jtUsername;
	private JPasswordField jtPassword;
	private JComboBox comboBox;

	public LoginView() {
		setTitle("Login- NMC");
		setIconImage(icon.getImage());
		setResizable(false);
		setLocationRelativeTo(null);
		setBackground(new Color(255, 99, 71));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 546);
		getContentPane().setBackground(new Color(255, 99, 71));
		
		setLayout(null);
		
		jp1 = new JPanel();
		jp1.setBackground(new Color(0, 0, 0));
		jp1.setBounds(0, 0, 826, 105);
		getContentPane().add(jp1);
		jp1.setLayout(null);
		
		jlTitle = new JLabel("NORTHAMPTON METROPOLITAN UNIVERSITY");
		jlTitle.setForeground(new Color(240, 248, 255));
		jlTitle.setFont(new Font("FZLanTingHeiS-UL-GB", Font.BOLD, 30));
		jlTitle.setBounds(10, 10, 806, 85);
		jp1.add(jlTitle);
		
		jp2 = new JPanel();
		jp2.setBackground(new Color(211, 211, 211));
		jp2.setBounds(440, 128, 366, 355);
		getContentPane().add(jp2);
		jp2.setLayout(null);
		
		jlUsername = new JLabel("USERNAME");
		jlUsername.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		jlUsername.setBounds(10, 87, 152, 21);
		jp2.add(jlUsername);
		
		jtUsername = new JTextField();
		jtUsername.setBounds(10, 118, 319, 30);
		jp2.add(jtUsername);
		jtUsername.setColumns(10);
		
		jlPassword = new JLabel("PASSWORD");
		jlPassword.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		jlPassword.setBounds(10, 179, 152, 21);
		jp2.add(jlPassword);
		
		jtPassword = new JPasswordField();
		jtPassword.setBounds(10, 210, 319, 30);
		jp2.add(jtPassword);
		
		jbLogin = new JButton("LOG IN");
		jbLogin.setBackground(Color.WHITE);
		jbLogin.setFont(new Font("Segoe UI Light", Font.PLAIN, 19));
		jbLogin.setBounds(209, 279, 120, 35);
		jp2.add(jbLogin);
		
		jlSide = new JLabel("Log in to continue");
		jlSide.setFont(new Font("Segoe UI Light", Font.PLAIN, 50));
		jlSide.setBounds(10, 241, 420, 90);
		getContentPane().add(jlSide);
		
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Human Resource", "Department Secretary"}));
		comboBox.setBounds(10, 279, 138, 21);
		jp2.add(comboBox);
		setVisible(true);
	}
	
	//getter and setter methods to return entered username and password from the textfields
	
	//gives username
	public String getUsername() {
		return jtUsername.getText();
	}
	
	//gives password
	public char[] getUserPassword() {
		return jtPassword.getPassword();
	}
	
	//adding button functionality
	public void loginUser(ActionListener a) {
		jbLogin.addActionListener(a);
	}
	
	public JComboBox getUserType() {
		return comboBox;
	}

	
}
