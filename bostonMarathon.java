//Ross Lagoy bostonMarathon.java
//1.2015 MIT courseware
//Finds minimum time within two corresponding lists of names and times

public class bostonMarathon {

	public static void main(String[] args) {

		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "Emily", "Daniel", "Neda",
				"Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };

		int var = times[0];
		String nam = names[0];

		for (int i = 0; i < names.length; i++) {
			if (var > times[i]) {
				var = times[i];
				nam = names[i];
			}
			if (i == names.length - 1) {
				System.out.println(nam + ":" + var);
			}
		}
	}
}