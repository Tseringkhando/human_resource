package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ListPartTimeLecturerModel {
	ArrayList<PartTimeLecturerModel> deptScroll = new ArrayList<PartTimeLecturerModel>();
	DefaultTableModel tableModel = new DefaultTableModel(0, 8);
	 JTable table=new JTable(tableModel);
	 JScrollPane spTable = new JScrollPane(table);
	
	public ListPartTimeLecturerModel() {
		display();
	}
	
	@SuppressWarnings("unchecked")
	public  static ArrayList<PartTimeLecturerModel> getPartTimeArray()
	{
		ArrayList<PartTimeLecturerModel> cont = null;
		try{
			FileInputStream fis = new FileInputStream("records/part_time_lecturers.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o= ois.readObject();
			cont = (ArrayList<PartTimeLecturerModel>)o;
			ois.close();
			
			
		}
		catch (FileNotFoundException e){
			
			e.printStackTrace();
		}
		catch (IOException e){
			JOptionPane.showMessageDialog(null, "Empty File");
		}
		catch (ClassNotFoundException e){
			
			e.printStackTrace();
		}
		return cont;
	}
	
	public void display() {
		if(getPartTimeArray()!=null) {
			deptScroll = getPartTimeArray();
			PartTimeLecturerModel obj = new PartTimeLecturerModel();
			for(int i=0;i<deptScroll.size();i++) {
				obj=deptScroll.get(i);
				Object[] data= {obj.getId(),obj.getDpmnt(),obj.getFirstName(),obj.getLastName(),obj.getContact(),obj.getEmail(),obj.getEmpDate(),obj.getHourlyPay()};
				tableModel.addRow(data);
			}
			Object col[]= {"Reg. ID","Department","First Name","Last Name","Contact","Email","Employed Date","Salary/Hr"};
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
