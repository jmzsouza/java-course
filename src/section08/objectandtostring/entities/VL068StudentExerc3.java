package section08.objectandtostring.entities;

public class VL068StudentExerc3 {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public String message() {
		if (finalGrade() > 60) {
			return "Pass";
		} else {
			return "Failed" + String.format("%nMissing %.2f", missingPoints()) + " points";
		}
	}

	public double missingPoints() {
		return 60 - finalGrade();
	}
}
