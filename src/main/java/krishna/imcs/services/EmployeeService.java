package krishna.imcs.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import krishna.imcs.beans.Employee;

@Service
public class EmployeeService implements EmployeeRESTInterface {
	
	final String uri = "http://localhost:8080/SpringRESTful/Employee";

	@Autowired
	private RestTemplate restTemplate=new RestTemplate();


	private static String URL = "http://localhost:8080/RestController/employees";

	public List<Employee> displayall() {
	return (List<Employee>) restTemplate.getForObject(uri, Employee.class);
	}


	public Employee createEmployee(Employee emp) {
	HttpEntity<Employee> request = new HttpEntity<>(emp);
	boolean flag=restTemplate.postForObject(uri, request ,Boolean.class);
	
	return flag?emp:null;
	}
    
	
	public Employee updateEmployee(Employee emp) {
	HttpEntity<Employee> request = new HttpEntity<>(emp);
	ResponseEntity<Employee> res=  restTemplate.exchange(uri, HttpMethod.PUT, request, Employee.class);
	return res.getBody();
	}
	
	public void deleteEmployee(int empId) {
	String entityUrl = uri + "/" + empId;
	restTemplate.delete(entityUrl);

	}

	public Employee findEmployee(int empId) {
		ResponseEntity<Employee> response=restTemplate.getForEntity(uri+"/"+empId, Employee.class);
		if(response.getBody()==null){
			return null;
		}
		return response.getBody();
	}

	

	
}
