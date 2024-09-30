package inheritance;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public Teacher() {
		// TODO Auto-generated constructor stub
		System.out.println("teacher constructor");
	}
	
	int id;
	String name;
	String address;
	float salary;
	
	void setid(int id )
	{
		this.id=id;
	}
	
	int getid()
	{
		return id;
	}

	void setsalary(int salary )
	{
		this.salary=salary;
	}
	
	float getsalary()
	{
		return salary;
	}
}
