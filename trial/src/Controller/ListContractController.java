package Controller;

import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import Model.*;
import View.*;

public class ListContractController {
	ListContractLecturerView v;
	DeptListContract dv;
	ListContractLecturerModel m;
	AddContractLecturerModel am;
	ContractLecturerModel d;
	ArrayList<ContractLecturerModel>depts= new ArrayList<ContractLecturerModel>();
	 JTable deptTable = new JTable();	
	public ListContractController(ListContractLecturerView v)
	{ this.v=v; }
	
	public ListContractController(DeptListContract v)
	{ this.dv=v; }
	
	public void viewLists()
	{
		m=new ListContractLecturerModel();
		JScrollPane j = m.getSp();
		v.setTable(m.getTable());
		v.setScrollPane(j);
	}
	
	public void details()
	{
		m=new ListContractLecturerModel();
		JScrollPane j = m.getSp();
		dv.setTable(m.getTable());
		dv.setScrollPane(j);
	}
}
