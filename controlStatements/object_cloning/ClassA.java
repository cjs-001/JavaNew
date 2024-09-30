package object_cloning;

public class ClassA implements Cloneable{
	
	
	int id;
	String name;
	
	 ClassA(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		
	}
	
	void check()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	//below both methods can be used 
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public Object myclone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
