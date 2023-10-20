package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.erudio.helper.Util;
import br.com.erudio.mathMethods.AllMathMethods;
import br.com.erudio.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) { 
			throw new UnsupportedMathOperationException("Please set a numeric value!");	
		}
		return AllMathMethods.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return AllMathMethods.subtraction(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return AllMathMethods.division(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable(value="numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return AllMathMethods.multiplication(numberOne, numberTwo);
		
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!Util.isNumeric(numberOne) || !Util.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return AllMathMethods.mean(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable(value = "numberOne") String numberOne) throws Exception {
		
		if(!Util.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return  AllMathMethods.squareRoot(numberOne);
	}

}
