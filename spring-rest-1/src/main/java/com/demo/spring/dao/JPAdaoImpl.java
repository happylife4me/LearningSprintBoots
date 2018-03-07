package com.demo.spring.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class JPAdaoImpl implements Dao {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	@Transactional
	public String save(Employee e) {
		em.persist(e);
		return e.getEmpId() + " saved in data base";
	}

	@Override
	public String deleteEmp(int empId) {
		//em.remove(empId);
		return empId + " removed in data base";
	}

	@Override
	public List<Employee> listAllEmployee() {
		Query qry = em.createQuery("select o from Employee o");
		List<Employee> emps = qry.getResultList();
		return emps;
		//return null;
	}

	@Override
	public Employee getEmployeeById(int empid) {
		Employee e = em.find(Employee.class,empid);
		return e;
	}

	@Override
	public String saveList(List<Employee> emps) {
		return null;
	}

}
