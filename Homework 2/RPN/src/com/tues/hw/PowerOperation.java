package com.tues.hw;

public class PowerOperation implements Operation {
	private static PowerOperation instance = null;
	
	private PowerOperation() {
		
	}
	
	public static PowerOperation getInstance() {
		if(instance == null) {
			return new PowerOperation();
		}
		return instance;
	}
	@Override
	public double execute(double op1, double op2) {
		return Math.pow(op2, op1);
	}

}
