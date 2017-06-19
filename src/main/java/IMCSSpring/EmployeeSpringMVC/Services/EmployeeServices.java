package IMCSSpring.EmployeeSpringMVC.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import IMCSSpring.EmployeeSpringMVC.Model.Department;
import IMCSSpring.EmployeeSpringMVC.Model.Employee;
import IMCSSpring.EmployeeSpringMVC.Model.EmployeeInfo;
import IMCSSpring.EmployeeSpringMVC.Reposiroty.EmployeeOperations;
import IMCSSpring.EmployeeSpringMVC.Reposiroty.EmployeeOperationsImpl;


@Service
public class EmployeeServices {

	EmployeeOperations dbImpl = new EmployeeOperationsImpl();

	public EmployeeInfo getEmployee(int empNo) {
		Employee emp = dbImpl.getEmployeeInfo(empNo);
		if (emp != null) {
			Department dept = dbImpl.getDepartmentName(empNo);
			double salary = dbImpl.getSalary(empNo);
			EmployeeInfo empInfo = new EmployeeInfo();
			empInfo.setNumber(emp.getNumber());
			empInfo.setDeptName(dept.getDeptName());
			empInfo.setFirstName(emp.getFirstName());
			empInfo.setLastName(emp.getLastName());
			empInfo.setSalary(salary);
			empInfo.setGender(emp.getGender());
			return empInfo;
		}else
			return null;

	}

	public boolean addOrUpdateEmployee(EmployeeInfo empInfo, double salary, String deptName) {

		Employee existEmployee = dbImpl.getEmployeeInfo(empInfo.getNumber());
		// System.out.println(existEmployee);
		Employee employee = new Employee();
		employee.setFirstName(empInfo.getFirstName());
		employee.setBirthDate(empInfo.getBirthDate());
		employee.setGender(empInfo.getGender());
		employee.setHireDate(empInfo.getHireDate());
		employee.setLastName(empInfo.getLastName());
		employee.setNumber(empInfo.getNumber());
		
		if (existEmployee == null) {
			return dbImpl.addnewEmployee(employee, salary, deptName);

		} else {
			return dbImpl.updateEmployee(employee, salary, deptName);
		}
	}

	public ArrayList<String> getDepartmentNames() {
		ArrayList<String> deptName = new ArrayList<>();
		deptName.add("Finance");
		deptName.add("Customer Service");
		deptName.add("Development");
		deptName.add("Finance");
		deptName.add("Human Resources");
		deptName.add("Marketing");
		deptName.add("Production");
		deptName.add("Quality Management");
		deptName.add("Research");
		deptName.add("Sales");
		return deptName;
		
	}
}