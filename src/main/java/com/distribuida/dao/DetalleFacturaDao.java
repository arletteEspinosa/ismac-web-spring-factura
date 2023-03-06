package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.DetalleFactura;


public interface DetalleFacturaDao {

public List<DetalleFactura> findAll();
	
	public DetalleFactura findOne(int id);
	
	public void add(DetalleFactura detalleFactura);
	
	public void up (DetalleFactura detalleFactura);
	
	public void delete(int id);
	
//	public List<DetalleFactura> findAll(String busqueda);
//	public void add1(DetalleFactura detalleFactura);
//	
	
}
