package polymorphism;

//Static Method can't be overridden
//main method is also static hence, it can't be overridden.

public class MethodOverridingParent extends MethodOverridingChild {

	void run(){
		System.out.println("Vehicle is running safely");
	}
	
	
	public static void main(String[] args) {

		MethodOverridingParent m1 = new MethodOverridingParent();
		m1.run();
		

	}

}
