package com.example.ProyectoFinalCoderHouse.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ProyectoFinalCoderHouse.Entity.Cliente;
import com.example.ProyectoFinalCoderHouse.Respuesta.ClienteRespuesta;
import com.example.ProyectoFinalCoderHouse.Service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/clientes")
	public ClienteRespuesta getAll() {
		return clienteService.findAllModel();
	}

	@PostMapping("/clientes/nuevo")
	public Cliente createANew(@RequestBody Cliente c) {
		return clienteService.crearCliente(c);
	}

	@PostMapping("/clientes/updatecliente")
	public ClienteRespuesta actualizarCliente(@RequestBody Cliente cliente) {
		return clienteService.updateProducto(cliente);
	}

}
