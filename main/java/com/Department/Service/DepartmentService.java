package com.Department.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.Department.Entity.Department;
import com.Department.Repository.DepartmnetRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmnetRepository departmentrepository;

	public Department saveDepartment(Department department) {

		return departmentrepository.save(department);
	}

	public List<Department> fetchDepartment() {
		
		return departmentrepository.findAll();
	}

	public Department fetchDepartmentById(int Id) {
		return departmentrepository.findById(Id).get();
	}

	public void deleDepartmentById(Integer id) {
		departmentrepository.deleteById(id);
	}

	public Department UpdateDepartment(Integer id, Department department) {
		
		return departmentrepository.save(department);
		
	}


}
