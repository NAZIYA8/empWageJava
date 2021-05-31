package EmpWage;


public class EmpWageComputation {
	

	public static void main(String[] args) {
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		int TotalSalary=0;
		int Emp_Rate_Per_Hr = 20;
		int Num_Working_Days =20;
		int EmpHrs;
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		int i;
		for (i=1; i<= Num_Working_Days; i++) {
			
		System.out.println(empCheck);
		
		switch (empCheck) {
		case IS_PART_TIME :
			System.out.println("Empcheck is 1 (parttime)");
			EmpHrs = 8;
			break;
		case IS_FULL_TIME:
			System.out.println("Empcheck is 2 (fulltime)");
			EmpHrs = 12;
			break;
		default:
			System.out.println("Empcheck is 0");
			EmpHrs = 0;
		}
		int salary = (EmpHrs * Emp_Rate_Per_Hr);
		 TotalSalary = (TotalSalary+salary);
		System.out.println("Salary : "+ salary);
		System.out.println("Total Salary : " + TotalSalary);
		}
	}
}
