package com.designpat;

import java.util.List;

//import com.journaldev.designpat.prototype.Employees;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeesPro emps = new EmployeesPro();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		EmployeesPro empsNew = (EmployeesPro) emps.clone();
		EmployeesPro empsNew1 = (EmployeesPro) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}