package com.stefanini.MaratonaDev.aula09;

public class Principal {

    public static void main(String[] args) {
        Carro bmw = new Carro(); // invoca o construtor Carro da classe Carro

        bmw.setMarca("BMW");
        bmw.setModelo("M3");
        bmw.setQuilometrosPorLitro(7.5);
        bmw.setVelocidadeMaxima(280);

        Carro mercedes = new Carro("Mercedes", "c180"); // Como se fosse um set <<<<

        BMW bmw2 = new BMW();

        System.out.println(bmw2.calcularTaxaAceleracao(100.5, 10.5));



        System.out.println(mercedes.getMarca());
        System.out.println(mercedes.getModelo());
        System.out.println(mercedes.getQuilometrosPorLitro()); // default value
        System.out.println(mercedes.getVelocidadeMaxima());    // default value


        System.out.println(bmw.getMarca());
        System.out.println(bmw.getModelo());
        System.out.println(bmw.getQuilometrosPorLitro());
        System.out.println(bmw.getTaxaAceleracao());
        System.out.println(bmw.getVelocidadeMaxima());

        bmw.acelerar();
        bmw.frear();

        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
        System.out.println(bmw.calcularTaxaAceleracao(100, 5));

    }
}
