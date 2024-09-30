package classes_and_objects;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Calander_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cl= Calendar.getInstance();
		
		
		
		System.out.println(cl.get(Calendar.DATE));
		System.out.println(cl.get(Calendar.MONTH));
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.HOUR));
		System.out.println(cl.get(Calendar.MINUTE));
		System.out.println(cl.get(Calendar.SECOND));
		System.out.println(cl.get(Calendar.AM_PM));
		
		cl.set(2027, 9, 15);
		System.out.println(cl.get(Calendar.DATE));
		System.out.println(cl.get(Calendar.MONTH));
		System.out.println(cl.get(Calendar.YEAR));
		
		Date date = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		
		String str=df.format(date);
		System.out.println(str);
		
	}

}
