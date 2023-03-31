package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		String d = sdf.format(dt);
		System.out.println(d);
	}

}
