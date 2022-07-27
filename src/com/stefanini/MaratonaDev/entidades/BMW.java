package com.stefanini.MaratonaDev.entidades;

import com.stefanini.MaratonaDev.orientacaoaobjeto.Carro;

public class BMW extends Carro {

    public BMW() {
        super();
    }


    @Override       // Sobreesctrita de um metodo
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        return velocidadeFinal / tempoFinal;
    }


}
