package custom;
import java.util.*;
/*
 * @author Nikhila
 */

public class CustomMap<key,value> implements Map<key,value>{
	
	List<Entry<key,value>> entries = null;
	
	public void customMap()
	{
		entries = new ArrayList<Entry<key,value>>();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		entries.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Entry<key, value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public value get(Object key) {        //custom method written
		value v = null;
		
		for(Entry<key,value> entry : entries)
			if(Objects.equals(entry.getKey(), key))
			{
				return entry.getValue();
			}
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<key> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public value put(key key, value value) { //custom method written
		// TODO Auto-generated method stub
		value v = null;
		for(Entry<key, value> entry : entries)
			if(Objects.equals(entry.getKey(),key))
			{
				v = entry.getValue();
				entry.setValue(value);
				return v;
				
			}
		
		entries.add(new AbstractMap.SimpleEntry<>(key, value));
			
		
		return null;
	}

	@Override
	public void putAll(Map<? extends key, ? extends value> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public value remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return entries.size();
	}

	@Override
	public Collection<value> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
