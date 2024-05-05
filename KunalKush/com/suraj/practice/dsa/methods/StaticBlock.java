package com.suraj.practice.dsa.methods;

public class StaticBlock extends B{
	 
static{
 
    System.out.println("main static block");
    }
 
 
    public static void main(String []args){
 
    System.out.println("--------0");
 
    System.out.println(A.x);//line 1
 
    System.out.println("--------1");
 
 
    A a = new A();//line 2
 
    System.out.println("--------2");
 
    B b = new B();//line 3
 
    System.out.println("--------3");
 
    C c = new C();//line 4
 
    C c1 = new C();//line 5
 
        }
    }
 
 
 
class A{
 
 
    static int x;
 
    A(){System.out.println("A constructor ran.");}
 
    {
 
        System.out.println("Object of A created!");
    }
 
 
    static{
 
        System.out.println("Static block of A executed");
    }
 
    }
 
 
 
class B{
 
        static int y;
 
        B(){System.out.println("B constructor ran.");}
 
        {
 
            System.out.println("Object of B created!");
        }
 
 
        static {
 
              System.out.println("Static block of B executed");
        }
 
    }
class C{
	 
	 
    static{

        System.out.println("Static block of C executed");

        }


    } 
