package inheritance;

public class Student extends Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int id;
	String name;
	
	public Student() {
		System.out.println("student constructor");
	}
	
	void setid(int id )
	{
		this.id=id;
		
	}
	
	int getid()
	{
		
		return id;
		
	}

	void setname(String name )
	{
		this.name=name;
	}
	
	String getname()
	{
		return name;
	}
	
	void setaddress(String address )
	{
		super.address=address;
	}
	
	String getaddress()
	{
		return super.address;
	}
	
	void setteacherid(int id )
	{
		super.id=id;
		
	}
	
	int getteacherid()
	{
		
		return super.id;
		
	}

}
