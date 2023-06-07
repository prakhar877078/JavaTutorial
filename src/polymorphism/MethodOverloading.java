package polymorphism;

//If a class is having multiple methods with same name but difference in the number 
//of parameters it is known as method overloading

//There are two ways to overload a method
//1. By difference in number of parameters / arguments
//2. By changing the data type

//By changing number of arguments
public class MethodOverloading {
	
	int sum(int a, int b) {
		return (a+b);
	}

	int sum(int a, int b, int c) {
		return (a+b+c);
	}

	public static void main(String[] args) {

		MethodOverloading m1 = new MethodOverloading();
		System.out.println(m1.sum(2, 3));
		System.out.println(m1.sum(2, 3, 4));	
	}

}
