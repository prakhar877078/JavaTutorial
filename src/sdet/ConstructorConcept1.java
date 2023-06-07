package sdet;

//1. Constructor Name will be same as class name
//2. A Constructor must not have explicit return type.
//3. A Java constructor cannot be abstract, static, final, and synchronized
//4. we can have private, protected, public or default constructor in Java.

// there are two types of constructor
//1. Default Constructor
//2. Parameterized Constructor

public class ConstructorConcept1 {
	
	int id;
	String name;
	
	//Default Constructor
	public ConstructorConcept1() {
		System.out.println("This is a default constructor");
	}
	
	//Parameterized Constructor
	public ConstructorConcept1(int i, String n) {
		id = i;
		name = n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
     
		ConstructorConcept1 c1 = new ConstructorConcept1();
		ConstructorConcept1 c2 = new ConstructorConcept1(1, "Prakhar");
		c2.display();

	}

}
