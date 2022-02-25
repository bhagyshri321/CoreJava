package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) throws ParseException {
		
		Date d= new Date();  
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		String s = f.format(d);
		System.out.println(s);
		
		String s1="13/01/1992";
		Date d1= f.parse(s1);
	
Calendar c=Calendar.getInstance();
				
		c.setTime(d);
		int yer=c.get(Calendar.YEAR);
		int mon =c.get(Calendar.MONTH);
		int date =c.get(Calendar.DATE);
		
		c.setTime(d1);
		int yer1=c.get(Calendar.YEAR);
		int mon1 =c.get(Calendar.MONTH);
		int date1=c.get(Calendar.DATE);
		
		System.out.println(yer-yer1);
		System.out.println(mon-mon1);
		System.out.println(date-date1);
	}
	
	}
	

