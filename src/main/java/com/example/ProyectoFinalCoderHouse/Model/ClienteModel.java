package com.example.ProyectoFinalCoderHouse.Model;

import java.io.Serializable;
//clase base donde voy a crear cada modelo que necesito
public class ClienteModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
    private Integer id;
	private String nombres;
	private String apellidos;
	private String razonsocial;
	private String correo;
	private String telefono;
	private Integer tipoidentificacion;
	private String identificacion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Integer getTipoidentificacion() {
		return tipoidentificacion;
	}
	public void setTipoidentificacion(Integer tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
}

