package casting_refferenced_datatypes_widening_overriding;

public class Show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One one=new Two();
		One one1=(One) new Two();// both are same
		one.show1();
		one1.show1();
		
	}

}
