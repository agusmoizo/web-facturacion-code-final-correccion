package com.example.ProyectoFinalCoderHouse.Entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//Utilizo el mapeo de spring para convertir mis modelos en tablas
@Entity
@Table(name = "DETALLEFACTURA") // entidad detalle
public class DetalleFactura {

	@Id // clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(targetEntity = Factura.class)
	@JoinColumn(name = "FACTURA_ID")
	private Factura factura;

	@ManyToOne(targetEntity = Producto.class)
	@JoinColumn(name = "PRODUCTO_ID")
	private Producto producto;

	// columnas

	@Column(name = "CATIDAD")
	private int cantidad;

	@Column(name = "PRECIOUNITARIO")
	private Double preciounitario;

	@Column(name = "DESCUENTO")
	private Double descuento;

	@Column(name = "PRECIOTOTAL")
	private Double preciototal;

	@Column(name = "ESTADO")
	private Double estado;

	public DetalleFactura(int id, Factura factura,Producto producto, int cantidad, Double preciounitario,
			Double descuento, Double preciototal, Double estado) {
		super();
		this.id = id;
		this.factura = factura;
		this.producto = producto;
		this.cantidad = cantidad;
		this.preciounitario = preciounitario;
		this.descuento = descuento;
		this.preciototal = preciototal;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", factura_id=" + factura + ", producto_id=" + producto
				+ ", cantidad=" + cantidad + ", preciounitario=" + preciounitario + ", descuento=" + descuento
				+ ", preciototal=" + preciototal + ", estado=" + estado +  "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Factura getFactura_id() {
		return factura;
	}

	public void setFactura_id(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto_id() {
		return producto;
	}

	public void setProducto_id(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPreciounitario() {
		return preciounitario;
	}

	public void setPreciounitario(Double preciounitario) {
		this.preciounitario = preciounitario;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getPreciototal() {
		return preciototal;
	}

	public void setPreciototal(Double preciototal) {
		this.preciototal = preciototal;
	}

	public Double getEstado() {
		return estado;
	}

	public void setEstado(Double estado) {
		this.estado = estado;
	}
	

	public DetalleFactura() {
		super();
		// TODO Auto-generated constructor stub
	}

}
