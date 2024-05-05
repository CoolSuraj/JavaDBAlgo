package com.suraj.practice.dsa.oop;

public class Main {
	
	public static void main(String[] args) {
		//Singleton Class
		SingletonClass obj1 = SingletonClass.getInstance();	
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println(2000_0+5); // this is 
		System.out.println(obj1);
		System.out.println(obj2);
		
		//anonymous class 
		Polygon poly = new Polygon() {
			//creation of anonymous class extending class Polygon
//			Anonymous classes usually extend subclasses or implement interfaces.
//
//			Here, Type can be
//
//			a superclass that an anonymous class extends
//			an interface that an anonymous class implements
			int c =10;
			public void dance() {
				System.out.println("Dancing");
			}
			public void message() {
				System.out.println("Inside anonymous class "+c);
				dance(); //you can call dance here
			}
		};
		
//		poly.dance(); //cannot access dance 
		poly.message();
		
		AnonymousIn anObj = new AnonymousIn() {
			
			@Override
			public void inMessage() {
				System.out.println("call Me!! " + Colors.BLACK+ " "+Colors.BLACK.getDefaultOrNot());
				
			}
		};
		anObj.inMessage();
		
		
	
	
	
	
	
	}
	

}
