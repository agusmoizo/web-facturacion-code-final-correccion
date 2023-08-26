package com.example.ProyectoFinalCoderHouse.Entity;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
//Utilizo el mapeo de spring para convertir mis modelos en tablas
	
	
	@Entity  
	@Table(name = "CLIENTE") //entidad cliente 
	public class Cliente {
		
		//su clave primaria
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		 
		//sus clumnas
		@Column(name = "NOMBRES")
		private String nombres;
		
		@Column(name = "APELLIDOS")
		private String apellidos;
		
		@Column(name = "RAZONSOCIAL")
		private String razonsocial;
		
		@Column(name = "CORREO")
		private String correo;
		
		@Column(name = "TELEFONO")
		private String telefono;
		
		@Column(name = "TIPOIDENTIFICACION")
		private Integer tipoidentificacion;
		
		@Column(name = "IDENTIFICACION")
		private String identificacion;

		public Cliente(Integer id, String nombres, String apellidos, String razonsocial, String correo, String telefono,
				Integer tipoidentificacion, String identificacion) {
			super();
			this.id = id;
			this.nombres = nombres;
			this.apellidos = apellidos;
			this.razonsocial = razonsocial;
			this.correo = correo;
			this.telefono = telefono;
			this.tipoidentificacion = tipoidentificacion;
			this.identificacion = identificacion;
		}

		public Cliente() {
			super();
			// TODO Auto-generated constructor stub
		}

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

		@Override
		public String toString() {
			return "Cliente [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", razonsocial="
					+ razonsocial + ", correo=" + correo + ", telefono=" + telefono + ", tipoidentificacion="
					+ tipoidentificacion + ", identificacion=" + identificacion + "]";
		}
		
}
