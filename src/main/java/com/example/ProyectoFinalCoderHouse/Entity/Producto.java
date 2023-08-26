package com.example.ProyectoFinalCoderHouse.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "PRESENTACION")
	private String presentacion;
	
	@Column(name = "PRECIOCOMPRA")
	private double preciocompra;
	
	@Column(name = "PROVEEDOR")
	private String proveedor;

	public Producto(Integer id, String descripcion, String presentacion, double preciocompra, String proveedor) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.preciocompra = preciocompra;
		this.proveedor = proveedor;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", presentacion=" + presentacion
				+ ", preciocompra=" + preciocompra + ", proveedor=" + proveedor + "]";
	}
	
	

}