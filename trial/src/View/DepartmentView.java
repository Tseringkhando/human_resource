package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DepartmentView extends JFrame {
	ImageIcon icon = new ImageIcon("icon/i.png");
	private JPanel jpTitle, jpWorkArea;
	private JLabel jlTitle;
	private JButton jbLogOut , jbTabHome, jbAddDept, jbDeptList, jbAddLect, jbConLectList,jbFullLectList,jbPartLectList;

	public DepartmentView()
	{
		setTitle("NMC");
		setIconImage(icon.getImage());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 1150, 800);
		getContentPane().setBackground(new Color(255, 99, 71));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		//panel with the name of the university
		jpTitle = new JPanel();
		jpTitle.setLayout(null);
		jpTitle.setBackground(Color.BLACK);
		jpTitle.setBounds(0, 0, 1150, 50);
		getContentPane().add(jpTitle);

		//title of university
		jlTitle = new JLabel("NORTHAMPTON METROPOLITAN UNIVERSITY");
		jlTitle.setBackground(SystemColor.control);
		jlTitle.setBounds(0, -20, 668, 85);
		jpTitle.add(jlTitle);
		jlTitle.setForeground(new Color(255, 255, 255));
		jlTitle.setFont(new Font("FZLanTingHeiS-UL-GB", Font.BOLD, 25));

		//log out button 
		jbLogOut = new JButton("LOG OUT");
		jbLogOut.setBounds(55, 700, 120, 30);
		getContentPane().add(jbLogOut);
		jbLogOut.setBackground(new Color(255, 160, 122));
		jbLogOut.setBorderPainted(false);
		jbLogOut.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		jbLogOut.setForeground(SystemColor.menu);
		jbLogOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		jbConLectList = new JButton("Contract Lecturers");
		jbConLectList.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbConLectList.setForeground(SystemColor.menu);
		jbConLectList.setFocusPainted(false);
		jbConLectList.setBorderPainted(false);
		jbConLectList.setBackground(new Color(255, 160, 122));
		jbConLectList.setBounds(0, 100, 210, 100);
		jbConLectList.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbConLectList);
		
		jbPartLectList = new JButton("Part Time Lecturers");
		jbPartLectList.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbPartLectList.setForeground(SystemColor.menu);
		jbPartLectList.setFocusPainted(false);
		jbPartLectList.setBorderPainted(false);
		jbPartLectList.setBackground(new Color(255, 160, 122));
		jbPartLectList.setBounds(0, 200, 210, 100);
		jbPartLectList.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbPartLectList);
			
		jbFullLectList = new JButton("Full Time Lecturers");
		jbFullLectList.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbFullLectList.setForeground(SystemColor.menu);
		jbFullLectList.setFocusPainted(false);
		jbFullLectList.setBorderPainted(false);
		jbFullLectList.setBackground(new Color(255, 160, 122));
		jbFullLectList.setBounds(0, 300, 210, 100);
		jbFullLectList.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbFullLectList);
		
		
		//panel to view contents
		jpWorkArea = new JPanel();
		jpWorkArea.setBackground(UIManager.getColor("Button.background"));
		jpWorkArea.setBounds(210, 50, 960, 750);
		
	
		getContentPane().add(jpWorkArea);
		jpWorkArea.setLayout(null);

	}
	
	public void listContractView()
	{
		jpWorkArea.removeAll();
		DeptListContract v= new DeptListContract();
		jpWorkArea.add(v);
		revalidate();
		v.repaint();
	}
	
	public void listFullTimeView()
	{
		jpWorkArea.removeAll();
		DeptListFullTime v= new DeptListFullTime();
		jpWorkArea.add(v);
		revalidate();
		v.repaint();
	}
	public void listPartView()
	{
		jpWorkArea.removeAll();
		DeptListPartTime v= new DeptListPartTime();
		jpWorkArea.add(v);
		revalidate();
		v.repaint();
	}
	
	//button listeners
	public void logOut(ActionListener a) {jbLogOut.addActionListener(a);}
	public void listContract(ActionListener a) {jbConLectList.addActionListener(a);}
	public void listPart(ActionListener a) {jbPartLectList.addActionListener(a);}
	public void listFull(ActionListener a) {jbFullLectList.addActionListener(a);}

}
