package com.example.ProyectoFinalCoderHouse.Respuesta;



import java.io.Serializable;
import java.util.List;

import com.example.ProyectoFinalCoderHouse.Model.FacturaModel;





public class FacturaRespuesta implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private String codigo; 

    private String mensaje;  

    private FacturaModel  cliente;

    private List<FacturaModel> lista;

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

	public FacturaModel getCliente() {
		return cliente;
	}

	public void setCliente(FacturaModel cliente) {
		this.cliente = cliente;
	}

	public List<FacturaModel> getLista() {
		return lista;
	}

	public void setLista(List<FacturaModel> lista) {
		this.lista = lista;
	} 
    
    
    

}
