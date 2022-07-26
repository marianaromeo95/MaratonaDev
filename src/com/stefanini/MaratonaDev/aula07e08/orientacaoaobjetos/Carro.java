package com.stefanini.MaratonaDev.aula07e08.orientacaoaobjetos;

public class Carro {

    // Atributos
    private String marca;
    private String modelo;
    private String placa;
    private int chassi;
    private int roda;
    private int bancos;

    private int velocidade;

    // Constructor e overloads

    public Carro() {
        System.out.println("Construindo um carro");
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    // Metodos

    public String acelerar() {
        return velocidade + "km/5s";    // para retornar o valor de String preciso concatenar uma String no meu retorno.
    }

    // Getters and Setters - Encapsulamento para que os nossos atributos nao seja acessado diretamente. Proteger
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) { // String marca so existe dentro do meu metodo.
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getChassi() {
        return this.chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public int getRoda() {
        return this.roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getBancos() {
        return this.bancos;
    }

    public void setBancos(int bancos) {
        this.bancos = bancos;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}
