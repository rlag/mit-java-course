//Ross Lagoy GravityCalculator.java
//1.2015 MIT courseware
//Calculates position of falling object

public class GravityCalculator {
	public static void main(String[] args) {
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.5 * gravity * fallingTime * fallingTime;
		finalPosition = finalPosition + initialVelocity * fallingTime;
		finalPosition = finalPosition + initialPosition;
		System.out.println("The object's falling positon after " + fallingTime
				+ " seconds is " + finalPosition + "m.");
		double a = -9.81; // earths gravity in m/s^2
		double t = 10;
		double v = 0;
		double x = 0;
		double position = 0.5 * a * Math.pow(t, 2) + v * t + x;
		System.out.println(position);
	}
}