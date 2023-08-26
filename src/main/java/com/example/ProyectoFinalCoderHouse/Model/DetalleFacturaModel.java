package com.example.ProyectoFinalCoderHouse.Model;

import java.io.Serializable;

import com.example.ProyectoFinalCoderHouse.Entity.Factura;
import com.example.ProyectoFinalCoderHouse.Entity.Producto;

//clase base donde voy a crear cada modelo que necesito
public class DetalleFacturaModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private Factura factura;
	private Producto producto;
	private int cantidad;
	private Double preciounitario;
	private Double descuento;
	private Double preciototal;
	private Double estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
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

}
