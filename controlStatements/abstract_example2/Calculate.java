package abstract_example2;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plan p;
		
		p= new NormalPlan();
		p.rate();
		p.calculaterate(5);
		
		p=new DiscountPlan();
		p.rate();
		p.calculaterate(5);
	}

}
