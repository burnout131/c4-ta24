package com.mrojo.ta24.dto;

import com.mrojo.ta24.utils.Trabajo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Marc
 *
 */
@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "salario")
	private double salario;

	public Empleado() {

	}

	public Empleado(Long id, String nombre, String trabajo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = obtenerSalarioPorTrabajo(trabajo);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double obtenerSalarioPorTrabajo(String trabajo) {
		Trabajo[] trabajos_disponibles = Trabajo.values();

		for (Trabajo trabajos : trabajos_disponibles) {
			if (trabajos.name().equalsIgnoreCase(trabajo)) {
				return trabajos.getSalario();
			}
		}
		return 0;
	}

}
