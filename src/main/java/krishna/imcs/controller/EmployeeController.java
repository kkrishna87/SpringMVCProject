package krishna.imcs.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import krishna.imcs.beans.Employee;
import krishna.imcs.services.DepartmentService;
import krishna.imcs.services.EmployeeRESTInterface;
import krishna.imcs.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@Autowired
	DepartmentService deptservice;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@ModelAttribute("addEmployee")
	public Employee getAddEmp() {
		return new Employee();
	}

	@RequestMapping(value="/")
	public ModelAndView getEmployee(){
		ModelAndView model=new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value="/createEmployee")
	public ModelAndView addPage(){
		ModelAndView model=new ModelAndView("CreateEmployee");
		return model;
	}
	
	@RequestMapping(value="/createEmployee",method=RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("addEmployee") Employee emp){
		ModelAndView model=new ModelAndView("CreateEmployee");
		if(service.createEmployee(emp)!=null){
			System.out.println("k2");
			model.addObject("employeedata", emp);
			return model;
		}
		model.addObject("employeedata",null);
		return model;
	}
	
	
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public ModelAndView getEmployee(@RequestParam int empNo) {
		Employee emp = service.findEmployee(empNo);
		System.out.println(emp);
		ModelAndView model = new ModelAndView("viewEmployee");
		if (null != emp) {
			model.addObject("employee", emp);
			return model;
		} else {
			model.addObject("msg", "Employee not found for Id : "+empNo);
			return model;
		}
	}
	@RequestMapping(value = "updateEmployee", method = RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute Employee employee,@RequestParam int DeptID) {
			ModelAndView model;
			model = new ModelAndView("employee");
			model.addObject("msg", "Employee : " + employee.getEmpNum() + " updated successfully");
			model.addObject("employeeAddUpdate", employee);
			model.addObject("employee", null);
			
		return model;
	}

	@RequestMapping(value = "deleteEmployee", method = RequestMethod.POST)
	public ModelAndView deletEmployee(@RequestParam("EmpNum") int empNo,@RequestParam int deptNo){
		ModelAndView model=new ModelAndView();
		service.deleteEmployee(empNo);
		model = new ModelAndView("employee");
		model.addObject("msg", "Employee : " +empNo+ " deleted successfully");
		model.addObject("employee",null);
		return model;

	}

}
