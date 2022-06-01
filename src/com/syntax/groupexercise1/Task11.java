package com.syntax.groupexercise1;

public class Task11 {
	/*
	 * Write a program to print out duplicate elements from an Array of Strings
	 */

	String[] musicians = { "Vivaldi", "Mozart", "Haydn", "Bethoven", "Vivaldi", "Bach", "Paganini", "Mozart",
			"Schubert", "Bach", "Bethoven", "List" };
	
	System.out.println("Duplicate elements:");

	int ind = 0;
	for (int i = 0; i < musicians.length - 1; i++) {
		for (int j = i + 1; j < musicians.length; j++) {
			if (musicians[i].equals(musicians[j])) {
				System.out.println(musicians[i]);
			}
		}
	}
	
	System.out.println("------------------------------");

	String[] musicians1 = { "Vivaldi", "Mozart", "Haydn", "Bethoven", "Bach", "Vivaldi", "Bach", "Paganini",
			"Mozart", "Schubert", "Bach", "Bethoven", "List" };

	int ind1 = 0;
	for (int i = 0; i < musicians1.length - 1; i++) {
		if (ind1 == 0 || i != ind1) {
			for (int j = i + 1; j < musicians1.length; j++) {
				if (musicians1[i].equals(musicians1[j])) {
					ind1 = j;
					System.out.println(musicians1[i]);
					break;
				}
			}
		}
	}
}

}
