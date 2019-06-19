package javaapplication1;

import java.util.Random;

public class matrizteste {

    public static void main(String[] args) {
        int[][] matriz = new int[4][3];

        Random r = new Random();

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {

                System.out.println("Digite os valores:");
                matriz[l][c] = r.nextInt(5);

            }
        }
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {

                System.out.print(matriz[l][c] + " ");
            }
            System.out.println("");
        }
    }
}
