/**
 * 
 */
package com.whitworth.parcelpoint.codingtest;

/**
 * @author Lee Whitworth
 *
 */
public class Employee {
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Employee(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}
	
	

}
