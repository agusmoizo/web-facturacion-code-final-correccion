package com.example.ProyectoFinalCoderHouse.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProyectoFinalCoderHouse.Entity.Cliente;
import com.example.ProyectoFinalCoderHouse.Model.ClienteModel;
import com.example.ProyectoFinalCoderHouse.Repository.ClienteRepository;
import com.example.ProyectoFinalCoderHouse.Respuesta.ClienteRespuesta;

//con esta anotacion le decimos a spring que cree, configure y administre automáticamente instancias de esa clase, 
//en service se encuentra la logica de la app

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	// Crea un nuevo cliente
	public Cliente crearCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	// Busca un cliente por su ID
	public Cliente buscarClienteById(Integer idCliente) {
		return clienteRepository.findById(idCliente).orElse(null);
	}

	// Obtiene una respuesta con modelos de cliente
	public ClienteRespuesta findAllModel() {
		ClienteRespuesta respuesta = new ClienteRespuesta();
		try {
			List<Cliente> clientes = clienteRepository.findAll();
			List<ClienteModel> clienteModel = new ArrayList<>();
			if (clientes != null && clientes.size() > 0) {
				for (Cliente c : clientes) {
					clienteModel.add(crearModelo(c));
				}
				respuesta.setCodigo("1");
				respuesta.setMensaje("OK");
				respuesta.setLista(clienteModel);

			} else {
				respuesta.setCodigo("0");
				respuesta.setMensaje("No existe informacion");
			}
		} catch (Exception e) {
			respuesta.setCodigo("-1");
			respuesta.setMensaje("ERROR" + " " + e.getMessage());
		}
		return respuesta;
	}

	// Crea un modelo de cliente a partir de un objeto Cliente
	public ClienteModel crearModelo(Cliente cliente) {
		ClienteModel modelo = new ClienteModel();
		if (String.valueOf(cliente.getId()) != null) {
			modelo.setId(cliente.getId());
		}
		if (cliente.getNombres() != null) {
			modelo.setNombres(cliente.getNombres());
		}
		if (cliente.getApellidos() != null) {
			modelo.setApellidos(cliente.getApellidos());
		}
		if (cliente.getRazonsocial() != null) {
			modelo.setRazonsocial(cliente.getRazonsocial());
		}
		if (cliente.getCorreo() != null) {
			modelo.setCorreo(cliente.getCorreo());
		}
		if (cliente.getTelefono() != null) {
			modelo.setTelefono(cliente.getTelefono());
		}
		if (cliente.getIdentificacion() != null) {
			modelo.setIdentificacion(cliente.getIdentificacion());
		}
		if (String.valueOf(cliente.getTipoidentificacion()) != null) {
			modelo.setTipoidentificacion(cliente.getTipoidentificacion());
		}
		return modelo;
	}

	public ClienteRespuesta updateProducto(Cliente cliente) {
		ClienteRespuesta clienteRespuesta = new ClienteRespuesta();
		try {
			List<ClienteModel>modelo=new ArrayList<ClienteModel>();
			if (buscarClienteById(cliente.getId()).getId() != null) {
				crearCliente(cliente);
				modelo.add(crearModelo(cliente));
				clienteRespuesta.setCodigo("1");
				clienteRespuesta.setMensaje("OK");
				clienteRespuesta.setLista(modelo);
			}

		} catch (Exception e) {
			clienteRespuesta.setCodigo("-1");
			clienteRespuesta.setMensaje("ERROR" + " " + e.getMessage());
		}
		return clienteRespuesta;
	}
}
