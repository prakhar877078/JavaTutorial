package sdet;

// 4 types
//1. No return type and No argument
//2. No return type but arguments will be there
//3. return type but no arguments
//4. With both return type and arguments
public class MethodsInJava {
	
	int a;
	int b;
	//no return type and no argument
	void m1() {
		System.out.println("This is a method containing no return type "
				+ "and no arguments");
	}
	
	//no return type but contains argument
	void m2(int c, int d) {
		a=c;
		b=d;
		System.out.println("This is a method containing no return type "
				+ "but contains arguments");
		System.out.println(a+b);
	}
	
	//return type but no arguments
	int m3() {
		return a+b;
	}
	
	//with return type and arguments both
	int m4(int c, int d) {
		a=c;
		b=d;
		return a+b;
	}

	public static void main(String[] args) {
		
		MethodsInJava mj1 = new MethodsInJava();
		mj1.m1();
		mj1.m2(1, 2);
		System.out.println(mj1.m3());
		System.out.println(mj1.m4(3, 4));

	}

}
