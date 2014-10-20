package com.tues.hw;

public class OperationFactory {
	public static Operation getOperation(String op) {
		switch(op) {
		case "+": return AddOperation.getInstance();
		case "-": return SubstractOperation.getInstance();
		case "*": return MultiplyOperation.getInstance();
		case "/": return DivideOperation.getInstance();
		case "^": return PowerOperation.getInstance();
		}
		
		throw new IllegalArgumentException();
	}
}
