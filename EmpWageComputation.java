package EmpWage;

public class EmpWageComputation {
	public static void main(String[] args) {

		double IS_PART_TIME = 1;
		double IS_FULL_TIME = 2;
		double Emp_Rate_Per_Hr = 20;
		double EmpHrs;

		double empCheck = Math.floor(Math.random() * 10) % 3;

		if (empCheck == IS_FULL_TIME) {
			EmpHrs = 12;
		} else if (empCheck == IS_PART_TIME) {
			EmpHrs = 8;
		} else {
			EmpHrs = 0;
		}

		double salary = (EmpHrs * Emp_Rate_Per_Hr);
		System.out.println(salary);
	}
}
