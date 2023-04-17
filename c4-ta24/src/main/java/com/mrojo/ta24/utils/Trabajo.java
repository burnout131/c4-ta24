/**
 * 
 */
package com.mrojo.ta24.utils;

/**
 * @author Marc
 *
 */
public enum Trabajo {
	PROGRAMMER(2500), TESTER(1500), ADMINISTRATOR(1800);

	private double salario;

	Trabajo(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}
}
