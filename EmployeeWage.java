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

class DailyWage{
	
	private final int wage_per_hr;
	private final int hrs_per_day;
	public static int daily_wage;
	
	public DailyWage(int wage, int hrs) { //constructor : initializes the variables
		this.wage_per_hr=wage;
		this.hrs_per_day=hrs;
	}
	public String dailyWage() { //method to calculate dailywage of en employee
		daily_wage=this.wage_per_hr*this.hrs_per_day;
		return "Daily wage of an Employee : "+daily_wage;
	}
}

public class EmployeeWage {
	public static void main(String [] args) {
		System.out.println("Welcome to Employee Wage Computation"); //prints welcome message
		
		Attendance att = new Attendance(); //object of attendance class
		att.emp_attendance(); // call to attendance method through object 
		
		DailyWage dw = new DailyWage(100,8); //Object of Daily wage class
		System.out.println(dw.dailyWage()); //call to daily wage calculation method
	}
}