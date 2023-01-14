package com.assignment5;



import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment5.model.Employee;
import com.assignment5.services.EmployeeService;



@RestController
public class MyController {

	EmployeeService empser = new EmployeeService();
	@PostMapping("/saveEmployee")
	
	   public Map<Long,Employee>  saveEmployee(@RequestBody Employee es){
	      Employee e =new Employee();
	      e.setId(es.getId());
	      e.setName(es.getName());
	      e.setLocation(es.getLocation());
	      e.setEmail(es.getEmail());
	      
         return empser.putEmployee(e);
	      
}
	@GetMapping("/displayAll")
	public  Map<Long,Employee> getEmployee(){
	      
		return empser.getEmployee();
		
}
	
	@GetMapping("/displayById/{id}")
	public  Employee getEmployeeById(@PathVariable("id") Long id){
	      
		return empser.getEmployeeById(id);
		
}
	@PutMapping("/update")
	public Map<Long,Employee> updateEmployee(@RequestBody Employee es){
	      
		   
	      return empser.updateEmployee(es);
}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") Long id){
	      
		   if(!empser.delete(id).equals(null)) {
			   return "deleted "+id;
		   }
		   else {
			   return "Not deleted";
		   }
	      
}
	
}