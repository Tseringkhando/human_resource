package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Controller.AddLecturerController;

public class AddLecturerView extends JPanel{
	
	//variables used 
	private JLabel jlType;
	private JButton btnPartTimeLecturer, btnFullTimeLecturer, btnContractLecturer;
	
	
	//default constructor
	public AddLecturerView() {
		//properties of the panel
		setBackground(UIManager.getColor("Button.background"));
		setBounds(0, 20, 940, 750);
		setLayout(null);
		
	
		//the title of the panel
		jlType = new JLabel("Choose the type of lecturer");
		jlType.setFont(new Font("Yu Gothic Light", Font.BOLD, 30));
		jlType.setBounds(241, 54, 392, 61);
		add(jlType);
		
		//button to add part time lecturer
		btnPartTimeLecturer = new JButton("Part Time Lecturer");
		btnPartTimeLecturer.setForeground(Color.WHITE);
		btnPartTimeLecturer.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnPartTimeLecturer.setBorderPainted(false);
		btnPartTimeLecturer.setBackground(Color.LIGHT_GRAY);
		btnPartTimeLecturer.setBounds(289, 114, 253, 61);
		add(btnPartTimeLecturer);
				
		//button to add full time lecturer
		btnFullTimeLecturer = new JButton("Full Time Lecturer");
		btnFullTimeLecturer.setForeground(Color.WHITE);
		btnFullTimeLecturer.setBorderPainted(false);
		btnFullTimeLecturer.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnFullTimeLecturer.setBackground(new Color(255, 127, 80));
		btnFullTimeLecturer.setBounds(289, 193, 255, 61);
		add(btnFullTimeLecturer);
		
		//button to add contract lecturer
		btnContractLecturer = new JButton("Contract Lecturer");
		btnContractLecturer.setBounds(289, 274, 253, 54);
		btnContractLecturer.setForeground(Color.WHITE);
		btnContractLecturer.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnContractLecturer.setBorderPainted(false);
		btnContractLecturer.setBackground(Color.LIGHT_GRAY);
		add(btnContractLecturer);
		
		
		AddLecturerController lc= new AddLecturerController(this);
		lc.checkButtonPressed();
	}
	
	//method to add functionality to the buttons
	
	public void addPartTime(ActionListener a)
	{
		btnPartTimeLecturer.addActionListener(a);
		
	}
	
	public void addFullTime(ActionListener a)
	{
		btnFullTimeLecturer.addActionListener(a);
	}
	
	public void addContract(ActionListener a)
	{
		btnContractLecturer.addActionListener(a);
	}
	
	public JButton getPartButton() {
		return btnPartTimeLecturer;
	}

	
	
}
