package Model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import View.*;

public class AddContractLecturerModel {
	ArrayList <ContractLecturerModel> contract  = new ArrayList<ContractLecturerModel>();
	ListContractLecturerModel m = new ListContractLecturerModel();
	ContractLecturerModel info;
	@SuppressWarnings("static-access")
	public void addArray(ContractLecturerView cv)
	{
		double pay= Double.parseDouble(cv.getPay().getText());
		info = new ContractLecturerModel(cv.getId().getText(),cv.getFirstName().getText(),cv.getLastName().getText(),cv.getContact().getText(), cv.getEmail().getText(),cv.getEmployedDate().getText(),cv.getExpiryDate().getText(),pay,"Contract",cv.getDept());

		if( m.getArrays()!=null)
		{
			contract= m.getArrays();
			contract.add(info);
			addEntry();
			JOptionPane.showMessageDialog(null, "Lecturer Added");
		}
		else {
			contract.add(info);
			addEntry(); 
			JOptionPane.showMessageDialog(null, "Lecturer Added");
		}
		

	}
	public void addEntry() 
	{
		try {
			FileOutputStream fout = new FileOutputStream("records/contract_lecturers.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(contract);
			oos.close();
			
		}catch (Exception e) { }
	}


	//modify department
	public void editInfo(ListContractLecturerView dv, int i) throws FileNotFoundException, IOException {
		contract=  m.getArrays();
		double pay= Double.parseDouble(dv.getSalary());
		info= new ContractLecturerModel(dv.getReg(), dv.getfName(), dv.getlName(), dv.getContact(), dv.getEmail(), dv.getEmp(),dv.getExp(), pay,"Contract",dv.getDept());
		contract.set(i,info);
		addEntry();
		JOptionPane.showMessageDialog(null, "Information Saved  ");
	}

	//delete department
	public void deleteInfo(ListContractLecturerView dv,int i) {
		int re = JOptionPane.showConfirmDialog(null, "Confirm Delete?", "Confirm",
		        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		    if (re == JOptionPane.YES_OPTION) {
		    	contract=  m.getArrays();
				contract.remove(i);
				addEntry();
				JOptionPane.showMessageDialog(null, "Deleted");
		    }
	
	}
}
