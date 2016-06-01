package com.chapter1.dataabstraction;

public class _3Scope {

	//Scope entireClass
	private String instanceVariableEntireClass;

	public void testScope(String parameterVariable) {
		String localVariableEntireMethod; // block where they are defined
		if (true) {
			String localVariable2;
		}
		// prefix 'this' to avoid ambiguity
		this.instanceVariableEntireClass = "";
	}
}
