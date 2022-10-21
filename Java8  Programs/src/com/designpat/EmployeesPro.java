package com.designpat;


import java.util.ArrayList;
import java.util.List;

public class EmployeesPro implements Cloneable{

	private List<String> empList;
	
	public EmployeesPro(){
		empList = new ArrayList<String>();
	}
	
	public EmployeesPro(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new EmployeesPro(temp);
	}
	
}