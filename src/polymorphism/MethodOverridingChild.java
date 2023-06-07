package polymorphism;

//If subclass (child class) has the same method as declared in the parent class, 
//it is known as method overriding in Java. 

//It is used for Run Time Polymorphism
//The method must have same name as in parent class.
//The method must have same parameter as in parent class.
//Class must be in inheritance relation.

public class MethodOverridingChild {

	void run(){
		System.out.println("Vehicle is running");
	}
}
