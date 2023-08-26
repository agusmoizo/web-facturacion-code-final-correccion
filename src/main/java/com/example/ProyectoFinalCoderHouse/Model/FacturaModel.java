package com.example.ProyectoFinalCoderHouse.Model;

import java.io.Serializable;
import java.util.Date;

//clase base donde voy a crear cada modelo que necesito
public class FacturaModel  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private int cliente_id;
	private double subtotal;
	private double totalpagar;
	private double iva;
	private Date fechafactura;
	private int estado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getTotalpagar() {
		return totalpagar;
	}
	public void setTotalpagar(double totalpagar) {
		this.totalpagar = totalpagar;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public Date getFechafactura() {
		return fechafactura;
	}
	public void setFechafactura(Date fechafactura) {
		this.fechafactura = fechafactura;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}

