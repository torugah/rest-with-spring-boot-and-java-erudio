package br.com.erudio.mathMethods;

import br.com.erudio.helper.Util;

public class AllMathMethods {

	public static Double sum(String num1, String num2) {
		return Util.convertToDouble(num1) + Util.convertToDouble(num2);
	}
	
	public static Double subtraction(String num1, String num2) {
		return Util.convertToDouble(num1) - Util.convertToDouble(num2);
	}
	
	public static Double division(String num1, String num2) {
		return Util.convertToDouble(num1) / Util.convertToDouble(num2);
	}
	
	public static Double multiplication(String num1, String num2) {
		return Util.convertToDouble(num1) * Util.convertToDouble(num2);
	}
	
	public static Double mean(String num1, String num2) {
		return (Util.convertToDouble(num1) + Util.convertToDouble(num2)) / 2;
	}
	
	public static Double squareRoot(String num1) {
		return Math.sqrt(Util.convertToDouble(num1));
	}
	
}
