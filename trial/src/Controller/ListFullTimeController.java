package Controller;

import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import Model.*;
import View.*;

public class ListFullTimeController {
	ListFullTimeView v;
	ListFullTimeModel m;
	DeptListFullTime dv;
	AddFullTimeModel am;
	FullTimeModel d;
	ArrayList<FullTimeModel>depts= new ArrayList<FullTimeModel>();
	 JTable deptTable = new JTable();	
	public ListFullTimeController(ListFullTimeView v)
	{ this.v=v; }
	
	public ListFullTimeController(DeptListFullTime v)
	{ this.dv=v; }
	
	
	public void viewLists()
	{
		m=new ListFullTimeModel();
		JScrollPane j = m.getSp();
		v.setTable(m.getTable());
		v.setScrollPane(j);
	}
	
	public void details()
	{
		m=new ListFullTimeModel();
		JScrollPane j = m.getSp();
		dv.setTable(m.getTable());
		dv.setScrollPane(j);
	}
}
