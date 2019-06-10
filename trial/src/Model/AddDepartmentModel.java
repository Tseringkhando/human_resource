package Model;
import View.*;
//import model.AddDepartModel;

import java.io.File;
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

import Controller.*;
public class AddDepartmentModel {
	AddDepartmentView dv;
	ArrayList <Departments> deptUsers  = new ArrayList<Departments>();
	ListDepartmentModel m = new ListDepartmentModel();
	Departments info;
	public void addArray(AddDepartmentView dv)
	{

		info = new Departments(dv.getDeptID().getText(), dv.getDeptName().getText(), (String) dv.getDeptType().getSelectedItem(), dv.getUserName().getText(), dv.getPassword().getText().toCharArray(), dv.getWebAdd().getText());
		if(m.getArrays()!=null) {
			deptUsers= m.getArrays();
			deptUsers.add(info);
			addEntry(); 
			JOptionPane.showMessageDialog(null, "Department Added");
		}
		else {

			deptUsers.add(info);
			addEntry(); 
			JOptionPane.showMessageDialog(null, "Department Added");
		}

	}
	public void addEntry() 
	{
		try {
			FileOutputStream fout = new FileOutputStream("records/departments.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(deptUsers);
			oos.close();
			

		}catch (Exception e) { }


	}


	//modify department
	public void editDepartment(ListDepartmentView dv, int i) throws FileNotFoundException, IOException {
		deptUsers=  m.getArrays();
		info= new Departments(dv.getReg(), dv.getName(),dv.getType(),dv.getUser(),dv.getPassword().toCharArray(),dv.getWeb());
		deptUsers.set(i,info);
		addEntry();
		JOptionPane.showMessageDialog(null, "Department Edited  ");
		
	}

	//delete department
	public void deleteDept(ListDepartmentView dv,int i) {
		int re = JOptionPane.showConfirmDialog(null, "Confirm Delete?", "Confirm",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		    if (re == JOptionPane.YES_OPTION) {
		deptUsers=  m.getArrays();
		deptUsers.remove(i);
	
		addEntry();
		JOptionPane.showMessageDialog(null, "Department Deleted");}
	}

}
