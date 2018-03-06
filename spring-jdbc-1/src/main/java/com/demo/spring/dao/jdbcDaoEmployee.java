package com.demo.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class jdbcDaoEmployee implements Dao {

	@Autowired
	JdbcTemplate jt;
	
	
	
	@Override
	public String save(Employee e) {
		// TODO Auto-generated method stub
		int row = jt.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?)");
				pst.setInt(1, e.getEmpId());
				pst.setString(2, e.getName());
				pst.setString(3, e.getCity());
				pst.setDouble(4, e.getSalary());
				return pst;
			}
		});
		if (row == 0)
			return "Some unknow Exception";
		return "Employee " + e.getEmpId() + " Added into the Data Base";
	}

	@Override
	public String deleteEmp(int empId) {
		int row = jt.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con.prepareStatement("delete from emp where empno = " + empId);
				//pst.setInt(1, empId);
				/*pst.setString(2, e.getName());
				pst.setString(3, e.getCity());
				pst.setDouble(4, e.getSalary());*/
				return pst;
			}
		});
		if (row == 0)
			return "Some unknow Exception";
		return "Employee " + empId + " Deleted from DataBase";
	}

	@Override
	public List<Employee> listAllEmployee() {
		List<Employee> empList = jt.query("select * from emp",new RowMapper<Employee>(){
			
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
				Employee e = new Employee(rs.getInt("EMPNO") + 100,rs.getString("NAME"), rs.getString("address"), rs.getDouble("salary"));
				return e;
			}
		});
		
		
		/*int row = jt.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con.prepareStatement("select * from emp");
				pst.setInt(1, empId);
				pst.setString(2, e.getName());
				pst.setString(3, e.getCity());
				pst.setDouble(4, e.getSalary());
				return pst;
			}
		});
		if (row == 0)
			return "Some unknow Exception";
		return "Employee " + empId + " Deleted from DataBase";*/
		return empList;
	}

	@Override
	public Employee getEmployeeById(int empid) {
		Employee emp = null;
		try
		{
			emp = jt.queryForObject("select * from emp where empno =" + empid, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
				Employee e = new Employee(rs.getInt("EMPNO"),rs.getString("NAME"), rs.getString("address"), rs.getDouble("salary"));
				return e;
			}
		});
		}catch(Exception ex){
			System.out.println("No Emp Id " + empid);
			//System.out.println(ex.getMessage());
		}
		return emp;
	}

	@Override
	@Transactional
	public String saveList(List<Employee> emps) {
		for(Employee e : emps){
			save(e);
		}
		return "All Emp are saved in Data base";
	}
	
	

}
