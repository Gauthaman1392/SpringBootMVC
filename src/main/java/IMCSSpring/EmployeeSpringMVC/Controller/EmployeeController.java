package IMCSSpring.EmployeeSpringMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import IMCSSpring.EmployeeSpringMVC.Model.Employee;
import IMCSSpring.EmployeeSpringMVC.Services.EmployeeServices;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeServices service;
	
	@RequestMapping("/employee")
	public String getEmployee() {
		System.out.println("Test");
		return "greeting";
	}
	
	
	@RequestMapping("/findemployee")
	public String findEmployee(@RequestParam("empNo") Integer empNo ,Model model){
		System.out.println("findemployee");
		System.out.println(empNo);
		Employee employee = service.getEmployee(empNo);
		System.out.println(employee.getFirstName());

		model.addAttribute(employee);
		
		return "employeeinfo";
	}
	
	public String createEmployee(@ModelAttribute Employee emp, Model model){
		
		model.addAttribute("Employee", emp);
		return "addemployee";
	}
	


}
