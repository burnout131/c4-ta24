/**
 * 
 */
package com.example.demo.utils;

/**
 * @author Marc
 *
 */
public enum Trabajo {
	PROGRAMMER(2500), TESTER(1500), ADMINISTRATOR(1800);

	private int salario;

	Trabajo(int salario) {
		this.salario = salario;
	}

	public int getSalary() {
		return this.salario;
	}
}
