/**
 * 
 */
package com.whitworth.parcelpoint.codingtest;

import java.util.Comparator;

/**
 * @author Lee Whitworth
 *
 */
public class ComparatorFactory {
	
	/**
	 * Returns comparator based on option
	 * @param option
	 * @return
	 */
	public static Comparator<Employee> getComparator(String option){
		
		// Sort by last name
		if (option.equalsIgnoreCase("lastName")) {

			final Comparator<Employee> lastNameComparator = new Comparator<Employee>() {
				public int compare(Employee e1, Employee e2) {
					return e1.getLastName().compareTo(e2.getLastName());

				}
			};

			return lastNameComparator;

		}
		
		// Sort by age by default
		else {
		
		final Comparator<Employee> ageComparator = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if (e1.getAge() > e2.getAge()) {
					return 1;
				} else if (e1.getAge() < e2.getAge()) {
					return -1;
				} else {
					return 0;
				}

			}
		};
		
		return ageComparator;
		
		}
	}

}
