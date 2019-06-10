package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Model.*;
import View.*;
public class ListDepartmentController {
	ListDepartmentView v;
	ListDepartmentModel m;
	AddDepartmentModel am;
	Departments d;
	
	
	ArrayList<Departments>depts= new ArrayList<Departments>();
	 JTable deptTable = new JTable();	
	public ListDepartmentController(ListDepartmentView v)
	{ this.v=v; }
	
	public void viewLists()
	{
		m=new ListDepartmentModel();
		JScrollPane j = m.getSp();
		v.setTable(m.getTable());
		v.setScrollPane(j);
	}
	
	

}

	
	

