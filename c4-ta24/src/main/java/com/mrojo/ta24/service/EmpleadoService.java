package com.mrojo.ta24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrojo.ta24.dao.IEmpleadoDAO;
import com.mrojo.ta24.dto.Empleado;

@Service
public class EmpleadoService implements IEmpleadoService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		return iEmpleadoDAO.findAll();
	}
	
	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoPorId(Long id) {
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public List<Empleado> listarEmpleadoPorTrabajo(String trabajo) {
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		iEmpleadoDAO.deleteById(id);
	}

}
