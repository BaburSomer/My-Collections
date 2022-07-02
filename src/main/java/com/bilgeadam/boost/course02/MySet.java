package com.bilgeadam.boost.course02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import static java.lang.Math.*;  // java.lang kütüphanesindeki Math sınıfının tüm yöntemlerini static olarak kullanmak için
import static java.util.Collections.*;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> integers       = new HashSet<Integer>();
		Set<Integer> linkedIntegers = new LinkedHashSet<Integer>();
		
		integers.add(1);
		integers.add(1);
		integers.add(1);
		integers.add(2);

		for (Integer integer : integers) {
			System.out.println(integer);
		}
		
		System.out.println(PI);
		cos(12.5);
		
		System.out.println(EMPTY_MAP);
	}
}
