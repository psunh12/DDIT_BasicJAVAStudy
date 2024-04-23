package ddit.chap06.sec01_hw;

public class SalaryMan {
	String manID;
	private int salary;
	private int yearSalary;
	
	
	
	SalaryMan(String manID){
		this.manID= manID;
		salary = 1000000;
	}
	
	SalaryMan(String manID,int salary){
		this.manID= manID;
		salary = 1000000;
		
	}
	
	
	public int getAnnualGross() {
		yearSalary = salary*12 +salary*5;
		return yearSalary;
	}
		
}
