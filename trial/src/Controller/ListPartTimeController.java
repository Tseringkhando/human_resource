package Controller;

import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import Model.*;
import View.*;

public class ListPartTimeController {
	ListPartTimeView v;
	
	DeptListPartTime dv;
	
	ListPartTimeLecturerModel m;
	AddPartTimeModel am;
	FullTimeModel d;
	ArrayList<PartTimeLecturerModel>depts= new ArrayList<PartTimeLecturerModel>();
	 JTable deptTable = new JTable();	
	public ListPartTimeController(ListPartTimeView v)
	{ this.v=v; }
	
	public ListPartTimeController(DeptListPartTime v)
	{ this.dv=v; }
	
	public void viewLists()
	{
		m=new ListPartTimeLecturerModel();
		JScrollPane j = m.getSp();
		v.setTable(m.getTable());
		v.setScrollPane(j);
		
	}
	public void details() {
		m=new ListPartTimeLecturerModel();
		JScrollPane j = m.getSp();
		dv.setTable(m.getTable());
		dv.setScrollPane(j);
	}
}
