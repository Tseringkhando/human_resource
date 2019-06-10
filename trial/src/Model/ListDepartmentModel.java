package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class ListDepartmentModel{
	
	ArrayList<Departments> deptScroll = new ArrayList<Departments>();
	
	DefaultTableModel tableModel = new DefaultTableModel(0, 6);
	private JTable table=new JTable(tableModel);
	JScrollPane spTable = new JScrollPane(table);
	
	public ListDepartmentModel()
	{
		display();
	}
	public  static ArrayList<Departments> getArrays()
	{
		ArrayList<Departments> dprt = null;
		try{
			FileInputStream fis = new FileInputStream("records/departments.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o= ois.readObject();
			dprt = (ArrayList<Departments>)o;
			ois.close();
			
			
		}
		catch (FileNotFoundException e){
			
			e.printStackTrace();
		}
		catch (IOException e){}
		catch (ClassNotFoundException e){
			
			e.printStackTrace();
		}
		return dprt;
	}
	
	public void display() {
		if(getArrays()!=null) {
		deptScroll = getArrays();
		Departments obj = new Departments();
		for(int i=0;i<deptScroll.size();i++) {
			obj=deptScroll.get(i);
			Object[] data= {obj.getDeptID(),obj.getDeptName(),obj.getDeptType(),obj.getUserName(),obj.getWebAdd(),obj.getPassword()};
			tableModel.addRow(data);		
		}
		Object col[]= {"Registration ID","Name","Type","Username","Web Address","Password"};
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
