package com.example.ProyectoFinalCoderHouse.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoFinalCoderHouse.Entity.DetalleFactura;
import com.example.ProyectoFinalCoderHouse.Model.DetalleFacturaModel;
import com.example.ProyectoFinalCoderHouse.Respuesta.DetalleFacturaRespuesta;
import com.example.ProyectoFinalCoderHouse.Service.DetalleFacturaService;

@RestController
public class DetalleFacturaController {

	@Autowired
	DetalleFacturaService detalleFacturaService;
	
	@GetMapping("/detallefactura")
	public DetalleFacturaRespuesta obtenerDetallesFacturas() {
		return detalleFacturaService.findAllModel();
	}
	// Crea un modelo de detalle de factura
	@PostMapping("/detallefactura/nuevo")
	public DetalleFactura crearDetalleFactura(@RequestBody DetalleFactura detalleFacturaModel) {
		return detalleFacturaService.crearDetalleFactura(detalleFacturaModel);
	}
}
