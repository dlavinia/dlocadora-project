package com.dlocadora.backend.controllers;

import java.util.List;

import com.dlocadora.backend.models.Carro;
import com.dlocadora.backend.repositories.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

public class CarroController {
    @Autowired
    CarroRepository cr;

    @GetMapping("/carros")
    @ApiOperation(value = "Retorna todos os carros")
    public List<Carro> listaCarros(){
        return cr.findAll();
    }

    @GetMapping("/carros/id/{id}")
    @ApiOperation(value = "Retorna um carro por seu id/codigo único")
    public Carro buscarCarroId(@PathVariable(value = "id") long id){
        return cr.findByIdCarro(id);
    }

    @GetMapping("/carros/placa/{placa}")
    @ApiOperation(value = "Retorna um carro por sua placa")
    public Carro buscarCarroPlaca(@PathVariable(value = "placa") String placa){
        return cr.findByPlaca(placa);
    }

    @PostMapping("/carros")
    @ResponseBody
    @ApiOperation(value = "Salva um carro")
    public Carro salvaCarro (@RequestBody Carro carro) {
        return cr.save(carro);
    }

    @DeleteMapping("/carros/{id}")
    @ApiOperation(value = "Deleta um carro")
    public void deletaCarro(@PathVariable(value = "id") long id){
        Carro carro = cr.findByIdCarro(id);
        cr.delete(carro);
    }

    @PutMapping("/carros")
    @ApiOperation(value = "Atualiza dados de um carro")
    public Carro atualizaCarro(@RequestBody Carro carro){
        return cr.save(carro);
    }
}