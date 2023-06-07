package sdet;
//1. By reference variable
//2. By Method
//3. By Constructor


//By Reference Variable
public class WaysToInitializeObject {

	int id;
	String name;
	public static void main(String[] args) {

		WaysToInitializeObject w1 = new WaysToInitializeObject();
		w1.id = 101;
		w1.name = "Prakhar";
		
		System.out.println(w1.id+" "+w1.name);
		
		
	}

}
