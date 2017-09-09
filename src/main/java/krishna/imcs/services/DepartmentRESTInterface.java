package krishna.imcs.services;

import org.springframework.stereotype.Service;

import krishna.imcs.beans.Department;

@Service
public interface DepartmentRESTInterface {

	public Department getDepartment(int deptNo);
	
}
