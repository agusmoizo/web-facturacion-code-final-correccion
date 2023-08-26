package com.example.ProyectoFinalCoderHouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProyectoFinalCoderHouse.Entity.Producto;

@Repository //con esta anotacion utilizao las interfaces que extienden de jpa para manipluar la bd 
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    
}