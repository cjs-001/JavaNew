package object_cloning;

public class Display {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		ClassA a1= new ClassA(2, "charan");
		
		a1.check();
		System.out.println(a1.hashCode());

		ClassA a2=  (ClassA) a1.clone();
		
		a2.check();
		System.out.println(a2.hashCode());
	}

}
