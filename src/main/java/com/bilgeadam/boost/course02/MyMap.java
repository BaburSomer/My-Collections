package com.bilgeadam.boost.course02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> values       = new HashMap<Integer, String>();
		Map<Integer, String> linkedValues = new LinkedHashMap<Integer, String>();
		Map<Integer, String> tableValues  = new Hashtable<Integer, String>();

		values.put(1, "1. Değer");
		values.put(2, "2. Değer");
		values.put(3, "3. Değer");
		values.put(3, "4. Değer");
		
		linkedValues.put(1, "1. Değer");
		linkedValues.put(2, "2. Değer");
		linkedValues.put(3, "3. Değer");
		linkedValues.put(3, "4. Değer");
		
		tableValues.put(1, "1. Değer");
		tableValues.put(2, "2. Değer");
		tableValues.put(3, "3. Değer");
		tableValues.put(3, "4. Değer");
		
		System.out.println(values.get(3));
		
		Collection<String> linkedValuesValues = linkedValues.values();
		for (Iterator<String> strings = linkedValuesValues.iterator(); strings.hasNext();) {
			System.out.println(strings.next());
		}
		
		Set<Entry<Integer, String>>  keysAndValues =  tableValues.entrySet();
		for (Iterator<Entry<Integer, String>> keyAndValues = keysAndValues.iterator(); keyAndValues.hasNext();) {
			 System.out.println(keyAndValues.next());
		}
		
		Set<Entry<Integer, String>>  mapKeysAndValues =  values.entrySet();
		for (Iterator<Entry<Integer, String>> mapKeyAndValues = mapKeysAndValues.iterator(); mapKeyAndValues.hasNext();) {
			System.out.println(mapKeyAndValues.next());
		}
	}
}
