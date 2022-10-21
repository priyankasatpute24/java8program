package com.java;

import java.util.ArrayList;
import java.util.List;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String>names=new ArrayList<String>();
         names.add("priyanka");
         names.add("amol");
         names.add("komal");
         names.add("meghana");
         long count=0;
         
         count=names.stream().filter(str->str.length()<6).count();
         System.out.println("count of length whoes length <6:"+count);
         
	}

}
