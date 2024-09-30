package classes_and_objects;

public class This_keyword2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			this2 asd = new this2();
			
		
		}

}

class this2{
	
	 int a;
	 
	this2() {
		this(25);
		this.check();
	}
	
	this2(int a)
	{
		this.a=a;
	}
	

	
	 void check()
	{
		System.out.println(a);
	}
}


