package section13.composition.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import section13.composition.models.entities.VL119Comment;
import section13.composition.models.entities.VL119Post;

public class VL119Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		VL119Comment c1 = new VL119Comment("Have a nice trip!");
		VL119Comment c2 = new VL119Comment("Wow that's awesome!");
		VL119Post p1 = new VL119Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);

		p1.addComment(c1);
		p1.addComment(c2);

		VL119Comment c3 = new VL119Comment("Good night");
		VL119Comment c4 = new VL119Comment("May the Force be with you");
		VL119Post p2 = new VL119Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorow", 12);

		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);

	}

}
