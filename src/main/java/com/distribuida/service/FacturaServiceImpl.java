package com.distribuida.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ClienteDao;
import com.distribuida.dao.FacturaDao;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

@Service
public class FacturaServiceImpl implements FacturaService {

	@Autowired
	private FacturaDao facturaDao;
	
	@Autowired
	private ClienteDao clienteDao;

	@Override
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return facturaDao.findAll();
	}

	@Override
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		return facturaDao.findOne(id);
	}

	@Override
	public void add(Date fecha, double total_neto,double iva, double tota,int id_cliente) {
		// TODO Auto-generated method stub
		Cliente cliente = clienteDao.findOne(id_cliente);
		
		Factura factura1= new Factura(new Date(), 22.22, 0.12,25.36, cliente);
		factura1.setCliente(cliente);
		facturaDao.add(factura1);
	}
	
	@Override
	public void up(int id_factura,Date fecha, double total_neto,double iva, double tota,int id_cliente) {
		// TODO Auto-generated method stub
       Cliente cliente = clienteDao.findOne(id_cliente);
       Factura factura= facturaDao.findOne(id_factura);
		
		factura.setFecha(fecha);
		factura.setTotalNeto(total_neto);
		factura.setIva(iva);
		factura.setTotal(tota);
		factura.setCliente(cliente);
		
		facturaDao.add(factura);
	}
	

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		facturaDao.del(id);
	}

	@Override
	public List<Factura> findAll(String bsuqueda) {
		// TODO Auto-generated method stub
		return facturaDao.findAll(bsuqueda);
	}



	
	

	
}
