package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import View.*;

public class HumanResourceView extends JFrame{
	ImageIcon icon = new ImageIcon("icon/i.png");
	private JPanel jpTitle, jpWorkArea;
	private JLabel jlTitle,wc;
	private JMenuBar jmHR;
	private JMenu jMenuHR; 
	private JMenuItem jItemExit;
	private JButton jbLogOut , jbTabHome, jbAddDept, jbDeptList, jbAddLect, jbConLectList,jbFullLectList,jbPartLectList;
	
	public HumanResourceView() {
		//the main window of the human resource 
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
		jpTitle.setBounds(0, 22, 1150, 50);
		getContentPane().add(jpTitle);
		
		//title of university
		jlTitle = new JLabel("NORTHAMPTON METROPOLITAN UNIVERSITY");
		jlTitle.setBackground(SystemColor.control);
		jlTitle.setBounds(4, -20, 668, 85);
		jpTitle.add(jlTitle);
		jlTitle.setForeground(new Color(255, 255, 255));
		jlTitle.setFont(new Font("FZLanTingHeiS-UL-GB", Font.BOLD, 25));
		
		//this is the menubar on top
		 jmHR = new JMenuBar();
		 jmHR.setBounds(0, 0, 1150, 22);
		getContentPane().add(jmHR);
		
		//menus in the menu bar
		jMenuHR = new JMenu("HOME");
		jmHR.add(jMenuHR);
		
		//sub menus in the main menu tab
		 jItemExit = new JMenuItem("EXIT");
		jMenuHR.add(jItemExit);
		
		//log out button 
		jbLogOut = new JButton("LOG OUT");
		jbLogOut.setBounds(55, 700, 120, 30);
		getContentPane().add(jbLogOut);
		jbLogOut.setBackground(new Color(255, 160, 122));
		jbLogOut.setBorderPainted(false);
		jbLogOut.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		jbLogOut.setForeground(SystemColor.menu);
		jbLogOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		//side navigations
		jbTabHome = new JButton("Home");
		jbTabHome.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbTabHome.setForeground(UIManager.getColor("CheckBox.background"));
		jbTabHome.setFocusPainted(false);
		jbTabHome.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		jbTabHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jbTabHome.setBackground(new Color(255, 160, 122));
		jbTabHome.setBorderPainted(false);
		jbTabHome.setBounds(0, 140, 210, 60);
		getContentPane().add(jbTabHome);
		
		jbAddDept = new JButton("Add Department");
		jbAddDept.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbAddDept.setForeground(SystemColor.menu);
		jbAddDept.setFocusPainted(false);
		jbAddDept.setBorderPainted(false);
		jbAddDept.setBackground(new Color(255, 160, 122));
		jbAddDept.setBounds(0, 190, 210, 60);
		jbAddDept.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbAddDept);
		
		jbDeptList = new JButton("Departments List");
		jbDeptList.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbDeptList.setForeground(SystemColor.menu);
		jbDeptList.setFocusPainted(false);
		jbDeptList.setBorderPainted(false);
		jbDeptList.setBackground(new Color(255, 160, 122));
		jbDeptList.setBounds(0, 240, 210, 60);
		jbDeptList.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbDeptList);
		
		jbAddLect = new JButton("Add Lecturers");
		jbAddLect.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbAddLect.setForeground(SystemColor.menu);
		jbAddLect.setFocusPainted(false);
		jbAddLect.setBorderPainted(false);
		jbAddLect.setBackground(new Color(255, 160, 122));
		jbAddLect.setBounds(0, 290, 210, 60);
		jbAddLect.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbAddLect);
		
		jbConLectList = new JButton("Contract Lecturers");
		jbConLectList.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbConLectList.setForeground(SystemColor.menu);
		jbConLectList.setFocusPainted(false);
		jbConLectList.setBorderPainted(false);
		jbConLectList.setBackground(new Color(255, 160, 122));
		jbConLectList.setBounds(0, 340, 210, 60);
		jbConLectList.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbConLectList);
		
		jbPartLectList = new JButton("Part Time Lecturers");
		jbPartLectList.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbPartLectList.setForeground(SystemColor.menu);
		jbPartLectList.setFocusPainted(false);
		jbPartLectList.setBorderPainted(false);
		jbPartLectList.setBackground(new Color(255, 160, 122));
		jbPartLectList.setBounds(0, 400, 210, 60);
		jbPartLectList.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbPartLectList);
			
		jbFullLectList = new JButton("Full Time Lecturers");
		jbFullLectList.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		jbFullLectList.setForeground(SystemColor.menu);
		jbFullLectList.setFocusPainted(false);
		jbFullLectList.setBorderPainted(false);
		jbFullLectList.setBackground(new Color(255, 160, 122));
		jbFullLectList.setBounds(0, 460, 210, 60);
		jbFullLectList.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(jbFullLectList);
		
		
		//panel to view contents
		jpWorkArea = new JPanel();
		jpWorkArea.setBackground(UIManager.getColor("Button.background"));
		jpWorkArea.setBounds(210, 70, 940, 750);
		
	
		getContentPane().add(jpWorkArea);
		home();
		jpWorkArea.setLayout(null);

	}
	
	//method to add the functionality to the buttons of the side nav
		public void addDeptListener(ActionListener a)
		{jbAddDept.addActionListener(a);}
		
		public void addLecturer(ActionListener a)
		{jbAddLect.addActionListener(a);}
		
		public void listDeptListener(ActionListener list) 
		{
			jbDeptList.addActionListener(list);
		}
		
		
		public void gotoHome(ActionListener home) {
			jbTabHome.addActionListener(home);
		}
		
		public void logOut(ActionListener a) {jbLogOut.addActionListener(a);}
		public void listContract(ActionListener a) {jbConLectList.addActionListener(a);}
		public void listPart(ActionListener a) {jbPartLectList.addActionListener(a);}
		public void listFull(ActionListener a) {jbFullLectList.addActionListener(a);}

	
		
		public void home() {
			jpWorkArea.removeAll();
			 wc= new JLabel("You are \nlogged in.");
				wc.setFont(new Font("Trajan Pro", Font.BOLD, 35));
				wc.setForeground(new Color(255, 99, 71));
				wc.setBounds(250,200,900,200);
				jpWorkArea.add(wc);
				revalidate();
				jpWorkArea.repaint();
		}
		public void deptView( )
		{
			jpWorkArea.removeAll();
			AddDepartmentView v= new AddDepartmentView();
			jpWorkArea.add(v);
			revalidate();
			v.repaint();
		}
		
		public void lecturerView()
		{
			jpWorkArea.removeAll();
			AddLecturerView v= new AddLecturerView();
			jpWorkArea.add(v);
			revalidate();
			v.repaint();
		}
		
		public void listDepartment()
		{
			jpWorkArea.removeAll();
			ListDepartmentView v= new ListDepartmentView();
			jpWorkArea.add(v);
			revalidate();
			v.repaint();
		}
		
		public void listContractView()
		{
			jpWorkArea.removeAll();
			ListContractLecturerView v= new ListContractLecturerView();
			jpWorkArea.add(v);
			revalidate();
			v.repaint();
		}
		
		public void listFullTimeView()
		{
			jpWorkArea.removeAll();
			ListFullTimeView v= new ListFullTimeView();
			jpWorkArea.add(v);
			revalidate();
			v.repaint();
		}
		public void listPartView()
		{
			jpWorkArea.removeAll();
			ListPartTimeView v= new ListPartTimeView();
			jpWorkArea.add(v);
			revalidate();
			v.repaint();
		}
		public void exit(ActionListener e) {
			jItemExit.addActionListener(e);
		}
}

