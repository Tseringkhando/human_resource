package Controller;
import View.*;
import Model. *;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;



public class AddFullTimeController {
	FullTimeView v ;
	AddFullTimeModel m;
	
	public AddFullTimeController(FullTimeView v)
	{
		this.v= v;
	}
	
	//button functionality
	
	public void addFullTime()
	{
		v.getAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(
						v.getId().getText().isEmpty() ||
						v.getFirstName().getText().isEmpty() ||
						v.getLastName().getText().isEmpty() ||
						v.getEmail().getText().isEmpty() ||
						v.getPay().getText().isEmpty() ||
						v.getEmployedDate().getText().isEmpty() ||
						v.getContact().getText().isEmpty()
					)
					{
						JOptionPane.showMessageDialog(null, "Incomplete Information");
					}
				else {
				m= new AddFullTimeModel();
				m.addArray(v);	
				v.getId().setText("");
				v.getFirstName().setText("");
				v.getLastName().setText("");
				v.getEmail().setText("");
				v.getPay().setText("");
				v.getEmployedDate().setText("");
				v.getContact().setText("");
				}
			}
		});
		
		
		//back button
		v.getBack().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				v.dispose();
			}
		});
	}
}
