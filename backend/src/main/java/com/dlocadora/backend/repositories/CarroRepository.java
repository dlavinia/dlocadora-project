package com.dlocadora.backend.repositories;

import com.dlocadora.backend.models.Carro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    Carro findByIdCarro(long idCarro);
    Carro findByPlaca(String placa);
    
}