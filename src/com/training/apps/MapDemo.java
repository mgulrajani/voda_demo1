package com.training.apps;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.training.model.Employee;

public class MapDemo {

	public static void main(String[] args) {
		Employee e1 =  new Employee(111, "Kailash", 4000000, LocalDate.now().minusYears(2));
		Employee e2=  new Employee(112, "Shivangi", 4400000, LocalDate.now().minusYears(1));
		Employee e3 =  new Employee(113, "Ganesha", 2400000, LocalDate.now().minusMonths(2));
		Employee e4 =  new Employee(114, "Kartik", 2400000, LocalDate.now().minusDays(2));
		Employee e5 =  new Employee(115, "Shiva", 5000000, LocalDate.now().minusYears(4));
		
		Map<Employee,Double> map=new HashMap<>();
		
		map.put(e1, e1.getSalary()*12);
		map.put(e2, e2.getSalary()*12);
		map.put(e3, e3.getSalary()*12);
		map.put(e4, e4.getSalary()*12);
		map.put(e5, e5.getSalary()*12);
		
		for(Entry<Employee, Double> set :map.entrySet()) {
			System.out.println(set.getKey().getName()+"annual salary is "+set.getValue());
		}
		
		
	}
}
