package com.suraj.practice.dsa.oop;

public class SingletonClass {
	
	//construct Private constructor
	private SingletonClass() {
		
	}
	
	//construct private variable that refer to same object
	private static SingletonClass singletonClass;
	
	public static SingletonClass getInstance() {
		if(singletonClass==null)
		singletonClass = new SingletonClass();
		
		return singletonClass;
	}

}
