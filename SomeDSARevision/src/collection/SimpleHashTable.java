package collection;

import pojo.Employee;
import pojo.StoredEmployee;

public class SimpleHashTable {
	private StoredEmployee[] hashtable;// in this we are storing key in this object

	public SimpleHashTable() {
		hashtable = new StoredEmployee[10];
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length; // this is not a great hash function but the simpler version
	}

	private int findKey(String key) {
		int hashedKey = hashKey(key);
		if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {

		} else {

			// linear probing
			int stopIndex = hashedKey;
			if (hashedKey == hashtable.length - 1) {
				hashedKey = 0;
			} else {
				hashedKey++;
			}
			while (!hashtable[hashedKey].key.equals(key) && hashedKey != stopIndex && hashtable[hashedKey] != null) {
				hashedKey = (hashedKey + 1) % hashtable.length;

			}

			if (hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)) {
				
			}else {
				return -1;
			}
		}
		return hashedKey;

	}

	public void put(String key, Employee emp) {
		int index = hashKey(key);
		if (occupied(index)) {
			// linear probing
			int stopIndex = index;
			if (index == hashtable.length - 1) {
				index = 0;
			} else {
				index++;
			}
			while (occupied(index) && index != stopIndex) {
				index = (index + 1) % hashtable.length;
				if (occupied(index)) {
					continue;
				} else {

					break;
				}
			}
		}

		if (!occupied(index)) {

			hashtable[index] = new StoredEmployee(key, emp);

		} else
			System.out.println("sorry we have collision here we have the value already for this key");
	}

	boolean occupied(int index) {
		// TODO Auto-generated method stub

		return hashtable[index] != null;
	}

	public Employee get(String key) {
		int Hashkey = findKey(key);
		if (Hashkey == -1)
			return null;
		return hashtable[Hashkey].getEmp();

	}

	public Employee remove(String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) {
			return null;
		} else {
			Employee deleted = hashtable[hashedKey].getEmp();
			//hashtable[hashedKey] = null; //this is an easy solution but linear probing will give us issue so we will use different approach
			StoredEmployee[] oldHashTable = hashtable;
			
			hashtable = new StoredEmployee[oldHashTable.length];
			for(int i=0;i<oldHashTable.length;i++) {
				if(oldHashTable[i]!=null) {
					put(oldHashTable[i].key, oldHashTable[i].emp);
				}
			}
			return deleted;
		}
	}

	public void printHashTable() {
		if (hashtable.length != 0) {
			for (int i = 0; i < hashtable.length; i++) {
				StoredEmployee emp = hashtable[i];
				if (emp == (null)) {
					// removing null from array to be printed
				} else {
					System.out.println(i + " " + emp.getKey() + " " + emp.getEmp()); // i is the position in array
				}
			}
		}
	}

}
