package com.stefanini.MaratonaDev.aula04;

public class VetoresUnidimensionais {
    public static void main(String[] args) {
        int[] notas = new int[10];

        notas[0] = 1;
        notas[1] = 5;
        notas[2] = 9;
        notas[3] = 2;
        notas[4] = 4;
        notas[5] = 7;
        notas[6] = 8;

         /*notas[11] = 10; - ArrayIndexOutOfBoundsException */

        String[] carros = new String[]{"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"};

        System.out.println(carros.length);

        for (String carro : carros) {  // imprime todas as posicoes do array
            System.out.println(carro);
        }

      /*   for (int i = 0; i < notas.length; i++) {         // imprime todas as posicoes do array
             System.out.println(notas[i]);
          }*/

    }
}
