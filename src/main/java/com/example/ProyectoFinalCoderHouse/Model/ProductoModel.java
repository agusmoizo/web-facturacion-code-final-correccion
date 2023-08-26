package com.example.ProyectoFinalCoderHouse.Model;

import java.io.Serializable;

public class ProductoModel  implements Serializable{
//clase base donde voy a crear cada modelo que necesito
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String descripcion;
	private String presentacion;
	private double preciocompra;
	private String proveedor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public double getPreciocompra() {
		return preciocompra;
	}
	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
	
}

