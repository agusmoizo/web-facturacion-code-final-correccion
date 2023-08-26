package com.example.ProyectoFinalCoderHouse.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoFinalCoderHouse.Entity.Factura;
import com.example.ProyectoFinalCoderHouse.Respuesta.FacturaRespuesta;
import com.example.ProyectoFinalCoderHouse.Service.FacturaService;

@RestController
public class FacturaController {

	@Autowired
	private FacturaService facturaService;

	// obtener todas las facturas
	@GetMapping("/factura")
	public FacturaRespuesta findAll() {
		return facturaService.findAllModel();
	}

	// obtener factura por id
	@GetMapping("/factura/{idCliente}")
	public List<Factura> getFacturaById(@PathVariable Integer idCliente) {
		return facturaService.buscarFacturaByClientId(idCliente);
	}

	// crear factura
	@PostMapping("/factura/nueva")
	public Factura addFactura(@RequestBody Factura factura) {
		return facturaService.crearFactura(factura);
	}

	// delete Factura
	@PostMapping("/factura/delete/{id}")
	public void deleteFactura(@PathVariable Integer id) {
		facturaService.deleteFactura(id);
	}

	@DeleteMapping("/factura/delete/{id}")
	public void deleteFactura2(@PathVariable Integer id) {
		facturaService.deleteFactura(id);
	}
}
