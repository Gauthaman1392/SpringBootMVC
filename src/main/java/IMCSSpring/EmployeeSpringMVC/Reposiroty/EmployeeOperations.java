package IMCSSpring.EmployeeSpringMVC.Reposiroty;

import IMCSSpring.EmployeeSpringMVC.Model.Department;
import IMCSSpring.EmployeeSpringMVC.Model.Employee;

public interface EmployeeOperations {

	Employee getEmployeeInfo(int empNo);

	Department getDepartmentName(int empNo);

	double getSalary(int empNo);

	void setCommit(boolean flag);

	void setAutoCommit(boolean flag);

	boolean addnewEmployee(Employee emp, Double salary, String deptName);

	boolean updateEmployee(Employee emp, double salary, String deptName);

}
