package abstract_example1;

public abstract class Car {
	
	int regno;
	
	public Car(int regno) {
		// TODO Auto-generated constructor stub
		this.regno=regno;
		
		
	}
	
	abstract void regno();
	
	
	
	void seatno()
	{
		System.out.println("5 seater");
	}
	
	abstract void fueltype();
	abstract void gearsystem();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
