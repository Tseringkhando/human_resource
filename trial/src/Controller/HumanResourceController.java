package Controller;
import View.*;
import Controller.*;
import Model.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Model.*;
public class HumanResourceController {
	HumanResourceView hmview;
	LoginView v;
	AddLecturerView lecture =new AddLecturerView();


	public HumanResourceController(HumanResourceView v)
	{
		this.hmview=v; }

	public void checkbutton() {
		
		hmview.addDeptListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{	hmview.deptView(); }
		});

			hmview.addLecturer(new ActionListener() {

				public void actionPerformed(ActionEvent e)
				{hmview.lecturerView();}
				
			});


		hmview.gotoHome(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hmview.home();
			}
		});
		
		hmview.listDeptListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hmview.listDepartment();
			}
		});
		
		hmview.listContract(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hmview.listContractView();
			}
		});
		
		hmview.listFull(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			hmview.listFullTimeView();
				
			}
		});
		
		hmview.listPart(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hmview.listPartView();
			}
		});
		
		
		hmview.logOut(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hmview.dispose();
				LoginView v = new LoginView();
					Login m = new Login();
					LoginController c = new LoginController(v,m);
					c.loginData();
					v.setVisible(true);
			}
		});
		
		hmview.exit(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
				
			}
		});

	}}
