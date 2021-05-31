package EmpWage;

public class EmpWageComputation {
	public static void main(String[] args) {
	
		int IS_FULL_TIME  = 1;
		double empCheck = Math.floor(Math.random()*10) % 2;	
		
		if (empCheck == IS_FULL_TIME) {
			double EmpRatePerHr = 20;
			double EmpHrs = 8;
			double salary = (EmpRatePerHr*EmpHrs);
			System.out.println(salary);
		}
		else {
				System.out.println("Salary is  0 ");
			}
   	}
}
