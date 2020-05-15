package com.dlocadora.backend.repositories;

import com.dlocadora.backend.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByIdCliente (long idCliente);
    
}