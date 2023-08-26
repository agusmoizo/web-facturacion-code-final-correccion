package com.example.ProyectoFinalCoderHouse.Respuesta;

import java.io.Serializable;
import java.util.List;

import com.example.ProyectoFinalCoderHouse.Model.ClienteModel;

//en estas clases creo los atributos para almacenar la respuesta del servicio web, el mensaje asociado al servicio web,
//el cliente modelo y quedara todo almacenado en una lista de objetos. Lo mismo para todas las respuestas 


public class ClienteRespuesta implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String codigo;  

    private String mensaje;  

    private ClienteModel  cliente;

    private List<ClienteModel> lista;

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

	public ClienteModel getPaciente() {
		return cliente;
	}

	public void setPaciente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public List<ClienteModel> getLista() {
		return lista;
	}

	public void setLista(List<ClienteModel> lista) {
		this.lista = lista;
	}
    
    
}
