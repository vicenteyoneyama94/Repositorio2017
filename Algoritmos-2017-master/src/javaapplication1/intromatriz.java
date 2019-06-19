package javaapplication1;

public class intromatriz {

    public static void main(String[] args) {
        
        // Criando a matriz
        int[] vetor = new int[5];
        
        // Definindo comprimento do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 4;
        }
        
        // Definindo tamanho da matriz
        int[][] matriz = new int[3][4];

        // Percorrendo as linhas matriz
        for (int lin = 0; lin < 3; lin++) {

            // Percorrer colunas da matriz
            for (int col = 0; col < 4; col++) {
                // Preenchimento..
                matriz[lin][col] = lin * col;
            }
        }
        // Mostrando a matriz na saída
        for (int lin = 0; lin < 3; lin++) {

            for (int col = 0; col < 4; col++) {
                // Impressão das colunas na mesma linha
                // Println para quebrar a linha
                System.out.print(matriz[lin][col] + " " );
            }
            // Ao termino das colunas, um 
            // println para quebrar a linha
            System.out.println("");
        }
    }

}
