package com.java;

import java.util.ArrayList;
import java.util.List;

public class CollectionForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      List<String>al=new ArrayList<>();
      al.add("priyanka");
      al.add("meghana");
      al.add("komal");
      al.add("amol");
      int count=0;
      for(String str:al)
      {
    	
		if(str.length()<6)
    		  count++;
    	  
      }
      al.forEach(str->System.out.println(str));
      System.out.println("There are:"+count+"string with length less than 6");
	}

}
