package com.stefanini.MaratonaDev.aula07e08.orientacaoaobjetos;

public class Mercedes extends  Carro {

    public Mercedes() {
        this.setMarca("Mercedes");
    }

    @Override
    public String acelerar() {
        return "A Mercedes tem uma aceleracao diferente para cada modelo";
    }
}
