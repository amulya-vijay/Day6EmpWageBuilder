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
	public int dailyWage() { //method to calculate dailywage of en employee
		daily_wage=this.wage_per_hr*this.hrs_per_day;
		return daily_wage;
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
	
	int part_time_wage() {
		
		parttime_wage=this.wage_per_hr*this.emphrs;
		return parttime_wage;
	}
}

class MonthlyWage{
	
	private final int wage_per_hr;
	private final int hrs_per_day;
	
	static int empHrs;

	public static int empCheck= (int) Math.floor(Math.random()*2+1); //generates a random vallue in the range (1,2)
	
	
	public MonthlyWage(int wage, int hrs, int days) {
		this.wage_per_hr=wage;
		this.hrs_per_day=hrs;
		//this.num_of_days=days;
	}
	
	public String monthlyWage() {
		
		int total_hrs=0;
		int total_wage=0;
		int total_days=0;
		int daily_wage=0;
		
		while(total_hrs<=100 && total_days<=20) {
			switch(empCheck) { 
			case 1: //calculates daily wage of full-time employee
				empHrs=8;
				DailyWage dw = new DailyWage(this.wage_per_hr,empHrs); //Object of Daily wage class
				daily_wage=dw.dailyWage(); //call to daily wage calculation method
				total_wage=daily_wage*total_days; // calculates monthly wage
				
				total_hrs=total_hrs+empHrs;
				
				break;
				 
			case 2: //calculates daily wage of part-time employee
				empHrs=4;
				PartTime pt = new PartTime(this.wage_per_hr,empHrs); //Object of Part Time class
				daily_wage=pt.part_time_wage(); //call to part time wage calculation method
				total_wage=daily_wage*total_days; //calculates monthly wage

				total_hrs=total_hrs+empHrs;
				
				break;
				
			default:
				break;
			}
			
			
			total_days++;
		
		}
		
		total_wage=total_hrs*wage_per_hr;
		return "Monthly wage of an Employee : "+total_wage;
	}
	
}

public class EmployeeWage {
	
	public static void main(String [] args) {
		System.out.println("Welcome to Employee Wage Computation"); //prints welcome message
		
		Attendance att = new Attendance(); //object of attendance class
		att.emp_attendance(); // call to attendance method through object 
		
		//SwitchEmployee.switchEmp(); // call to employee switch method
		
		MonthlyWage mw = new MonthlyWage(100,8,20);
		System.out.println(mw.monthlyWage());
		
	}
}