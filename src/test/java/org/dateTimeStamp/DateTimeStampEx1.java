package org.dateTimeStamp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeStampEx1 {
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS a");
		String d = sdf.format(dt);
		System.out.println(d);
//		d = d.replaceAll("/", "");
//		d = d.replaceAll(" ", "");
//		d = d.replaceAll(":", "");
		d = d.replaceAll("/", "").replaceAll(" ", "").replaceAll(":", "");
		System.out.println(d);
	}
	//Generic method
	public String getCurrentDateTime(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS a");
		return sdf.format(new Date());
	}
	public String getUniqueNumber(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS a");
		String d = sdf.format(new Date());
		return d.replaceAll("/", "").replaceAll(" ", "").replaceAll(":", "");
	}

}
