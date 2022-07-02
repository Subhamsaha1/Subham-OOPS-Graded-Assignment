package com.gl.Assignment;

public class Main {

	private static final String W = "Welcome to";
	
	public static void main(String[] args) {
		
		AdminDepartment admn = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		SuperDepartment spd = new SuperDepartment();
		
		System.out.println(W + admn.departmentName());
		System.out.println(admn.gettodaysWork());
		System.out.println(admn.getworkDeadline());
		System.out.println(spd.getIsTodayAHoliday());
		
		System.out.println();
		 
		System.out.println(W + hr.departmentName());
		System.out.println(hr.getdoActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(spd.getIsTodayAHoliday());
		
		System.out.println();
		
		System.out.println(W + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(spd.getIsTodayAHoliday());
		

	}

}
