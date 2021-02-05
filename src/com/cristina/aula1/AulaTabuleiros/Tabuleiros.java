package com.cristina.aula1.AulaTabuleiros;

public class Tabuleiros {

    public static void main(String[] args) {

        //Criou uma matriz 3x3 cheia de zeros
        int[][] tabuleiro = new int[3][3];

        //Vai imprimir o valor da primeira linha, primeira coluna
       // System.out.println(tabuleiro[0][0]);

        tabuleiro[0][0] = 1;

        System.out.println(tabuleiro[0][0] + "  |  " + tabuleiro[0][1] + "  |  "  + tabuleiro[0][2]);
        System.out.println("---------------");
        System.out.println(tabuleiro[1][0] + "  |  " + tabuleiro[1][1] + "  |  " + tabuleiro[1][2]);
        System.out.println("---------------");
        System.out.println(tabuleiro[2][0] + "  |  " + tabuleiro[2][1] + "  |  " + tabuleiro[2][2]);

        /*
        * 1 | 0 | 0
        * --------
        * 0 | 0 | 0
        * --------
        * 0 | 0 | 0
        * */

        /**
         * [0][0]   |   [0][1]   |   [0][2]
         * [1][0]   |   [1][1]   |   [1][2]
         * [2][0]   |   [2][1]   |   [2][2]
         */


    }
}