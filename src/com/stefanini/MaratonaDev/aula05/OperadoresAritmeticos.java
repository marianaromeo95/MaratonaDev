package com.stefanini.MaratonaDev.aula05;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int soma = 10 + 5; // infix
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int mudulo = 10 % 5;


        int a = 10;

        a++; // postfix
        ++a; // prefix

        System.out.println(++a == 11);
        System.out.println(a++ == 11);
    }
}
