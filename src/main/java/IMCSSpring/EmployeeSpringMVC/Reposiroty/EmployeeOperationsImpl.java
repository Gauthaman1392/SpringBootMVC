package IMCSSpring.EmployeeSpringMVC.Reposiroty;

import org.springframework.beans.factory.annotation.Autowired;

import IMCSSpring.EmployeeSpringMVC.Model.Employee;

public class EmployeeOperationsImpl implements EmployeeOperations {
	
	DBQueryExecution query = new DBQueryExecution();

	@Override
	public Employee getEmployeeInfo(int empNo) {
		
		System.out.println("outside Query: " + empNo);
		return query.getEmployeeRecords(empNo);
		
	}

	

}
