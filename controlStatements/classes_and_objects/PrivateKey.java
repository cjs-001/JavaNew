package classes_and_objects;


public class PrivateKey {

	public static void main(String[] args) {

		AnotherClass.name="asd";
		AnotherClass.talk();
		
		
	}

}

class AnotherClass{
	
	protected static String name="raju";
	private static String age="28";
	
	
	public static void talk()
	{
		System.out.println("name= "+name + " age= "+age);
	}
}

