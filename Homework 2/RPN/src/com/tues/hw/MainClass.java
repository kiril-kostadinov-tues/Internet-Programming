package com.tues.hw;
import java.util.Stack;
import java.util.regex.Pattern;

public class MainClass {
	final static String Digits = "(\\p{Digit}+)";
	final static String HexDigits = "(\\p{XDigit}+)";
	final static String Exp = "[eE][+-]?" + Digits;
	final static String fpRegex = ("[\\x00-\\x20]*" + 
			"[+-]?(" + 
			"NaN|" + 
			"Infinity|" + 
			"(((" + Digits + "(\\.)?(" + Digits + "?)(" + Exp
			+ ")?)|" +
			"(\\.(" + Digits + ")(" + Exp + ")?)|" +
			"((" +
			"(0[xX]" + HexDigits + "(\\.)?)|" +
			"(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +
			")[pP][+-]?" + Digits + "))" + "[fFdD]?))" + "[\\x00-\\x20]*");
	
	public static void main(String[] args) {
		if (args.length > 0) {
			Stack<Double> stack = new Stack<Double>();
			for (String arg : args) {
				if (Pattern.matches(fpRegex, arg)) {
					stack.push(Double.parseDouble(arg));
				} else {
					if(stack.size() > 1) {
						stack.push(OperationFactory.getOperation(arg).execute(stack.pop(), stack.pop()));
					} else {
						System.out.println("Not enough arguments to function " + arg);
					}
				}
			}
			if(stack.size() > 0) {
				System.out.println(stack.pop());
			}
		} else {
			System.out.println("No arguments given...");
		}
	}
}
