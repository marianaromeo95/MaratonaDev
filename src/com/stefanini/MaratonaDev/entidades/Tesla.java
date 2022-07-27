package com.stefanini.MaratonaDev.entidades;

import com.stefanini.MaratonaDev.orientacaoaobjeto.Carro;

public class Tesla extends Carro {

    private boolean dirigeSozinho;

    public  Tesla() {
        super();
    }

    @Override       // Sobreesctrita de um metodo
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("Tesla sobreescrita");
        return velocidadeFinal * tempoFinal;
    }

    public boolean isDirigeSozinho() {
        return dirigeSozinho;
    }

    public void setDirigeSozinho(boolean dirigeSozinho) {
        this.dirigeSozinho = dirigeSozinho;
    }
}
