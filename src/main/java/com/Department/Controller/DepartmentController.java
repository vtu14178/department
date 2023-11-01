package com.Department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Department.Entity.Department;
import com.Department.Service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
private DepartmentService departmentservice;
	
	@PostMapping("/DepartmentList")
     public Department saveDepartment(@RequestBody  Department department)
     {
		return departmentservice.saveDepartment(department);
		
     }
	@GetMapping("/DepartmentList")
	public  List<Department> fetchDepartment()
	{
		return departmentservice.fetchDepartment();
	}
	
	@GetMapping("/DepartmentList/{id}")
	public  Department fetchDepartmentById(@PathVariable("id") Integer Id)
	{
		return departmentservice.fetchDepartmentById(Id);
	}
    
	@DeleteMapping("/DepartmentList/{id}")
	
	public String deleDepartmentById(@PathVariable("id") Integer Id)
	{
		departmentservice.deleDepartmentById(Id);
		return "deleted Successfully";
	}
	
	@PutMapping("/DepartmentList/{id}")
	public Department UpdateDepartment(@PathVariable("id") Integer Id, @RequestBody Department department   )
	{
		return departmentservice.UpdateDepartment(Id,department);
		
	}
	
}
