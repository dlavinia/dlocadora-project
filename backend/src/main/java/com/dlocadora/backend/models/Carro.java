package com.dlocadora.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Carro
 */
@Entity
@Table(name = "carros_tb")
public class Carro {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long idCarro;

    private String modelo;
    private String marca;
    private String valorDiaria;
    private String placa;
    private boolean isAlugado;

    public long getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(long idCarro) {
        this.idCarro = idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(String valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isAlugado() {
        return isAlugado;
    }

    public void setAlugado(boolean isAlugado) {
        this.isAlugado = isAlugado;
    }
}