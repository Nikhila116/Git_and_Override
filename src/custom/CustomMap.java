package custom;

import java.util.*;
/*
 * @author Nikhila
 */

public class CustomMap<key, value> implements Map<key, value> {

	List<Entry<key, value>> entries = null;

	public CustomMap() {
		entries = new ArrayList<Entry<key, value>>();
	}

	@Override
	public void clear() {
		entries.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	@Override
	public Set<Entry<key, value>> entrySet() {
		return null;
	}

	/*
	 * custom implementation of getting value using key.
	 */

	@Override
	public value get(Object key) {
		// value v = null;

		for (Entry<key, value> entry : entries)
			if (Objects.equals(entry.getKey(), key)) {
				return entry.getValue();
			}

		return null;
	}

	@Override
	public boolean isEmpty() {
		entries.isEmpty();
		return false;
	}

	@Override
	public Set<key> keySet() {
		return null;
	}

	/*
	 * custom implementation of storing key and value pair in a map using put
	 * method.
	 */

	@Override
	public value put(key k, value v) {
		for (Entry<key, value> entry : entries)
			if (Objects.equals(entry.getKey(), k)) {
				value v1 = entry.getValue();
				entry.setValue(v1);
				return v1;

			}

		entries.add(new AbstractMap.SimpleEntry<>(k, v));
		return null;

	}

	@Override
	public void putAll(Map<? extends key, ? extends value> m) {

	}

	@Override
	public value remove(Object key) {
		return null;
	}

	@Override
	public int size() {
		return entries.size();
	}

	@Override
	public Collection<value> values() {
		return null;
	}

	/*
	 * custom implementation of getting a key using value.
	 */
	public key getKey(Object v) {
		for (Entry<key, value> entry : entries)
			if (Objects.equals(entry.getValue(), v))

				return entry.getKey();

		return null;

	}

}
