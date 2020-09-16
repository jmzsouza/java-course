package section11.date.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class VL101Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date n1 = new Date();
		Date n2 = new Date(System.currentTimeMillis());
		Date n3 = new Date(0L);
		Date n4 = new Date(1000L * 60L * 60L * 5L);

		Date t1 = sdf1.parse("09/04/2020");
		Date t2 = sdf2.parse("09/04/2020 14:48:35");
		Date t3 = Date.from(Instant.parse("2020-04-09T14:57:15Z"));

		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
		System.out.println("t1: " + t1);
		System.out.println("t2: " + t2);
		System.out.println("t3: " + t3);
		System.out.println("----------------------------");
		System.out.println("n1: " + sdf2.format(n1));
		System.out.println("n2: " + sdf2.format(n2));
		System.out.println("n3: " + sdf2.format(n3));
		System.out.println("n4: " + sdf2.format(n4));
		System.out.println("t1: " + sdf2.format(t1));
		System.out.println("t2: " + sdf2.format(t2));
		System.out.println("t3: " + sdf2.format(t3));
		System.out.println("----------------------------");
		System.out.println("n1: " + sdf3.format(n1));
		System.out.println("n2: " + sdf3.format(n2));
		System.out.println("n3: " + sdf3.format(n3));
		System.out.println("n4: " + sdf3.format(n4));
		System.out.println("t1: " + sdf3.format(t1));
		System.out.println("t2: " + sdf3.format(t2));
		System.out.println("t3: " + sdf3.format(t3));

	}

}
