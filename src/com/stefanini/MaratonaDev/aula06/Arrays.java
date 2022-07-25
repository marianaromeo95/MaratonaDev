package com.stefanini.MaratonaDev.aula06;

public class Arrays {
    public static void main(String[] args) {
        int[] notas = new int[10];

        System.out.println(notas.length); // acessando o tamnho do meu array

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        String[] meses = new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio"};

        System.out.println(meses.length);

        for (String mes : meses) {
            System.out.println(mes);
        }

        int [][] matriz = new int[5][5];

        matriz[0][1] = 5;
        matriz[2][4] = 10;
        matriz[3][2] = 15;

        System.out.println(matriz[0][1]);
        System.out.println(matriz[2][4]);
        System.out.println(matriz[3][2]);

        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.println(coluna);
            }
        }



    }


}
