package classes_and_objects;

public class This_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		this1 asd = new this1(3);
		asd.check();
	
	}

}

class this1{
	
	 int a;
	
	this1(int a)
	{
		this.a=a;
	}
	

	
	 void check()
	{
		System.out.println(a);
	}
}
