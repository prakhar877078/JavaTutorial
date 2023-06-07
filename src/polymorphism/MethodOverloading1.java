package polymorphism;

//By Changing data type of arguments
public class MethodOverloading1 {
	
	int sum(int a, int b) {
		return (a+b);
	}
	
	double sum(double a, double b) {
		return (a+b);
	}

	public static void main(String[] args) {

		MethodOverloading1 m1 = new MethodOverloading1();
		System.out.println(m1.sum(2, 9));
		System.out.println(m1.sum(3.5, 9.0));

	}

}
