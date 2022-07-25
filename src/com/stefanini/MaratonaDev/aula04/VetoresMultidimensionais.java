package com.stefanini.MaratonaDev.aula04;

public class VetoresMultidimensionais {

    public static void main(String[] args) {
        double[][] notasAlunos = new double[2][4];


        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 8;
        notasAlunos[0][2] = 7.5;
        notasAlunos[0][3] = 6.5;

        notasAlunos[1][0] = 3;
        notasAlunos[1][1] = 4.5;
        notasAlunos[1][2] = 6;
        notasAlunos[1][3] = 10;


        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
