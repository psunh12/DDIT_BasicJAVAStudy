package ddit.chap06.sec01_hw8;

public class SalaryMain {
	int salary;
	int totalSal;
	
	SalaryMain(){
		salary=1000000;
		totalSal=salary*12+(salary*5);
	}
	
	SalaryMain(int salary){
		this.salary=salary;
		totalSal=salary*12+(salary*5);
	}
	
	int getAnnualGross() {
		return totalSal;
	}
}

