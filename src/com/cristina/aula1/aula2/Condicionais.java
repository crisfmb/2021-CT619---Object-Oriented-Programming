package com.cristina.aula1.aula2;

public class Condicionais {


    public static void main(String[] args) {

        int a = 11;
        int b = 20;
        if (a>10){

            System.out.println("A é maior que 10!");
        }
        if (a == 10){
            System.out.println("A é igual a 10");

        }
        if (a!=10){
            System.out.println("A é diferente de 10");
        }
        if(a>=10){
            System.out.println("A é maior igual a 10");
        }
        System.out.println("Bom dia");

        if(a>10 && a<20){
            System.out.println("O valor esta entre 10 e 20");
        }

        if(a==10 || a==15 ){
            System.out.println("A é 10 ou 15");
        }

        if(a + 10 > 20){
            System.out.println("A + 10 é maior que 20");
        }

        if(a % 2 == 0){
            System.out.println("O número é par");
        }

        if(a % 2 == 1){
            System.out.println("O numero e impar");
        }

        if(a >10 && b > 10){
            System.out.println("Os dois valores sao maiores que 10 ");
        }

        if((a > 10 && b < 100) || a % 2 == 0){

        }

        /*
        *   X    |          |
        * ---------------------------
        *        |    O     |
        * ---------------------------
        *
        *
        *
        *
        * */

        /*Condicional com E (&&) , se uma condição for FALSA não entra
        * Condicional com OU (||), se uma doncição for VERDADEIRA já entra
        * */

    }
}
