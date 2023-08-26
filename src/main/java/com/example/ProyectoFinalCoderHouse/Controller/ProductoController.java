package com.example.ProyectoFinalCoderHouse.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoFinalCoderHouse.Entity.Producto;
import com.example.ProyectoFinalCoderHouse.Respuesta.ProductoRespuesta;
import com.example.ProyectoFinalCoderHouse.Service.ProductoService;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/producto")
    public ProductoRespuesta findAll() {
        return productoService.findAllModel();
    }

    //add new product
    @PostMapping("/producto/nuevo")
    public Producto addProducto(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }

    //getproduct by id
    @GetMapping("/producto/{idProducto}")
    public Producto getProductoById(@PathVariable Integer idProducto) {
        return productoService.buscarProductoById(idProducto).get();
    }

    //delete product
    @PostMapping("/producto/delete/{idProducto}")
    public void deleteProducto(@PathVariable Integer idProducto) {
        productoService.removerProductoById(idProducto);
    }
}
