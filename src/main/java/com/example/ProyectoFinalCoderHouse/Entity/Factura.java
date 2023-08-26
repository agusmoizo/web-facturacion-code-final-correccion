package com.example.ProyectoFinalCoderHouse.Entity;

import java.util.Date;

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
@Table(name = "FACTURA")
public class Factura {
	
	@Id //clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//relaciones
	@ManyToOne(targetEntity = Cliente.class)
	@JoinColumn(name="CLIENTE_ID")
	private Cliente cliente;
	
	
	//columnas
	@Column(name = "SUBTOTAL")
	private double subtotal;
	
	@Column(name = "TOTALPAGAR")
	private double totalpagar;
	
	@Column(name = "IVA")
	private double iva;
	
	@Column(name = "FECHAFACTURA")
	private Date fechafactura;
	
	@Column(name = "ESTADO")
	private int estado;

	public Factura(int id, Cliente cliente, double subtotal, double totalpagar, double iva, Date fechafactura,
			int estado) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.subtotal = subtotal;
		this.totalpagar = totalpagar;
		this.iva = iva;
		this.fechafactura = fechafactura;
		this.estado = estado;
	}

	public Factura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente_id() {
		return cliente;
	}

	public void setCliente_id(Cliente cliente) {
		this.cliente = cliente;
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

	@Override
	public String toString() {
		return "Factura [id=" + id + ", cliente_id=" + cliente + ", subtotal=" + subtotal + ", totalpagar="
				+ totalpagar + ", iva=" + iva + ", fechafactura=" + fechafactura + ", estado=" + estado + "]";
	}


}
