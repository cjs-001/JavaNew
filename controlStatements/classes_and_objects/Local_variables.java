package classes_and_objects;

public class Local_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ex2 we=new ex2();
		we.display(0);
		we.check();
	}

}

class ex2{
	
    int x=10;
	void display(int a)
	{
		x=a;
	}
	
	void check()
	{
		System.out.println(x);
		//System.out.println(a); here int a cannot be accessible because it is local variable
	}
}
