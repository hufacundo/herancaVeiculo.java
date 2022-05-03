package br.uniesp.POO.herancaVeiculo;

import javax.management.monitor.StringMonitor;

public class Veiculo {
    public String marca;
    public String modelo;

    public Veiculo(){
    }

    public Veiculo (String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public void tipoVeiculo(){
        System.out.println("O veiculo é um carro ou moto.");
    }

}
