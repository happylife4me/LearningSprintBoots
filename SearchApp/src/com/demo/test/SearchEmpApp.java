package com.demo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.test.model.Employee;

public class SearchEmpApp {

	public static void main(String[] args) {
		//Set<Employee> empSet = new HashSet<>();
		
		List<Employee> empSet = new ArrayList<>();
		
		empSet.add(new Employee(100, "Jagadeesh", "London", 50000));
		empSet.add(new Employee(101, "Jaga", "New york", 215000));
		empSet.add(new Employee(103, "Jaggu", "Markapur", 125000));
		empSet.add(new Employee(104, "Deesh", "Secunderabad", 25000));
		empSet.add(new Employee(105, "Esh", "Sitafalmandi", 25000));
		empSet.add(new Employee(106, "dssdfh", "Telagana", 25000));
		empSet.add(new Employee(107, "fdggeesh", "andhra", 2500));
		empSet.add(new Employee(108, "klfjgl", "Ongole", 2512000));
		empSet.add(new Employee(109, "kljklsdjlfs", "Giddlaur", 2500));
		empSet.add(new Employee(110, "546fgdfg", "podili", 25100));
		empSet.add(new Employee(111, "hnfgh56", "kanigiri", 2000));
		
		
		for(Employee e: empSet)
		{
			if (e.getSalary() > 40000)
			{
				System.out.println(e.getEmpId() + " " + e.getCity() + " " + e.getName() + " " + e.getSalary());
			}
		}
		
	}

}
