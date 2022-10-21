package com.java;
import java.util.*;
import java.time.*;
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Date d=new Date();
  System.out.println("Date :"+d);
  
  LocalDate currentDate=LocalDate.now();
  System.out.println("Current Date is:"+currentDate);
  
  LocalTime currentTime=LocalTime.now();
  System.out.println("Current Time is:"+currentTime);
  
  LocalDateTime currentDateTime=LocalDateTime.now();
  System.out.println("Current Date and Time is:"+currentDateTime);
  
  ZoneId currentZone=ZoneId.systemDefault();
  System.out.println("Current Zone is:"+currentZone);
   
  System.out.println("Current year is leap :"+currentDate.isLeapYear());
  System.out.println("Plus Days is:"+currentDate.plusDays(2));
  System.out.println(" Plus Month is:"+currentDate.plusMonths(4));
  System.out.println(" Plus Week is:"+currentDate.plusWeeks(3));
  
  System.out.println("Minus Days is:"+currentDate.minusDays(2));
  System.out.println(" Minus Month is:"+currentDate.minusMonths(4));
  System.out.println(" Minus Week is:"+currentDate.minusWeeks(3));
	}

}
