/*1>Pojo Equality: Create a Pojo(Plain Old Java Object) Shape. 
Create a HashSet and store the unique Pojo in the application. 
Use Override methods to do this.*/

package com.aaslin.git_and_override_mar21;

import java.util.*;

import models.Shape;

/*
 * @author Nikhila
 */
public class ShapePojoEquality_Prog1 {

	public static void main(String[] args) {

		Set<Shape> shapes = new HashSet<Shape>();

		Shape circle = new Shape("circle");

		Shape square = new Shape("square");

		Shape rectangle = new Shape("rectangle");

		Shape circle1 = new Shape("circle");

		Shape rectangle1 = new Shape("rectangle");

		shapes.add(circle);

		shapes.add(square);

		shapes.add(rectangle);

		shapes.add(circle1); /*
								 * this shouldn't be added to the hashset as the circle object and circle1
								 * object has same value/string in it.
								 */
		shapes.add(rectangle);

		for (Shape s : shapes) {
			System.out.println(s.getName() + "\t"); /*
													 * we cant get the name of shape class as it is declared private so
													 * we class the method that returns the name
													 */
		}

	}

}
