package main;

import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm;

public class ThresholdScheme {

	

	public ThresholdScheme() {

		
		double[] x = { 1, 2, 3, 5, 6};
		double[] y = { 275, 1908, 7677, 50751, 101700 };

		PolynomialFunctionLagrangeForm pub = new PolynomialFunctionLagrangeForm(x, y);
	
		double[] values = pub.getCoefficients();
		
		System.out.println(values[0]);

	}

}
