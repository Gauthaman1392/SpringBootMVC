package IMCSSpring.EmployeeSpringMVC.Services;

import org.springframework.stereotype.Service;

import IMCSSpring.EmployeeSpringMVC.Model.Employee;
import IMCSSpring.EmployeeSpringMVC.Reposiroty.EmployeeOperations;
import IMCSSpring.EmployeeSpringMVC.Reposiroty.EmployeeOperationsImpl;

@Service
public class EmployeeServices {
	
EmployeeOperations empOps = new EmployeeOperationsImpl();
	
	public Employee getEmployee(int empNo){
		System.out.println(empNo);
		return empOps.getEmployeeInfo(empNo);
	}

}
