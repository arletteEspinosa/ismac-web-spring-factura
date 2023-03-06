package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="DetalleFacturas")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_detalle_factura")
	private int idDetalleFactura;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="subtotal")
	private double subtotal;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="id_factura")
	private Factura factura;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="id_producto")
	private Producto producto;
	
	
	public DetalleFactura() {}
	
	public DetalleFactura(int idDetalleFactura,int cantidad,double subtotal) {
		this.idDetalleFactura=idDetalleFactura;
		this.cantidad=cantidad;
		this.subtotal=subtotal;
	}

	public DetalleFactura(int cantidad, double subtotal) {
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}

	public void setIdDFactura(int idDFactura) {
		this.idDetalleFactura=idDFactura;
	}
	public int getIdDFactura() {
		return idDetalleFactura;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	public double getCantidad() {
		return cantidad;
	}
	
	public void setDsubtotal(double subtotal) {
		this.subtotal=subtotal;
	}
	public double getDsubtotal() {
		return subtotal;
	}
	

	public Factura getFactura() {
		return factura;
	}

	@Autowired
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	@Override
	public String toString() {
		return "DetalleFactura [idDetalleFactura=" + idDetalleFactura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", producto=" + producto + "]";
	}
	
	


	

}
