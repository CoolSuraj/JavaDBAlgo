package com.suraj.practice.dsa.methods;
/**
 * Flow Of code 
 * 
 * first Static block always
 * @author admin
 *
 */


public class ProgramFlow {
	int p;
	static int q =10;
	
	{
		//block 2
		q++;
		System.out.println("Gulam");
		System.out.println(q);
	}
	
	{	
		//block 1
		q++;
	System.out.println("Gulam 2");
	System.out.println(q);
		System.out.println("NanaChi Tang");
	}

	public static void main(String[] args) {
		int n = 5;
		//q=60;
		q++;
		System.out.println(q);
	//	ProgramFlow fib = new ProgramFlow(); //due to this above two blocks are called 
		System.out.println("Pradhan");
		//ProgramFlow fib2 = new ProgramFlow(); //again object is created so it will call above blocks again
		fibonachi(n);
		
		ProgramFlow[] fib3 = new ProgramFlow[4];
		fib3[0] = new ProgramFlow();
		fib3[0].p=77;
		System.out.println(fib3[0].p);
		
	}

	private static int fibonachi(int n) {
		//method body
		System.out.println("Aikka");
		q++;
		System.out.println(q);
		return 0;
	}

	
	
	
	static {
		//static block
		q++;
		System.out.println("Raja");
	}

}
