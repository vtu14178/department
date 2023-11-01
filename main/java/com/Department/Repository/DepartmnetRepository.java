package com.Department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Department.Entity.Department;

@Repository
public interface DepartmnetRepository extends JpaRepository<Department, Integer> {
	
	

}
