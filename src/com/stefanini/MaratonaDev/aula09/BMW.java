package com.stefanini.MaratonaDev.aula09;

public class BMW extends Carro {

    @Override       // Sobreesctrita de um metodo
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        return velocidadeFinal / tempoFinal;
    }


}
