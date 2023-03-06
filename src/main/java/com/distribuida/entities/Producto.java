package com.distribuida.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("beanProducto")
@Scope("prototype")
@Entity
@Table(name="Productos")


public class Producto{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_producto")
	private int idProducto;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precio")
	private double precio;
	@Column(name="stock")
	private int stock;

public Producto(){}
	public Producto (int idProducto,String nombre,String descripcion,double precio,int stock) {
	       this.idProducto=idProducto;
	       this.nombre=nombre;
	       this.precio=precio;
	       this.stock=stock;
	
}
	
	
public Producto(String nombre, String descripcion, double precio, int stock) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
public void setIdProducto(int idProducto) {
	this.idProducto=idProducto;
}
public int getIdProducto() {
	return idProducto;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}
public String getNombre() {
	return nombre;
}

public void setDescripcion (String descripcion) {
	this.descripcion=descripcion;
}
public String getDescripcion() {
	return descripcion;
}

public void setPrecio(double precio) {
	this.precio=precio;
}
public double getPrecio() {
	return precio;
}
public void setStock(int stock) {
	this.stock=stock;
}
public double getStock() {
	return stock;
}

@PostConstruct
public void despuesCreacionBean() {
	System.out.println("Se ejecutan tareas despues de la creacion del bean");
}
@PreDestroy
public void antesDestruccionBean() {
	System.out.println("Se ejecutan tareas antes de la destruccion del bean");
}
@Override
public String toString() {
	return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
			+ precio + ", stock=" + stock + "]";
}








}
