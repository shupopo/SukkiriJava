package practice_chap2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class problem1 {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		day +=100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
		System.out.println(f.format(future));
		
	}
}
