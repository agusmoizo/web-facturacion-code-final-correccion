package com.example.ProyectoFinalCoderHouse.Respuesta;

import java.io.Serializable;
import java.util.List;

import com.example.ProyectoFinalCoderHouse.Model.ProductoModel;




public class ProductoRespuesta implements Serializable{

	private static final long serialVersionUID = 1L;
	

	private String codigo; 

    private String mensaje;  

    private ProductoModel  cliente;

    private List<ProductoModel> lista; 

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ProductoModel getCliente() {
		return cliente;
	}

	public void setCliente(ProductoModel cliente) {
		this.cliente = cliente;
	}

	public List<ProductoModel> getLista() {
		return lista;
	}

	public void setLista(List<ProductoModel> lista) {
		this.lista = lista;
	}
    
    
    
}