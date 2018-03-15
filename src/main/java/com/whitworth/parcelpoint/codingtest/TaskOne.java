/**
 * 
 */
package com.whitworth.parcelpoint.codingtest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Lee Whitworth
 *
 */
public class TaskOne {
	
	
	@SuppressWarnings("resource")
	public static void main (String args[]) {
		
		String sortOption;
		Employee employee1 = new Employee("Lee", "Whitworth", 26);
		Employee employee2 = new Employee("John" , "Amith", 21);
		Employee employee3 = new Employee("Sarah", "Connor", 47);
		
		System.out.println("Sort by?... Enter either 'lastName' or 'age'");
		
		Scanner scanner = new Scanner(System.in);
		sortOption = scanner.nextLine();
		Comparator<Employee> comparator = ComparatorFactory.getComparator(sortOption);
		
		TreeSet<Employee> employeeSet = new TreeSet<Employee>(comparator);
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
	
		
		for (Employee employee: employeeSet){
			System.out.println(employee);
		}
		
	}

	
	

}
