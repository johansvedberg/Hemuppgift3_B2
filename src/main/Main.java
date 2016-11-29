package main;

public class Main {
	public static void main(String args[]) {

		double[] polynomial = { 13, 8, 11, 1, 5 };

		double[] participants = { 1, 2, 4, 5, 7 };

		double[] shares = { 0, 75, 75, 54, 52, 77, 54, 43 };

		double[] points = { 0, 2782, 30822, 70960, 256422 };

		ThresholdScheme thresholdScheme = new ThresholdScheme(polynomial, participants, shares, points);

	}

}
