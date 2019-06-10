package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import View.ContractLecturerView;
import View.ListFullTimeView;
import View.ListPartTimeView;
import View.PartTimeView;

public class AddPartTimeModel{
	ArrayList <PartTimeLecturerModel> part  = new ArrayList<PartTimeLecturerModel>();
	ListPartTimeLecturerModel m = new ListPartTimeLecturerModel();
	PartTimeLecturerModel info;
	@SuppressWarnings("unchecked")
	public void addArray(PartTimeView cv)
	{

		double pay= Double.parseDouble(cv.getPay().getText());
		info = new PartTimeLecturerModel(cv.getId().getText(),cv.getFirstName().getText(),cv.getLastName().getText(),cv.getContact().getText(), cv.getEmail().getText(),cv.getEmployedDate().getText(),pay,"Part Time",cv.getDept());
		part.add(info);
		addEntry(); 
		JOptionPane.showMessageDialog(null, "Lecturer Added");

	}
	public void addEntry() 
	{
		try {
			FileOutputStream fout = new FileOutputStream("records/part_time_lecturers.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(part);
			oos.close();
		}catch (Exception e) { }
	}

	//modify 
	public void editInfo(ListPartTimeView dv, int i) throws FileNotFoundException, IOException {
		part=  m.getPartTimeArray();
		double pay= Double.parseDouble(dv.getSalary());
		info= new PartTimeLecturerModel(dv.getReg(), dv.getfName(), dv.getlName(), dv.getContact(), dv.getEmail(), dv.getEmp(),pay,"Part Time",dv.getDept());
		part.set(i,info);
		addEntry();
		JOptionPane.showMessageDialog(null, "Information Saved ");
	}

	//delete 
	public void deleteInfo(ListPartTimeView dv,int i) {
		int re = JOptionPane.showConfirmDialog(null, "Confirm Delete?", "Confirm",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		    if (re == JOptionPane.YES_OPTION) {
		part=  m.getPartTimeArray();
		part.remove(i);
		addEntry();
		JOptionPane.showMessageDialog(null, "Deleted");}
	}

}
