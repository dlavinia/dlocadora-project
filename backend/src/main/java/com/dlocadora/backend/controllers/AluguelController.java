package com.dlocadora.backend.controllers;

import java.util.List;

import com.dlocadora.backend.models.*;
import com.dlocadora.backend.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/dlocadora")
@Api(value = "API rest da Dlocadora")
@CrossOrigin(origins = "*")

public class AluguelController {
    @Autowired
    AluguelRepository ar;

    @Autowired
    CarroRepository car;

    @Autowired
    ClienteRepository clr;

    @GetMapping("/alugueis")
    @ApiOperation(value = "Retorna todos os alugueis")
    public List<Aluguel> listaAlugueis(){
        return ar.findAll();
    }

    @PostMapping("/alugueis/{carro}/{cliente}")
    @ResponseBody
    @ApiOperation(value = "Efetua um aluguel")
    public Aluguel salvaAluguel (@RequestBody Aluguel aluguel,
    @PathVariable(value = "carro") long idCarro,
    @PathVariable(value = "cliente") long idCliente) {
        Carro carro = car.findByIdCarro(idCarro);
        Cliente cliente = clr.findByIdCliente(idCliente);

        carro.setAlugado(true);

        aluguel.setCarro(carro);
        aluguel.setCliente(cliente);

        return ar.save(aluguel);
    }

    @DeleteMapping("/alugueis/{id}")
    @ApiOperation(value = "Deleta um aluguel")
    public void deletaAluguel(@PathVariable(value = "id") long id){
        Aluguel aluguel = ar.findByIdAluguel(id);
        
        Carro carro = aluguel.getCarro();
        carro.setAlugado(false);
        car.save(carro);

        ar.delete(aluguel);
    }
}