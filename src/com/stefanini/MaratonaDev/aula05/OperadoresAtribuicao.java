package com.stefanini.MaratonaDev.aula05;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int a = 10; // operador de atribuicao
        int b = 5;

        b += a; // aditivo
        b -= a; // subtrativo
        b *= a; // multiplativo
        b /= a; // divisivo
        b %= a; // modular

        System.out.println(a % b); // devolve o resto de divisao
    }
}
