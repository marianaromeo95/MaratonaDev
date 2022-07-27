package com.stefanini.MaratonaDev.breakcontinue;

public class BreakContinue {

    public static void main(String[] args) {
        String[] carros = new String[]{"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla Model S"};

        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == "BMW i320") {
                System.out.println(carros[i]);
                break;                              // Força parar execução do loop
            }
            System.out.println(carros[i]);
        }

        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == "BMW i320") {
                System.out.println(carros[i]);
                continue;                              // Ignora tudo abaixo vvv & volta pro inicio da execucao do for
            }

            System.out.println("quero esse carro");
            System.out.println(carros[i]);
        }


    }
}
