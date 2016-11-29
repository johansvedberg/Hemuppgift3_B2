package main;

import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;

public class ThresholdScheme {

	public ThresholdScheme(double[] polynomial, double[] participants, double[] shares, double[] points ) {

		PolynomialFunction privPoly = new PolynomialFunction(polynomial);

		// double[] shares = { privPoly.value(1), 75, 75, 54, 52, 77, 54, 43 };

		shares[0] = privPoly.value(1);

		double i = 0;
		for (double d : shares) {
			i = i + d;

		}

		//double[] y = { i, 2782, 30822, 70960, 256422 };
		
		points[0] = i;

		PolynomialFunctionLagrangeForm pub = new PolynomialFunctionLagrangeForm(participants, points);

		double[] values = pub.getCoefficients();

		System.out.println("Deactivation code: " + (int) values[0]);

	}

}
