package com.tues.hw;

public class DivideOperation implements Operation {
	private static DivideOperation instance = null;
	
	private DivideOperation() {
		
	}
	
	public static DivideOperation getInstance() {
		if(instance == null) {
			return new DivideOperation();
		}
		return instance;
	}
	@Override
	public double execute(double op1, double op2) {
		return op2 / op1;
	}

}
