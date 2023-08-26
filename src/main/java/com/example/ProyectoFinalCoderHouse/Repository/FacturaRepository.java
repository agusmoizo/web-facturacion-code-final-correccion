package com.example.ProyectoFinalCoderHouse.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProyectoFinalCoderHouse.Entity.Cliente;
import com.example.ProyectoFinalCoderHouse.Entity.Factura;

@Repository //con esta anotacion utilizao las interfaces que extienden de jpa para manipluar la bd 
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    Optional<Factura> findByid(Integer id);

    Optional<Factura> findBycliente(Cliente c);
    
}

