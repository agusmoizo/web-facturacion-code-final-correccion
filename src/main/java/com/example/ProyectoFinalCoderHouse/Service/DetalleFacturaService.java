package com.example.ProyectoFinalCoderHouse.Service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ProyectoFinalCoderHouse.Entity.DetalleFactura;
import com.example.ProyectoFinalCoderHouse.Model.DetalleFacturaModel;
import com.example.ProyectoFinalCoderHouse.Repository.DetalleFacturaRepository;
import com.example.ProyectoFinalCoderHouse.Respuesta.DetalleFacturaRespuesta;




@Component//con esta anotacion le decimos a spring que cree, configure y administre automáticamente instancias de esa clase, 
//en service se encuentra la logica de la app

public class DetalleFacturaService {
	@Autowired
	private DetalleFacturaRepository detalleFacturaRepository;
	@Autowired
	public DetalleFacturaService(DetalleFacturaRepository detalleFacturaRepository) {
		this.detalleFacturaRepository = detalleFacturaRepository;
	}
	
	// Crea un nuevo detalle de factura
	public DetalleFactura crearDetalleFactura(DetalleFactura detalleProducto) {
		DetalleFactura d= new DetalleFactura();
		System.out.println(detalleProducto.toString());
		d.setFactura_id(detalleProducto.getFactura_id());
		d.setProducto_id(detalleProducto.getProducto_id());
		d.setCantidad(detalleProducto.getCantidad());
		d.setPreciounitario(detalleProducto.getPreciounitario());
		d.setDescuento(detalleProducto.getDescuento());
		d.setPreciototal(detalleProducto.getPreciototal());
		d.setEstado(detalleProducto.getEstado());
		return detalleFacturaRepository.save(d);
	}
	// Busca un detalle de factura por su ID
	public Optional<DetalleFactura> buscarDetalleFacturaById(Long idDetalleFactura){
		return detalleFacturaRepository.findById(idDetalleFactura);
	}
	
	// Obtiene una respuesta con modelos de detalles de factura
	public DetalleFacturaRespuesta findAllModel() {
		DetalleFacturaRespuesta respuesta = new DetalleFacturaRespuesta();
		try {
			List<DetalleFactura> detallesfactura = detalleFacturaRepository.findAll();
			List<DetalleFacturaModel> detalleFacturaModel = new ArrayList<>();
			if (detallesfactura != null && detallesfactura.size() >0) {
				for (DetalleFactura df : detallesfactura) {
					detalleFacturaModel.add(crearModelo(df));
				}
				respuesta.setCodigo("1");
				respuesta.setMensaje("OK");
				respuesta.setLista(detalleFacturaModel);
				
			}else {
				respuesta.setCodigo("0");
				respuesta.setMensaje("No existe informacion");
			}
		} catch (Exception e) {
			respuesta.setCodigo("-1");
			respuesta.setMensaje("ERROR"+" "+e.getMessage());
		}
		return respuesta;
	}
	// Crea un modelo de detalle de factura a partir de un objeto DetalleFactura
	public DetalleFacturaModel crearModelo(DetalleFactura df) {
		DetalleFacturaModel modelo = new DetalleFacturaModel();
		
		if (String.valueOf(df.getId())!= null) {
			modelo.setId(df.getId());
		}
		if (String.valueOf(df.getFactura_id())!= null) {
			modelo.setFactura(df.getFactura_id());
		}
		if (String.valueOf(df.getProducto_id())!= null) {
			modelo.setProducto_id(df.getProducto_id());
		}
		if (String.valueOf(df.getCantidad())!= null) {
			modelo.setCantidad(df.getCantidad());
		}
		if (String.valueOf(df.getPreciounitario())!= null) {
			modelo.setPreciounitario(df.getPreciounitario());
		}
		if (String.valueOf(df.getDescuento())!= null) {
			modelo.setDescuento(df.getDescuento());
		}
		if (String.valueOf(df.getPreciototal())!= null) {
			modelo.setPreciototal(df.getPreciototal());
		}
		if (String.valueOf(df.getEstado()) != null) {
			modelo.setEstado(df.getEstado());
		}
		return modelo;
	}
}
