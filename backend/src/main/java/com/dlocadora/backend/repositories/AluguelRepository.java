package com.dlocadora.backend.repositories;

import com.dlocadora.backend.models.Aluguel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
    Aluguel findByIdAluguel (long idAluguel);
    
}