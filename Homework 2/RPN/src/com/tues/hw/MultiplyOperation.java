package com.tues.hw;

public class MultiplyOperation implements Operation {
	private static MultiplyOperation instance = null;
	
	private MultiplyOperation() {
		
	}
	
	public static MultiplyOperation getInstance() {
		if(instance == null) {
			return new MultiplyOperation();
		}
		return instance;
	}
	@Override
	public double execute(double op1, double op2) {
		return op1 * op2;
	}

}
