package krishna.imcs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import krishna.imcs.beans.Employee;

@Service
public interface EmployeeRESTInterface {
	
	public List<Employee> displayall();
	
	public Employee createEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	public void deleteEmployee(int empId);
	
	public Employee findEmployee(int empId);

}
