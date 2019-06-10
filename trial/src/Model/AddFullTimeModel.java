package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import View.*;

public class AddFullTimeModel {
	private ArrayList <FullTimeModel> full  = new ArrayList<FullTimeModel>();
	ListFullTimeModel m = new ListFullTimeModel();
	FullTimeModel info;	
	private DefaultTableModel tableModel = new DefaultTableModel(0, 7);
	private JTable table=new JTable(tableModel);
	private JScrollPane spTable = new JScrollPane(table);

	@SuppressWarnings("unchecked")
	public void addArray(FullTimeView cv)
	{
		double pay= Double.parseDouble(cv.getPay().getText());
		info = new FullTimeModel(cv.getId().getText(),cv.getFirstName().getText(),cv.getLastName().getText(),cv.getContact().getText(), cv.getEmail().getText(),cv.getEmployedDate().getText(),pay,"Full Time",cv.getDept());
		full.add(info);
		addEntry(); 
		JOptionPane.showMessageDialog(null, "Lecturer Added");		

	}
	public void addEntry() 
	{
		try {
			FileOutputStream fout = new FileOutputStream("records/full_time_lecturers.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(full);
			oos.close();		
		}catch (Exception e) { }


	}

	//modify department
	@SuppressWarnings("static-access")
	public void editInfo(ListFullTimeView dv, int i) throws FileNotFoundException, IOException {
		full=  m.getFullTimeArray();
		double pay= Double.parseDouble(dv.getSalary());
		info= new FullTimeModel(dv.getReg(), dv.getfName(), dv.getlName(), dv.getContact(), dv.getEmail(), dv.getEmp(),pay,"Full",dv.getDept());
		full.set(i,info);
		addEntry();
		JOptionPane.showMessageDialog(null, "Information Saved  ");
	}

	//delete department
	@SuppressWarnings("static-access")
	public void deleteInfo(ListFullTimeView dv,int i) {
		int re = JOptionPane.showConfirmDialog(null, "Confirm Delete?", "Confirm",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (re == JOptionPane.YES_OPTION) {
			full=  m.getFullTimeArray();
			full.remove(i);
			addEntry();
			JOptionPane.showMessageDialog(null, "Deleted"); }
	}
}
