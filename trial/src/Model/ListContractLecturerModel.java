package Model;

import java.io.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ListContractLecturerModel {

	ArrayList<ContractLecturerModel> deptScroll = new ArrayList<ContractLecturerModel>();
	DefaultTableModel tableModel = new DefaultTableModel(0, 9);
	private JTable table=new JTable(tableModel);
	private JScrollPane spTable = new JScrollPane(table);
	public ListContractLecturerModel() {
		display();
	}
	
	public  static ArrayList<ContractLecturerModel> getArrays()
	{
		ArrayList<ContractLecturerModel> dprt = null;
		try{
			FileInputStream fis = new FileInputStream("records/contract_lecturers.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o= ois.readObject();
			dprt = (ArrayList<ContractLecturerModel>)o;
			ois.close();


		}
		catch (FileNotFoundException e){

			e.printStackTrace();
		}
		catch (IOException e){
		}
		catch (ClassNotFoundException e){

			e.printStackTrace();
		}
		return dprt;
	}

	public void display() {
		if(getArrays()!=null) {
			deptScroll = getArrays();
			ContractLecturerModel obj = new ContractLecturerModel();
			for(int i=0;i<deptScroll.size();i++) {
				obj=deptScroll.get(i);
				Object[] data= {obj.getId(),obj.getDpmnt(),obj.getFirstName(),obj.getLastName(),obj.getContact(),obj.getEmail(),obj.getEmpDate(),obj.getExpiry(),obj.getmonthlyPay()};
				tableModel.addRow(data);
			}
			Object col[]= {"Reg. ID","Department","First Name","Last Name","Contact","Email","Employed Date","Expiry","Salary"};
			tableModel.setColumnIdentifiers(col);
			table.setRowHeight(25);
			TableColumnModel cModel = table.getColumnModel();

		}
	}
	public JScrollPane getSp()
	{
		return spTable;
	}
	public JTable getTable() {
		return table;
	}
}
