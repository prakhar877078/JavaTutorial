package inheritance;

public class Multilevel extends Parent1{

	int bonous = 10000;
	public static void main(String[] args) {
       
		Multilevel m1 = new Multilevel();
		System.out.println(m1.salary);
		System.out.println(m1.increment);
		System.out.println(m1.bonous);

	}

}
