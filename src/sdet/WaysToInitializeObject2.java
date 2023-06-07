package sdet;

//using method

public class WaysToInitializeObject2 {
	
	int id;
	String name;
	
	void insertRecord(int i, String n) {
		id =i;
		name = n;
		
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {

		WaysToInitializeObject2 w2 = new WaysToInitializeObject2();
		w2.insertRecord(101, "Prakhar");
		w2.display();
		
	}

}
