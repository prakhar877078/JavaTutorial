package sdet;

//A class is a user defined data type which 
//contains pre-defined data types and methods.

//public class ClassName{

//}

//object is an instance of class which has similar state and behaviour as class.

//e.g. Furniture is a class and Table, Chair is an object.

public class StudentClass {

	int id;
	String name;
	int rollno;
	
	public static void main(String[] args) {

		StudentClass Sc1 = new StudentClass();
		System.out.println(Sc1.id);
		System.out.println(Sc1.name);
		System.out.println(Sc1.rollno);

	}

}
