package com.suraj.practice.dsa.methods;

import java.util.ArrayList;
import java.util.List;

public class FunctionsMethods1 {
	public static void main(String[] args) {
		//pass By Value -- Java Is Always Pass By Value
		int a,b;
		a=10 ;
		b=20;
		swap(a,b);
		
		//for Strings as they are immutable
		String str = "name";
		greet(str);
		
		//for objects and references
		List<Integer> li = new ArrayList<>();
		li.add(3);
		li.add(30);
		li.add(300);
		li.add(3000);
		li.add(30000);
		
		remove300(li);  //Now Object Reference is passed
		System.out.println(li);
		
		remove300("Created overloading method");
	}
	/**
	 * same name but diiferent type of params or number of params leads to method overloading
	 * @param string
	 */
	private static void remove300(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}
	/**
	 * This is example to show pass by copy of reference
	 * @param list
	 */
	private static void remove300(List<Integer> list) {
		//list will have copy of reference to li
		//but as it is pointing to same List 
//		if it remove the element, will impact orignal list(li)
		list.remove(2);
		
	}

	private static void greet(String naam) {
//		Currently both naam & str will point to "name" in String heap
		naam="Kolhapur"; //this will make naam point to new String 
		
		
	}

	private static void swap(int num1, int num2) {
		//this Num1 & Num2 will get copy of a & b respectively so orignal values will not get changed
		int temp = num1;
		num1 =num2;
		num2=temp;
		
		
	}

}
