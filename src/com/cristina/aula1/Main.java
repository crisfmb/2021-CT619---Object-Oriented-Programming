package com.cristina.aula1;//nome do pacote

import java.util.Scanner;//biblioteca Scanner para leitura de valores

public class Main {//classe principal

    public static void main(String[] args) { //primeira função que o programa executa
        int variavelA;
        int variavelB;
        String nome;
        Scanner leitor = new Scanner(System.in);//criei o Scanner para ler os valores que o usuario digitar na tela(system.in)
        
        System.out.println("Digite um número: ");
        variavelA= leitor.nextInt();//passar para a variavel A o próximo inteiro digitado
        variavelB = leitor.nextInt();

        int resultado = soma(variavelA,variavelB);//enviando dois parametros para a função soma e retorna os valores

        System.out.println(resultado);
        Scanner leitorString = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = leitorString.nextLine();
        System.out.println("Nome digitado: " + nome);


    }

    public static int soma( int a, int b){
      return a + b;
    }
}
