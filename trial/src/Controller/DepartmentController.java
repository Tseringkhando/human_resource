package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Login;
import View.*;

public class DepartmentController {
	DepartmentView dv;
	LoginView v;


	public DepartmentController(DepartmentView v)
	{this.dv=v; }
	
	public void checkbutton() {
		
		dv.listContract(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dv.listContractView();
			}
		});
		
		dv.listFull(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dv.listFullTimeView();
				
			}
		});
		
		dv.listPart(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dv.listPartView();
			}
		});
		
		
		
		dv.logOut(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dv.dispose();
				 v = new LoginView();
					Login m = new Login();
					LoginController c = new LoginController(v,m);
					c.loginData();
					v.setVisible(true);
				
				
			}
		});

	}
}
