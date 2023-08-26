package com.example.ProyectoFinalCoderHouse.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.ProyectoFinalCoderHouse.Entity.Cliente;
import com.example.ProyectoFinalCoderHouse.Entity.Factura;
import com.example.ProyectoFinalCoderHouse.Model.FacturaModel;
import com.example.ProyectoFinalCoderHouse.Repository.FacturaRepository;
import com.example.ProyectoFinalCoderHouse.Respuesta.FacturaRespuesta;

@Component // con esta anotacion le decimos a spring que cree, configure y administre
			// automáticamente instancias de esa clase,
// en service se encuentra la logica de la app
public class FacturaService {
	@Autowired
	private FacturaRepository facturaRepository;

	@Autowired
	private ClienteService clienteService;

	// Crea una factura
	public Factura crearFactura(Factura factura) {
		factura.setFechafactura(obtenerFecha());
		return facturaRepository.save(factura);
	}

	// Busca una factura por su ID
	public List<Factura> buscarFacturaByClientId(Integer id) {
		Cliente c = clienteService.buscarClienteById(id);
		List<Factura> facturas = facturaRepository.findAll();
		List<Factura> facturasCliente = new ArrayList<>();
		for (Factura f : facturas) {
			if (f.getCliente_id().getId() == c.getId()) {
				facturasCliente.add(f);
			}
		}
		return facturasCliente;
	}

	// Obtiene una respuesta con modelos de factura
	public FacturaRespuesta findAllModel() {
		FacturaRespuesta respuesta = new FacturaRespuesta();
		try {
			List<Factura> facturas = facturaRepository.findAll();
			List<FacturaModel> facturaModel = new ArrayList<>();
			if (facturas != null && facturas.size() > 0) {
				for (Factura f : facturas) {
					facturaModel.add(crearModelo(f));
				}
				respuesta.setCodigo("1");
				respuesta.setMensaje("OK");
				respuesta.setLista(facturaModel);

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

	// Crea un modelo defactura a partir de un objeto factura
	public FacturaModel crearModelo(Factura factura) {
		FacturaModel modelo = new FacturaModel();

		if (String.valueOf(factura.getId()) != null) {
			modelo.setId(factura.getId());
		}
		if (String.valueOf(factura.getCliente_id()) != null) {
			modelo.setCliente_id(factura.getCliente_id().getId());
		}
		if (String.valueOf(factura.getSubtotal()) != null) {
			modelo.setSubtotal(factura.getSubtotal());
		}
		if (String.valueOf(factura.getTotalpagar()) != null) {
			modelo.setTotalpagar(factura.getTotalpagar());
		}
		if (String.valueOf(factura.getIva()) != null) {
			modelo.setIva(factura.getIva());
		}
		if (factura.getFechafactura() != null) {
			System.out.println(factura.getFechafactura().toString());
			modelo.setFechafactura(obtenerFecha());
		}
		if (String.valueOf(factura.getEstado()) != null) {
			modelo.setEstado(factura.getEstado());
		}

		return modelo;
	}

	public Date obtenerFecha() {
		String url = "https://worldtimeapi.org/api/timezone/America/Montevideo";
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Object> response = restTemplate.getForObject(url, Map.class);

		if (response != null) {
			String datetime = (String) response.get("datetime");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX");
			try {
				return dateFormat.parse(datetime);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	//delete factura
	public void deleteFactura(Integer id) {
		facturaRepository.deleteById(id);
	}

}
