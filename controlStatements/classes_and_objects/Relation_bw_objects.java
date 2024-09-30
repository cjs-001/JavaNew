package classes_and_objects;

public class Relation_bw_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		three obj3 = new three();
		two obj2 = new two(obj3);
		one obj1 = new one(obj2);
		
		System.out.println(obj2.square(2));
		
	}
	
}

class one{
	
	two obj2;
	
	one(two obj2)
	{
		this.obj2=obj2;
	}
	
	double cube (double x)
	{
		double result = x*obj2.square(x);
		return result;
	}
	
}

class two{
	
	three obj3;
	
	two(three obj3)
	{
		this.obj3=obj3;
	}
	
	double square(double x)
	{
		
		double result =x*obj3.get(x);
		return result;
		
	}
	
	
}

class three{
	
	double get (double x)
	{
		return x;
	}
}
