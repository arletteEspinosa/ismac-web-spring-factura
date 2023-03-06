package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Producto;

public interface ProductoDao {

public List<Producto> findAll();
	
	public Producto findOne(int id);
	
	public void add(Producto producto);
	
	public void up (Producto producto);
	
	public void del (int id);
	
	public List<Producto> findAll(String busqueda);
	public void add1(Producto producto);
	
}
