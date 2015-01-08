//Ross Lagoy weeklyPay.java
//1.2015 MIT courseware
//Creates a timesheet and payroll with specific conditions

public class weeklyPay {
	public static void weeklyPay(double x, double y) {
		if (y < 8) {
			System.out.println(y + " dollars is less than minimum wage");
		} else if (x > 60) {
			System.out.println(x + " hours/week" + " are " + (x - 40)
					+ " more than 60 hours/week and not allowed");
		} else {
			if (x > 40)
				System.out
						.println(((40 * y) + ((x - 40) * (y * 1.5)) + " dollars"));
		}
	}

	public static void main(String[] args) {
		weeklyPay(35, 7.5);
		weeklyPay(47, 8.2);
		weeklyPay(73, 10.0);
	}
}