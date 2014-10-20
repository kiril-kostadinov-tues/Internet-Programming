package com.tues.hw;

public class SubstractOperation implements Operation {
	private static SubstractOperation instance = null;
	
	private SubstractOperation() {
		
	}
	
	public static SubstractOperation getInstance() {
		if(instance == null) {
			return new SubstractOperation();
		}
		return instance;
	}
	@Override
	public double execute(double op1, double op2) {
		return op2 - op1;
	}

}
