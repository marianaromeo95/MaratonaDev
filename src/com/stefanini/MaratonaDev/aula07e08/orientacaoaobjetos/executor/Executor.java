package com.stefanini.MaratonaDev.aula07e08.orientacaoaobjetos.executor;

import com.stefanini.MaratonaDev.aula07e08.orientacaoaobjetos.BMW;
import com.stefanini.MaratonaDev.aula07e08.orientacaoaobjetos.Carro;
import com.stefanini.MaratonaDev.aula07e08.orientacaoaobjetos.Mercedes;

public class Executor {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Volkwagen");
        System.out.println(carro2.getMarca());

        carro1.setMarca("BMW");
        carro1.setBancos(2);
        carro1.setChassi(1000);
        carro1.setModelo("Z3");
        carro1.setPlaca("JKL0234");
        carro1.setRoda(18);
        carro1.setVelocidade(200);

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getBancos());
        System.out.println(carro1.getChassi());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getPlaca());
        System.out.println(carro1.getRoda());

        System.out.println(carro1.acelerar());

        System.out.println(Executor.soma(4,5));
        System.out.println(Executor.soma(3,5,2));

        BMW bmw = new BMW();
        bmw.setVelocidade(40);
        System.out.println(bmw.acelerar());

        Mercedes mercedes = new Mercedes();
        System.out.println(mercedes.acelerar());
    }

    public static int soma(int a, int b) {          // Overload examples
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }
}
