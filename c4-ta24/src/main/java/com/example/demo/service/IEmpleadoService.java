package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {

	// Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Listar todo

	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado CREATE

	public Empleado empleadoPorId(Long id); // Leer datos de un empleado READ

	public List<Empleado> listarEmpleadoPorTrabajo(String trabajo);// Listar empleados por trabajo

	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza datos del empleado UPDATE

	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE
}
