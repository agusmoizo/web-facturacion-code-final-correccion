package com.example.ProyectoFinalCoderHouse.Respuesta;



import java.io.Serializable;
import java.util.List;

import com.example.ProyectoFinalCoderHouse.Model.DetalleFacturaModel;




public class DetalleFacturaRespuesta implements Serializable{


	private static final long serialVersionUID = 1L;

	private String codigo; 

    private String mensaje;  

    private DetalleFacturaModel  cliente;

    private List<DetalleFacturaModel> lista;

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

	public DetalleFacturaModel getCliente() {
		return cliente;
	}

	public void setCliente(DetalleFacturaModel cliente) {
		this.cliente = cliente;
	}

	public List<DetalleFacturaModel> getLista() {
		return lista;
	}

	public void setLista(List<DetalleFacturaModel> lista) {
		this.lista = lista;
	}
    
    
    
}

