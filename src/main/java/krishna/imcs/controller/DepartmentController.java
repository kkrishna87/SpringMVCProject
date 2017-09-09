package krishna.imcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import krishna.imcs.beans.Department;
import krishna.imcs.services.DepartmentService;

public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value="/department",method = RequestMethod.GET)
	public String departmentPage() {
		return "department";
	}
	@RequestMapping(value = "/findDepartment", method = RequestMethod.GET)
	public ModelAndView getDepartment(@RequestParam int deptNo) {
		Department dept = departmentService.getDepartment(deptNo);
		ModelAndView model = new ModelAndView("Department");
		if (null != dept) {
			model.addObject("department",dept);
			
		} else {
			model.addObject("msg", "Department not found with given Id : "+deptNo);
			model.addObject("department", null);
		}
		return model;
	}

}
