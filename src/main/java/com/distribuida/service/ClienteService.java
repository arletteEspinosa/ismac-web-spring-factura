package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Cliente;

public interface ClienteService {
	
	
	public List<Cliente> findAll();

	public Cliente findOne(int id);

	public void add(Cliente cliente);

	// public void up(Cliente cliente);

	public void del(int id);
	
	//Resto de consultas
	
	public List<Cliente> findAll(String busqueda);
	
	public void add(String cedula,String nombre,String apellido, int edad, Date fecha, String direccion, String telefono,String correo);
	
	public void up(int idCliente,String cedula,String nombre,String apellido, int edad, Date fecha, String direccion, String telefono,String correo);

	
	
}
