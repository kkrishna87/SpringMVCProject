package krishna.imcs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import krishna.imcs.beans.Department;

@Service
public class DepartmentService implements DepartmentRESTInterface {

	@Autowired
	private RestTemplate restTemplate;
	
	private final String url="http://localhost:8080/SpringRESTful/department";

	@Override
	public Department getDepartment(int deptNo){
		ResponseEntity<Department> response=restTemplate.getForEntity(url+"/"+deptNo, Department.class);
		if(response.getBody()==null){
			return null;
		}
		return response.getBody();
	}
	

}
