package com.dlocadora.backend.controllers;

import java.util.List;

import com.dlocadora.backend.models.Cliente;
import com.dlocadora.backend.repositories.ClienteRepository;

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

public class ClienteController {
    @Autowired
    ClienteRepository cr;

    @GetMapping("/clientes")
    @ApiOperation(value = "Retorna todos os clientes")
    public List<Cliente> listaClientes(){
        return cr.findAll();
    }

    @PostMapping("/clientes")
    @ResponseBody
    @ApiOperation(value = "Salva um cliente")
    public Cliente salvaCliente (@RequestBody Cliente cliente) {
        return cr.save(cliente);
    }

    @DeleteMapping("/clientes/{id}")
    @ApiOperation(value = "Deleta um cliente")
    public void deletaCarro(@PathVariable(value = "id") long id){
       Cliente cliente = cr.findByIdCliente(id);
        cr.delete(cliente);
    }
}