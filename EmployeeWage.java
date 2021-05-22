package com.practice;

class Attendance{
	int attendance = (int) Math.floor(Math.random()*2+1);
	
	public void emp_attendance(){
		int empcheck=attendance;
		if(empcheck==1) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}
	}
}

public class EmployeeWage {
	public static void main(String [] args) {
		System.out.println("Welcome to Employee Wage Computation"); //prints welcome message
		
		Attendance att = new Attendance(); //object of attendance class
		att.emp_attendance(); // call to attendance method through object 
	}
}