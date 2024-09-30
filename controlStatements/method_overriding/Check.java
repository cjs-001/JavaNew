package method_overriding;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA asd = new ClassB();
		
		asd.display(0);
		
		ClassB asd1 = new ClassB();
		asd1.display(0);
		
		
		ClassA asd2 = new ClassA();
		asd2.display(0);
	}

}
