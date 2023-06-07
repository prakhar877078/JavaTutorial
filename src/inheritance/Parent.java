package inheritance;
//there are three types of inheritance in Java
//1. Single Inheritance
//2. Multilevel Inheritance
//3. Hierarchical Inheritance

//Single Inheritance
public class Parent extends Child{
	
	int bonous = 10000;

	public static void main(String[] args) {

		Parent p = new Parent();
		System.out.println(p.salary);
		System.out.println(p.bonous);

	}

}
