package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeRunner {
       
	public static List<Employee> getEmployeeDetails(){
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"priyanka",500000));
		emp.add(new Employee(2,"Amol",600000));
		emp.add(new Employee(3,"meghana",400000));
		emp.add(new Employee(4,"komal",300000));
		emp.add(new Employee(5,"Akshdha",700000));
		return emp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //      Predicate<Employee> e1=e->e.name.startsWith("p");
        		 Predicate<Employee> e1=e->e.salary> 50000;
        		 List<Employee> l=getEmployeeDetails();
        	//	 boolean b=l.stream().noneMatch(e1);
        		 boolean b=l.stream().anyMatch(e1);
        	 System.out.println(b);
	}

}
