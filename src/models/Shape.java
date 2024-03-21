/*
 * 1.Pojo Equality: Create a Pojo(Plain Old Java Object) Shape.  
 * Create a HashSet and store the unique Pojo in the application.
 *  Use Override methods to do this.
 */
package models;

import java.util.*;

//This is a pojo class 
public class Shape {

	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @author Nikhila
	 * 
	 * @params Object
	 * 
	 * @return boolean
	 */

	@Override
	public boolean equals(Object o) { // Object class equals() method is overridden
		if (this == o) // checks if the obj1 and obj2 are equals means in the same memory
						// this represents the obj1 and o represent the obj2 in case of 2 objects.
			return true;

		if (o == null || getClass() != o.getClass()) // checks if the obj2 is null or belongs to the same class or not
			return false; // if not returns false

		Shape shape = (Shape) o; // casting the obj2-->"o" (reference of the obj2 is in generic type of Object
									// class so we need to cast it to Shape class)

		return name != null ? name.equals(shape.name) : shape.name == null; // comparing with name or value of that
																			// object.
	}

	/*
	 * @return int
	 */

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0; // creating a hashcode() using name of the current object in order to
													// store at that generated hashcode() which determines the index of
													// hash table.

	}

}
