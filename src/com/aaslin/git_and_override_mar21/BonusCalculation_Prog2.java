/*2>Employee Inheritance Override: Create a superclass Employee with attributes name and salary, 
and a method calculateBonus() that returns 0.
Then, create a subclass Manager that extends Employee and 
overrides the calculateBonus() method to return 10%of the salary. 
Similarly, create another subclass Engineer that overrides 
the calculateBonus() method to return 5% of the salary. 
Test this hierarchy by creating instances of Manager and Engineer, 
setting their salaries, and calling the calculateBonus() method to ensure the correct bonus calculation.*/

package com.aaslin.git_and_override_mar21;

import java.util.*;

class Employee {
	String name;

	double salary;

	public int calculateBonus(String name, double sal) {
		return 0;
	}

}

class Manager extends Employee {
	String name;

	/*
	 * @author Nikhila
	 * 
	 * @params String,double
	 * 
	 * @return int
	 */
	@Override
	public int calculateBonus(String name, double salary) {
		double s = 0.10 * salary; // calculating 10% of the salary

		return (int) s;

	}

}

class Engineer extends Employee {
	String name;

	/*
	 * @author Nikhila
	 * 
	 * @params String,double
	 * 
	 * @return int
	 */

	@Override
	public int calculateBonus(String name, double salary) {
		double s = 0.05 * salary;

		return (int) s;
	}

}

public class BonusCalculation_Prog2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter '0' to get the Bonus salary details of manager\n"
				+ "please enter '1' to get the Bonus salary details of engineer:");

		int salCheck = sc.nextInt();

		if (salCheck == 0) {

			Manager manager = new Manager();

			System.out.println("please enter your name:");

			String name = sc.next();

			System.out.println("please enter your salary to get the bonus:");

			int salary = sc.nextInt();

			int bonus = manager.calculateBonus(name, salary);

			System.out.println("Calculated bonus for " + name + " is : " + bonus + "/-");

		}

		else if (salCheck == 1) {
			Engineer engineer = new Engineer();

			System.out.println("please enter your name:");

			String name = sc.next();

			System.out.println("please enter your salary to get the bonus:");

			int salary = sc.nextInt();

			int bonus = engineer.calculateBonus(name, salary);

			System.out.println("Calculated bonus for " + name + " is : " + bonus + "/-");

		}

		else {
			System.out.println("No bonus initiated.");
		}

	}

}
