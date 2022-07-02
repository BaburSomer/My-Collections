package com.bilgeadam.boost.course02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyDynamicList {

	public static void main(String[] args) {
		List<Integer> integers       = new ArrayList<Integer>();
		List<Integer> linkedIntegers = new LinkedList<Integer>();

		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		linkedIntegers.add(1);
		linkedIntegers.add(2);
		linkedIntegers.add(3);
		linkedIntegers.add(4);
		
		for (Integer integer : linkedIntegers) {
			System.out.println(integer);
		}
		
		System.out.println(integers.get(2));
		
		System.out.println(integers.hashCode());
		integers.add(5);
		System.out.println(integers.hashCode());
		System.out.println(integers.get(1).hashCode());
		
		
		/*
		 * while loop ile liste öğelerini işlemek istersem aşağıdaki yapıyı kullanmak gerekli
		 */
		Iterator<Integer> ints = integers.iterator();
		while (ints.hasNext()) {
			System.out.println(ints.next());
		}
		
		
	}
}
