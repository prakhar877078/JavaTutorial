package encapsulation;

public class EncapsulationExample {
	
	private int num1;
	private int num2;
	
	public void setValue(int no1, int no2) {
		num1 = no1;
		num2 = no2;
	}
	
	public void getValue() {
		System.out.println(num1+" "+num2);
	}

	public static void main(String[] args) {

		EncapsulationExample E1 = new EncapsulationExample();
		E1.setValue(30, 21);
		E1.getValue();
    
	}

}
