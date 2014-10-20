package com.tues.hw;

public class AddOperation implements Operation {
	private static AddOperation instance = null;
	
	private AddOperation() {
		
	}
	
	public static AddOperation getInstance() {
		if(instance == null) {
			return new AddOperation();
		}
		return instance;
	}
	
	@Override
	public double execute(double op1, double op2) {
		return op1 + op2;
	}

}
