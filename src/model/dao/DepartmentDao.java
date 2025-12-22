package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	// Insert department
	void insert(Department dep);
	// Update department
	void update(Department dep);	
	// Delete department by id
	void deleteById(Integer id);	
	// Find department by id 
	Department findById(Integer id);
	
	List<Department> findAll();
	
}
