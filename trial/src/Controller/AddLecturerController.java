package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.*;
public class AddLecturerController {
	AddLecturerView view;
	HumanResourceView hmview;
	PartTimeView partTime;
	FullTimeView fullTime;
	ContractLecturerView contract;
	
	public AddLecturerController(AddLecturerView view) 
	{
		this.view= view;
	}
	
	public AddLecturerController(AddLecturerView view, HumanResourceView hmview) 
	{
		this.view= view;
		this.hmview= hmview;
	}
	
	
	
	public void checkButtonPressed()
	{
		view.addPartTime (new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{try {
				partTime = new PartTimeView();
				partTime.setVisible(true);
				fullTime.setVisible(false);
				contract.setVisible(false);
			}catch (Exception e1) {
				// TODO: handle exception
			}
				
			}
		});
		
		//full time lecturer
		
		view.addFullTime(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					fullTime = new FullTimeView();
					fullTime.setVisible(true);	
					partTime.setVisible(false);
					contract.setVisible(false);
				} catch (Exception e2) {
				}
				
			}
		});
		
		//contract Lecturer
		
		view.addContract(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					contract = new ContractLecturerView();
					contract.setVisible(true);
					fullTime.setVisible(false);	
					partTime.setVisible(false);
				
				}catch (Exception e3) {
					
				}
				
				
			}
		});
	}
		
	}

