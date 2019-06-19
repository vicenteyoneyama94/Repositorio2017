package javaapplication1;

import java.util.Random;

public class matrizelaborada {

    public static void main(String[] args) {
        // Classe para gerar valores aleatórios
        Random r = new Random();

        // Exemplo para gerar número inteiro até 9
        // Exibe um valor no console, nada mais
        // System.out.println("Número: " + r.nextInt(3));
        // Criando uma matriz de 5 linhas e 10 colunas
        int[][] matriz = new int[5][10];

        for (int l = 0; l < 5; l++) {

            for (int c = 0; c < 10; c++) {

                // Gerando um numero de 0 a 100
                // Armazenando na matriz
                matriz[l][c] = r.nextInt(101);
            }
        }
        /*
        //Menor valor
        int menor = 100;

        // Percorrendo a matriz
        for (int l = 0; l < 5; l++) {

            for (int c = 0; c < 10; c++) {

                if (menor > matriz[l][c]) {
                    menor = matriz[l][c];
                }
            }
        }
        // Após o for
        System.out.println("O menor valor é: " + menor);
        */
        ///////////////////////////////////////////////////////////
        // Maior valor
        int maior = 0;
        int col = 0, lin = 0;
        
        // Percorrendo a matriz
        for (int l = 0; l < 5; l++) {

            for (int c = 0; c < 10; c++) {

                if (maior < matriz[l][c]) {
                    maior = matriz[l][c];
                }
            }
        }
        // Após o for
        System.out.println("O maior valor é: "+ maior);
    }
}
