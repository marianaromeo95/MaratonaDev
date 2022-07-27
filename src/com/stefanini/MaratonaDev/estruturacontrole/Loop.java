package com.stefanini.MaratonaDev.estruturacontrole;

public class Loop {

    public static void main(String[] args) {
        int count = 10;

        // while
        while (count < 100) {
            System.out.println("count" + count);
            count++;
        }

        // do while
        int count2 = 10;

        do {
            System.out.println(count2);
            count2++;
        } while (count2 < 100);

        // for normal

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        // for com areas ausentes

        int i = 0;

        for (; i < 100;) {
            System.out.println(i);
            i++;
        }

        // for com todas as areas ausentes - usado geralmente para loop infinito

        for (;;) {
            System.out.println("for");
        }


    }
}
