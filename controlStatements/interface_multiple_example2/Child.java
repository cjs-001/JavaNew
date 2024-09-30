package interface_multiple_example2;

public class Child implements Father,Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void height() {
		// TODO Auto-generated method stub
		
		System.out.println("Child height = "+(Father.ht+Mother.ht)/2);
	}

}
