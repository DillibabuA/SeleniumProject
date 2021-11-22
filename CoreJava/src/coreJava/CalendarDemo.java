package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated metho
 Calendar h = Calendar.getInstance();
 SimpleDateFormat sd= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
 System.out.println(sd.format(h.getTime()));
 System.out.println(h.get(Calendar.DAY_OF_MONTH));
 System.out.println(h.get(Calendar.DAY_OF_WEEK_IN_MONTH));
 System.out.println(h.get(Calendar.DAY_OF_YEAR));
 System.out.println(h.get(Calendar.AM_PM));
 System.out.println(h.get(Calendar.HOUR_OF_DAY));
	}

}
