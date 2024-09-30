package inheritance;

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = new Student();
		std.setname("adarsh");
		std.setid(2);
		std.setaddress("arsikere");
		std.setteacherid(10);
		
		
		System.out.println(std.getname());
		System.out.println(std.getid());
		System.out.println(std.getaddress());
		System.out.println(std.getteacherid());
		
	}

}
