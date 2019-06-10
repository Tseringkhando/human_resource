package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import Model.AddDepartmentModel;
import Model.Users;
import View.*;
public class AddDepartmentController {
	AddDepartmentView v ;
	AddDepartmentModel m;
	
	public AddDepartmentController(AddDepartmentView v ) {
		this.v =v;
	}
	
	public void deptCheckButton()
	{
		v.deptAddBtn(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(v.getDeptID().getText().isEmpty() ||v.getDeptName().getText().isEmpty() ||v.getUserName().getText().isEmpty() ||v.getPassword().getText().isEmpty() ||
				v.getWebAdd().getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Incomplete Information");
				}
				else {
				m= new AddDepartmentModel();
				m.addArray(v);
				v.getDeptID().setText("");
				v.getDeptName().setText("");
				v.getUserName().setText("");
				v.getPassword().setText("");
				v.getWebAdd().setText("");
				}
			}
		});
		
		//reset
		v.getResetButton().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				v.getDeptID().setText("");
				v.getDeptName().setText("");
				v.getUserName().setText("");
				v.getPassword().setText("");
				v.getWebAdd().setText("");
				
			}
		});
	}
}
