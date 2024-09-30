package abstract_example2;

public abstract class Plan {

	protected int rate;
	
	abstract public  void rate();
	
	public void calculaterate(int units)
	{
		System.out.print("Bill Amount for units "+units +" units = ");
		System.out.println(rate*units);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	


}
