package methods;

public class MethodOverloadin {

	public static void main(String[] args) {
		funcPrint();
		funcPrint(3);
		funcPrint(3,4);
		funcPrint("kunal"); 
	}

	private static void funcPrint(String string) {
		System.out.println(string);
		
	}

	private static void funcPrint(int i, int j) {
System.out.println(i+" "+j);		
	}

	private static void funcPrint(int a) {
		System.out.println(a);
	}

	private static void funcPrint() {
		System.out.println("no params");
	}

}
