package abstraction;

public class Student{  
	//private data member  
	private String name;  
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name; 
	}  
	
	public static void main(String [] args) {
		Student s1 = new Student();
		s1.setName("Prakhar");
		System.out.println(s1.getName());
	}
	
	}  