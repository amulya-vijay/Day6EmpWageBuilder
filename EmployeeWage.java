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

class PartTime{
	
	private final int wage_per_hr;
	private final int emphrs;
	public int parttime_wage;
	public PartTime(int wage,int hrs) {
		this.wage_per_hr=wage;
		this.emphrs=hrs;
	}
	
	String part_time_wage() {
		
		parttime_wage=this.wage_per_hr*this.emphrs;
		return "Daily wage of part time employee is : "+parttime_wage;
	}
}
public class EmployeeWage {
	public static void main(String [] args) {
		System.out.println("Welcome to Employee Wage Computation"); //prints welcome message
		
		Attendance att = new Attendance(); //object of attendance class
		att.emp_attendance(); // call to attendance method through object 
		
		DailyWage dw = new DailyWage(100,8); //Object of Daily wage class
		System.out.println(dw.dailyWage()); //call to daily wage calculation method
		
		PartTime pt = new PartTime(80,4); //Object of Part Time class
		System.out.println(pt.part_time_wage()); //call to part time wage calculation method
	}
}