package com.assignment5.services;

import java.util.*;



import com.assignment5.model.Employee;

public class EmployeeService {
 
	Map<Long, Employee> map = new HashMap<Long, Employee>();
	
	public Employee getEmployeeById(Long id){
	      
	      return map.get(id);
	     
	      
	   }
	
	public Map<Long, Employee> getEmployee(){
	      
	      
	     return map;
	      
	   }
	
	public Map<Long, Employee> putEmployee(Employee e){
		
	           map.put(e.getId(),e);
	      return map;
	      
	   }
	
	public  Employee delete(long id){
		
       return map.remove(id);
   
   }
	
	public Map<Long, Employee> updateEmployee(Employee e){
		
       
        map.replace(e.getId(),e);
   return map;
   
}
}
