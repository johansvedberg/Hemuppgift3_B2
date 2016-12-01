package main;

//import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;

public class ThresholdScheme {

	public ThresholdScheme(double[] polynomial, double[] participants, double[] shares, double[] points) {

		PolynomialFunction privPoly = new PolynomialFunction(polynomial);

		shares[0] = privPoly.value(1);

		double myPoint = 0;
		for (double d : shares) {
			myPoint += d;

		}

		points[0] = myPoint;

		double deactivationCode = 0;

		for (int i = 0; i < points.length; i++) {
			double interpolation = 1;
			for (int j = 0; j < participants.length; j++) {

				if (i != j) {
					interpolation *= ((participants[j]) / (participants[j] - participants[i]));

				}

			}
			deactivationCode += interpolation * points[i];

		}

		// PolynomialFunctionLagrangeForm pub = new
		// PolynomialFunctionLagrangeForm(participants, points);

		// ((double[] values = pub.getCoefficients();

		System.out.println("Deactivation code: " + (int) deactivationCode);

	}

}
