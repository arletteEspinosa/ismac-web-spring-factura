package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.ProductoDao;
import com.distribuida.entities.Producto;


@Service
public class ProductoServicelmpl implements ProductoService {

	@Autowired
	private ProductoDao productoDAO;

	@Override
	@Transactional
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoDAO.findAll();
	}

	@Override
	@Transactional
	public Producto findOne(int id) {
		// TODO Auto-generated method stub
		return productoDAO.findOne(id);
	}

	@Override
	@Transactional
	public void add(Producto producto) {
		// TODO Auto-generated method stub
		productoDAO.add(producto);
	}

//	@Override
//	@Transactional
//	public void up(Producto producto) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		productoDAO.del(id);
	}

	@Override
	@Transactional
	public List<Producto> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return productoDAO.findAll(busqueda);
	}

	@Override
	@Transactional
	public void add(String nombre, String descripcion, Double precio, int stock) {
		// TODO Auto-generated method stub
		Producto producto = new Producto (nombre,descripcion,precio,stock);
		productoDAO.add(producto);
	}

	@Override
	@Transactional
	public void up(int id_producto, String nombre, String descripcion, Double precio, int stock) {
		// TODO Auto-generated method stub
		Producto producto = new Producto (id_producto,nombre,descripcion,precio,stock);
		productoDAO.up(producto);
	}

	

	
	
}
