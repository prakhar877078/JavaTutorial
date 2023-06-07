package sdet;

//Constructor Overloading

//A Class containing more than one constructor with difference 
//in the number of parameters or types of parameters.



public class ConstructorConcept2 {
	
	int id;
	String name;
	int roll;
	
	ConstructorConcept2(int i, String n){
		id = i;
		name = n;
	}
	
	ConstructorConcept2(int i, String n, int r){
		id = i;
		name = n;
		roll = r;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+roll);
	}

	public static void main(String[] args) {

		ConstructorConcept2 c2 = new ConstructorConcept2(1, "Prakhar");
		ConstructorConcept2 c3 = new ConstructorConcept2(1, "Prakhar", 321);
		c2.display();
		c3.display();

	}

}
