package com.mrojo.ta24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrojo.ta24.dto.Empleado;

/**
 * @author Marc
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	public List<Empleado> findByTrabajo(String trabajo);
	
}
