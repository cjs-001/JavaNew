package IfElse;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2023;
		
		boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
       // boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && y)
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
	}

}
