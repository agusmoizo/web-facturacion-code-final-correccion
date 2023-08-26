package com.example.ProyectoFinalCoderHouse.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ProyectoFinalCoderHouse.Entity.Producto;
import com.example.ProyectoFinalCoderHouse.Model.ProductoModel;
import com.example.ProyectoFinalCoderHouse.Repository.ProductoRepository;
import com.example.ProyectoFinalCoderHouse.Respuesta.ProductoRespuesta;


@Component //con esta anotacion le decimos a spring que cree, configure y administre automáticamente instancias de esa clase, 
           //en service se encuentra la logica de la app
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	//Crea un producto
	public Producto crearProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	//Busca un producto por ID
	public Optional<Producto> buscarProductoById(Integer idProducto){
		return productoRepository.findById(idProducto);
	}

	//remover producto por id
	public void removerProductoById(Integer idProducto) {
		productoRepository.deleteById(idProducto);
	}

	// Obtiene una respuesta con modelos producto
	public ProductoRespuesta findAllModel() {
		ProductoRespuesta respuesta = new ProductoRespuesta();
		try {
			List<Producto> productos = productoRepository.findAll();
			List<ProductoModel> productoModel = new ArrayList<>();
			if (productos != null && productos.size() >0) {
				for (Producto p : productos) {
					productoModel.add(crearModelo(p));
				}
				respuesta.setCodigo("1");
				respuesta.setMensaje("OK");
				respuesta.setLista(productoModel);
				
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
	
	public ProductoModel crearModelo(Producto producto) {
		ProductoModel modelo = new ProductoModel();
		if (String.valueOf(producto.getId()) !=  null ) {
			modelo.setId(producto.getId());
			}
		if (producto.getDescripcion() != null) {
			modelo.setDescripcion(producto.getDescripcion());
		}
		if (producto.getPresentacion() != null) {
			modelo.setPresentacion(producto.getPresentacion());
		}
		if (String.valueOf(producto.getPreciocompra()) != null) {
			modelo.setPreciocompra(producto.getPreciocompra());
		} 
		if (producto.getProveedor() != null) {
			modelo.setProveedor(producto.getProveedor());
		}
		
		return modelo;
	}
}
