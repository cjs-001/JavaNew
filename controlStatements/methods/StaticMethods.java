package methods;

public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex q=new ex("charan", 26);
		q.asd();
		ex.er();
	}

}


class ex{
	
	static String a="girish";
	static int i;
	String d= "charan";
	static String str="fgh";
	
	ex(String x,int z)
	{
		a=x;
		i=z;
	}
	
	public static void er()
	{
		System.out.println(str);
		str="charan";
		System.out.println(str);
		
	}
	
	public static void dsa()
	{
		//to access non static variables in static method
		ex x= new ex(a, i);
		System.out.println(x.d + " age is " + i);
	}
	
	public static void asd() {
		//we have to declare variables as static to access in static methods
		System.out.println(a + " age is " + i);
	}
}
