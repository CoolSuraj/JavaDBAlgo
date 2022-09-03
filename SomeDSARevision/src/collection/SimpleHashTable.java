package collection;

import java.util.Iterator;

import pojo.Employee;

public class SimpleHashTable {
	private Employee[] hashtable;

	public SimpleHashTable() {
		hashtable = new Employee[10];
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length; // this is not a great hash function but the simpler version
	}

	public void put(String key, Employee emp) {
		int index = hashKey(key);
		if (hashtable[index] == null)
			hashtable[index] = emp;
		else
			System.out.println("sorry we have collision here we have the value already for this key");
	}

	public Employee get(String key) {
		return hashtable[hashKey(key)];
	}

	public void printHashTable() {
		if (hashtable.length != 0) {
			for (int i = 0; i < hashtable.length; i++) {
				System.out.println(hashtable[i]);
			}
		}
	}

}