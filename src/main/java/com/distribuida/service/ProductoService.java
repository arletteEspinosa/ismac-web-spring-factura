package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Producto;

public interface ProductoService {

	public List<Producto> findAll();

	public Producto findOne(int id);

	public void add(Producto producto);

	//public void up(Producto producto);

	public void del(int id);
	
	//Resto de consultas
	
	public List<Producto> findAll(String busqueda);
	
	public void add(String nombre,String descripcion,Double precio, int stock);
	
	public void up(int id_producto,String nombre,String descripcion,Double precio, int stock);

	
}
