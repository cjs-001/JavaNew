package casting_refferenced_datatypes_narrowing;

public class Show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		below code will throw error 
		
//		Two two = (Two) new One();
//		two.show1();
		
		One one = new Two();
		Two two = (Two) one;
		
		two.show1();
		two.show2();
		one.show1();
		
	}

}
