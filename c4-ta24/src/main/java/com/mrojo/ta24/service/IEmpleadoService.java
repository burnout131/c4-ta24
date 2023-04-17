package com.mrojo.ta24.service;

import java.util.List;

import com.mrojo.ta24.dto.Empleado;

public interface IEmpleadoService {

	// Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Listar todo

	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado CREATE

	public Empleado empleadoPorId(Long id); // Leer datos de un empleado READ

	public List<Empleado> listarEmpleadoPorTrabajo(String trabajo);// Listar empleados por trabajo

	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza datos del empleado UPDATE

	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE
}
