/*3>CustomMap Implementation: Create a class named 
 * CustomMap that implements the Map interface. 
 * Override the put() and get() methods to provide a custom implementation. 
 * The put() method should store the key-value pair in a custom data structure (e.g., a list or an array) 
 * and the get() method should retrieve the value associated with the given key from the custom data structure. 
 * Ensure that your implementation adheres to the contract defined by the Map interface. 
 * Test your CustomMap implementation by creating instances of CustomMap, adding key-value pairs, 
 * and retrieving values using the get() method.
 *  Also, ensure that your implementation handles edge cases such as handling null keys and values 
 *  appropriately. Additionally, you can write unit tests to verify the correctness of your implementation.
 */

package com.aaslin.git_and_override_mar21;

import custom.CustomMap;
import java.util.*;
import java.util.Map.Entry;

public class CustomMap_Prog3 {

	public static void main(String[] args) {
		CustomMap<String, Integer> customMap = new CustomMap<String, Integer>();

		customMap.put("Nikhila", 101);

		customMap.put("Raghavi", 102);

		customMap.put("Pranav", 103);

		System.out.println(customMap.get("Nikhila"));

	}

}
