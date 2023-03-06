package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.DetalleFacturaDao;
import com.distribuida.dao.FacturaDao;
import com.distribuida.dao.ProductoDao;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;


@Service
public class DetalleFacturaServicelmpl implements DetalleFacturaService {

	@Autowired
	private DetalleFacturaDao detalleFacturaDao;
	
	@Autowired
	private FacturaDao facturaDao;
	
	@Autowired
	private ProductoDao productoDao;
	

	@Override
	public List<DetalleFactura> findAll() {
		// TODO Auto-generated method stub
		return detalleFacturaDao.findAll();
	}

	@Override
	public DetalleFactura findOne(int id) {
		// TODO Auto-generated method stub
		return detalleFacturaDao.findOne(id);
	}

	@Override
	public void add(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub
		detalleFacturaDao.add(detalleFactura);
	}

	@Override
	public void up(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub
		detalleFacturaDao.up(detalleFactura);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		detalleFacturaDao.delete(id);
	}

	@Override
	public void add(int cantidad, double subtotal, int id_factura, int id_producto) {
		// TODO Auto-generated method stub
		
		Factura factura = facturaDao.findOne(id_factura);
		Producto producto = productoDao.findOne(id_producto);
		
		DetalleFactura detalleFactura = new DetalleFactura(cantidad,subtotal);
		detalleFactura.setFactura(factura);
		detalleFactura.setProducto(producto);
		
		
		detalleFacturaDao.add(detalleFactura);
		
	}

	@Override
	public void up(int idDetalleFactura, int cantidad, double subtotal, int id_factura, int id_producto) {
		// TODO Auto-generated method stub
		Factura factura = facturaDao.findOne(id_factura);
		Producto producto = productoDao.findOne(id_producto);
		
		
		DetalleFactura detalleFactura = new DetalleFactura(idDetalleFactura,cantidad,subtotal);
		detalleFactura.setFactura(factura);
		detalleFactura.setProducto(producto);
		
		
		detalleFacturaDao.add(detalleFactura);
	
		
	}

	
}
