package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Login;
import View.*;

public class LoginController {
	LoginView view;
	Login model;

	 public LoginController(LoginView view, Login model)  {   
		this.view=view;
		this.model=model;
	}

//the functionality of the login button is here
	 
	public void loginData() {
		view.loginUser(new ActionListener () {
			
			public void actionPerformed(ActionEvent e) {
				if(view.getUserType().getSelectedItem().equals("Human Resource"))
				{
					model.setType("HM");
					model.loginAdmin();
					if(model.verify(view.getUsername(), view.getUserPassword())) {
							view.dispose();
								HumanResourceView h = new HumanResourceView();
								h.setVisible(true);
								HumanResourceController r= new HumanResourceController(h);
								r.checkbutton();
				}
					else {
						JOptionPane.showMessageDialog(null, "Username or Password Incorrect!");
					}
				 
				
				}
				if(view.getUserType().getSelectedItem().equals("Department Secretary")) {
					model.setType("DS");
					if(model.loginDepartment(view)) {
						view.dispose();
						DepartmentView v= new DepartmentView();
						v.setVisible(true);
						DepartmentController c = new DepartmentController(v);
						c.checkbutton();
				}
					else {
						JOptionPane.showMessageDialog(null, "Username or Password Incorrect!");
					}
					
				}
			}
		});
	}
}
